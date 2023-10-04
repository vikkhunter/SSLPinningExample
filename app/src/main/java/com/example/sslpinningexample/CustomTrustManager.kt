package com.example.sslpinningexample

import java.security.cert.X509Certificate
import javax.net.ssl.X509TrustManager
import javax.security.cert.CertificateException

class CustomTrustManager : X509TrustManager {

    private val pinnedCertificate = ""

    override fun checkClientTrusted(chain: Array<out X509Certificate>?, authType: String?) {
        TODO("Not yet implemented")
    }

    override fun checkServerTrusted(chain: Array<out X509Certificate>?, authType: String?) {
        if (chain == null || chain.isEmpty()) {
            throw CertificateException("No certificate provided")
        }

        // Compare the server's certificate with the pinned certificate
        val serverCertificate = chain[0]
        if (!pinnedCertificate.contentEquals(serverCertificate.encoded.toString())) {
            throw CertificateException("Server certificate does not match pinned certificate")
        }
    }

    override fun getAcceptedIssuers(): Array<X509Certificate> {
        return emptyArray()
    }
}