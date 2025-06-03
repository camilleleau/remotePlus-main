package com.remoteplus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.remoteplus.TVShowScreen
import com.remoteplus.TVShowViewModel
import com.remoteplus.TVShowRepositoryImpl
import com.remoteplus.TVApi
import com.remoteplus.GetTVShowsUseCaseImpl
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 👇 Moshi avec support Kotlin
        val moshi = Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build()

        val api = Retrofit.Builder()
            .baseUrl("https://api.tvmaze.com/")
            .addConverterFactory(MoshiConverterFactory.create(moshi)) // 👈 utilise le Moshi avec adaptateur Kotlin
            .build()
            .create(TVApi::class.java)

        val repository = TVShowRepositoryImpl(api)
        val useCase = GetTVShowsUseCaseImpl(repository)
        val viewModel = TVShowViewModel(useCase)

        setContent {
            TVShowScreen(viewModel)
        }
    }
}
