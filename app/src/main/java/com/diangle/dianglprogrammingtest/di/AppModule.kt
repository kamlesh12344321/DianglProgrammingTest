package com.diangle.dianglprogrammingtest.di

import com.diangle.dianglprogrammingtest.data.repository.PosterRepositoryImpl
import com.diangle.dianglprogrammingtest.data.source.local.PosterService
import com.diangle.dianglprogrammingtest.domain.repository.PosterRepository
import com.diangle.dianglprogrammingtest.domain.usecase.GetPosterUseCase
import com.diangle.dianglprogrammingtest.presentation.PostersViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val AppModule = module {
    viewModel { PostersViewModel(get()) }
    single { createGetPostsUseCase(get()) }
    single { createPostRepository(get()) }
}

fun createGetPostsUseCase(posterRepository: PosterRepository): GetPosterUseCase {
    return GetPosterUseCase(posterRepository)
}

fun createPostRepository(posterService: PosterService): PosterRepository {
    return PosterRepositoryImpl(posterService)
}

