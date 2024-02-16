package com.diangle.dianglprogrammingtest.domain.usecase

import com.diangle.dianglprogrammingtest.domain.model.PosterModel
import com.diangle.dianglprogrammingtest.domain.repository.PosterRepository
import com.diangle.dianglprogrammingtest.domain.usecase.base.UseCase

class GetPosterUseCase constructor(
    private val posterRepository: PosterRepository
) : UseCase<PosterModel, Any?>() {
    override suspend fun run(params: Any?): PosterModel {
        return posterRepository.getPosters()
    }

}