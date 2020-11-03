package org.codefornepal.nepalmap.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface APIService {
    @GET("/blog")
    suspend fun getProfile(): Response<Unit?>
}