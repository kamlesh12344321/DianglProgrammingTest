package com.diangle.dianglprogrammingtest.presentation

import androidx.lifecycle.ViewModel
import com.diangle.dianglprogrammingtest.domain.usecase.GetPosterUseCase

class PostersViewModel constructor(private val posterUseCase: GetPosterUseCase) : ViewModel() {
}