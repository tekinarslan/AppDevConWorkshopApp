package com.holidaypirates.data.di

import com.holidaypirates.data.remote.MovieGateway
import com.holidaypirates.data.remote.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepoModule {

    @Provides
    @Singleton
    fun provideMovieGateway(movieRepository: MovieRepository): MovieGateway = movieRepository
}