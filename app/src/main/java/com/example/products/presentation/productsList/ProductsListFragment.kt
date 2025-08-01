package com.example.products.presentation.productsList

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.products.R
import javax.inject.Inject
import javax.inject.Provider

class ProductsListFragment : Fragment(R.layout.fragment_products_list) {
//    @Inject
//    lateinit var viewModelFactory: Provider<ProductsListViewModelFactory>
//
//    private val viewModel: ProductsListViewModel by viewModels { viewModelFactory }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        val products = ProductsListViewModel.getProductsList()
//        val recyclerViewAdapter = ProductListAdapter(products)
//
//        val recyclerView: RecyclerView = findViewById(R.id.products_recycler_view)
//        recyclerView.layoutManager = GridLayoutManager(this)
//        recyclerView.adapter = recyclerViewAdapter
//    }
}


