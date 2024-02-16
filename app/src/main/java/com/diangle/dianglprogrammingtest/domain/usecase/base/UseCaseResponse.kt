package com.diangle.dianglprogrammingtest.domain.usecase.base

import com.diangle.dianglprogrammingtest.domain.model.ApiError

interface UseCaseResponse<Type> {

    fun onSuccess(result: Type)

    fun onError(apiError: ApiError?)
}

