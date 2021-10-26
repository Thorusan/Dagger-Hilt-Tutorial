package com.example.dagger_hilt_tutorial.networking

import com.example.dagger_hilt_tutorial.data.User
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService): ApiHelper {
    override suspend fun getUsers(): Response<List<User>> {
        return apiService.getUsers()
    }
}