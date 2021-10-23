package com.splyndid.jobslide_android_kotlin.data

import retrofit2.Call
import retrofit2.http.GET
import com.splyndid.jobslide_android_kotlin.data.model.DataModel

interface ApiInterface {

    @GET("photos")
    fun getPhotos(): Call<List<DataModel>>

}
