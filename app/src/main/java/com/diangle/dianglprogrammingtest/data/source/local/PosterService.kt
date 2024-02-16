package com.diangle.dianglprogrammingtest.data.source.local

import com.diangle.dianglprogrammingtest.domain.model.PosterModel

interface PosterService {

    suspend fun getPosters():PosterModel
}