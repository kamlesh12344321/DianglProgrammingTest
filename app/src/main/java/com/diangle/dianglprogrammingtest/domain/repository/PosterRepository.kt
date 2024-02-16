package com.diangle.dianglprogrammingtest.domain.repository

import com.diangle.dianglprogrammingtest.domain.model.PosterModel

interface PosterRepository {
    suspend fun getPosters(): PosterModel
}