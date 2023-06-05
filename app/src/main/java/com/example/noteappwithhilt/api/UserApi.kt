package com.example.noteappwithhilt.api

import com.example.noteappwithhilt.model.UserRequest
import com.example.noteappwithhilt.model.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApi {

    @POST("/user/signUp")
    fun signUp(@Body userRequest: UserRequest) : Response<UserResponse>

    @POST("/user/signIn")
    fun signIn(@Body userRequest: UserRequest) : Response<UserResponse>

}