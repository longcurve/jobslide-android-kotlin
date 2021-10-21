package com.splyndid.jobslide_android_kotlin.data

class DataContainer {
    // Since you want to expose userRepository out of the container, you need to satisfy
    // its dependencies as you did before
    private val retrofit: Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(LoginService::class.java)
    private val remoteDataSource: UserRemoteDataSource(retrofit)
    private val localDataSource: UserLocalDataSource()

    // userRepository is not private; it'll be exposed
    var userRepository: UserRepository(localDataSource, remoteDataSource)
}