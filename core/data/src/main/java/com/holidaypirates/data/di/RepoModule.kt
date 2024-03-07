package com.holidaypirates.data.di

import com.holidaypirates.data.remote.NextflixGateway
import com.holidaypirates.data.remote.NextflixRepository
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
    fun provideNextflixGateway(
        nextflixRepository: NextflixRepository
    ): NextflixGateway = nextflixRepository
}