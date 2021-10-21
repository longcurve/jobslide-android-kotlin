package com.splyndid.jobslide_android_kotlin.data

import com.splyndid.jobslide_android_kotlin.data.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("photos")
    fun getPhotos(): Call<List<DataModel>>

}
