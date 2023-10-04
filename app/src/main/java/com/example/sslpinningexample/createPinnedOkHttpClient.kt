package com.example.sslpinningexample

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

fun createPinnedOkHttpClient(): OkHttpClient {
    val trustManager = CustomTrustManager()
    
    return OkHttpClient.Builder()
        .sslSocketFactory(
            TLSSocketFactory(trustManager), // Use your TLSSocketFactory implementation
            trustManager
        )
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()
}


