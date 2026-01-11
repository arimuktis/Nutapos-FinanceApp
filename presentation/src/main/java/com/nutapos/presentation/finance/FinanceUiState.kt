package com.nutapos.presentation.finance

import com.nutapos.domain.model.User

sealed class FinanceUiState {
    object Loading : FinanceUiState()
    data class Success(val data: List<User>) : FinanceUiState()
    data class Error(val message: String) : FinanceUiState()
}