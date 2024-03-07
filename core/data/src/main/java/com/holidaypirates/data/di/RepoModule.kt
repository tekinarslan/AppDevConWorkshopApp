package com.holidaypirates.data.di

import com.holidaypirates.data.remote.graphql.RickyAndMortyRepository
import com.holidaypirates.data.remote.graphql.RickyMortyGateway
import com.holidaypirates.data.remote.rest.MovieGateway
import com.holidaypirates.data.remote.rest.MovieRepository
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

    @Provides
    @Singleton
    fun provideRickyAndMortyGateway(rickyAndMortyRepository: RickyAndMortyRepository): RickyMortyGateway = rickyAndMortyRepository
}