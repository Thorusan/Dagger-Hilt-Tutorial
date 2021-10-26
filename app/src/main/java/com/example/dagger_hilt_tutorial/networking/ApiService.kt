package com.example.dagger_hilt_tutorial.networking

import com.example.dagger_hilt_tutorial.data.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Response<List<User>>

}