package com.example.sslpinningexample

import java.net.InetAddress
import java.net.Socket
import javax.net.ssl.SSLSocketFactory

class TLSSocketFactory(trustManager: CustomTrustManager) : SSLSocketFactory() {
    override fun createSocket(s: Socket?, host: String?, port: Int, autoClose: Boolean): Socket {
        TODO("Not yet implemented")
    }

    override fun createSocket(host: String?, port: Int): Socket {
        TODO("Not yet implemented")
    }

    override fun createSocket(
        host: String?,
        port: Int,
        localHost: InetAddress?,
        localPort: Int
    ): Socket {
        TODO("Not yet implemented")
    }

    override fun createSocket(host: InetAddress?, port: Int): Socket {
        TODO("Not yet implemented")
    }

    override fun createSocket(
        address: InetAddress?,
        port: Int,
        localAddress: InetAddress?,
        localPort: Int
    ): Socket {
        TODO("Not yet implemented")
    }

    override fun getDefaultCipherSuites(): Array<String> {
        TODO("Not yet implemented")
    }

    override fun getSupportedCipherSuites(): Array<String> {
        TODO("Not yet implemented")
    }

}
