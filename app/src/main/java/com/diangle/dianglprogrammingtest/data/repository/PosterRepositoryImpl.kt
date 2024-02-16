package com.diangle.dianglprogrammingtest.data.repository

import com.diangle.dianglprogrammingtest.data.source.local.PosterService
import com.diangle.dianglprogrammingtest.domain.model.PosterModel
import com.diangle.dianglprogrammingtest.domain.repository.PosterRepository

class PosterRepositoryImpl(private val posterService: PosterService) : PosterRepository {
    override suspend fun getPosters(): PosterModel {
        return posterService.getPosters()
    }
}