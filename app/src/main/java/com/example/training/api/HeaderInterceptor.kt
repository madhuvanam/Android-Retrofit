package com.example.training.api

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder().addHeader( "User-Agent", "Madhu-reftrofit-sample").build()
        return chain.proceed(request)
    }
}