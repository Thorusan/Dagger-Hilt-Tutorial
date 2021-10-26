package com.example.dagger_hilt_tutorial.networking

import com.example.dagger_hilt_tutorial.data.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>

}