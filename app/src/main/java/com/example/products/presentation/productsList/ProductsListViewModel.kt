package com.example.products.presentation.productsList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.products.domain.ProductRepository
import com.example.products.domain.model.ProductModel
import kotlinx.coroutines.launch
import javax.inject.Inject

class ProductsListViewModel @Inject constructor(
    private val productsLstRepository: ProductRepository
) : ViewModel() {

    init {
        getProductsList()
    }

    private val _liveData = MutableLiveData<List<ProductModel>>()
    val liveData: LiveData<List<ProductModel>> get() = _liveData

    private fun getProductsList() {
        viewModelScope.launch {
            _liveData.value = productsLstRepository.getProductsList()
        }
    }

    class Factory(
        private val productsLstRepository: ProductRepository
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            return super.create(modelClass)
        }
    }
}