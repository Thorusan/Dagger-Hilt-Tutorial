package com.example.dagger_hilt_tutorial.networking

import javax.inject.Inject
import com.example.dagger_hilt_tutorial.networking.ApiHelper

class MainRepository @Inject constructor (private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}