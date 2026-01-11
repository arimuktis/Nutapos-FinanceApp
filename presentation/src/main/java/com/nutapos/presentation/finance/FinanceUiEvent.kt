package com.nutapos.presentation.finance

sealed class FinanceUiEvent {
    data class ShowToast(val message: String) : FinanceUiEvent()
    object NavigateToDetails : FinanceUiEvent()
}