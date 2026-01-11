package com.nutapos.presentation.finance

import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.nutapos.core.base.BaseFragment
import com.nutapos.presentation.databinding.FragmentFinanceBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FinanceFragment : BaseFragment<FragmentFinanceBinding>(
    FragmentFinanceBinding::inflate
) {

    private val viewModel: FinanceViewModel by viewModels()

    override fun setupUI() {
        viewModel.loadData(1)

        // Example click listener if you have a button in your XML
        // binding.btnNext.setOnClickListener { ... }
    }

    override fun observeViewModel() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewModel.state.collectLatest { state ->
                when (state) {
                    is FinanceUiState.Loading -> showLoading()
                    is FinanceUiState.Success -> showData(state.data)
                    is FinanceUiState.Error -> showError(state.message)
                }
            }
        }
    }

    private fun showLoading() {
        binding.progressBar.visibility = View.VISIBLE
        binding.textView.visibility = View.GONE
    }

    // Ensure 'data' type matches what is defined in your FinanceUiState.Success
    private fun showData(data: List<com.nutapos.domain.model.User>) {
        binding.progressBar.visibility = View.GONE
        binding.textView.visibility = View.VISIBLE
        binding.textView.text = data.toString()
    }

    private fun showError(message: String) {
        binding.progressBar.visibility = View.GONE
        binding.textView.visibility = View.VISIBLE
        binding.textView.text = message
    }
}