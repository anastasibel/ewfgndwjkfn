package com.example.products.presentation.productsList

import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.products.R
import com.example.products.domain.model.ProductModel

class ProductListAdapter() : RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>() {

    val products: List<ProductModel> = mutableListOf()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: ProductViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return products.size
    }

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.product_image)
        val nameView = itemView.findViewById<TextView>(R.id.product_name)
        val priceView = itemView.findViewById<TextView>(R.id.product_price)
    }

    class ButtonsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val buttonFilterView = itemView.findViewById<Button>(R.id.filter_button)
        val buttonSortView = itemView.findViewById<Button>(R.id.sort_button)
    }

    class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val headerView = itemView.findViewById<TextView>(R.id.header_title)
    }
}