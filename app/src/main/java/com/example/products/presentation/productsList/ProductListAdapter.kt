package com.example.products.presentation.productsList

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.products.R
import com.example.products.domain.model.ProductModel

class ProductListAdapter(private val products: List<ProductModel>) :
    RecyclerView.Adapter<ProductListAdapter.ProductViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_item, parent, false)

        return ProductViewHolder(itemView)
    }

    override fun onBindViewHolder(
        holder: ProductViewHolder,
        position: Int
    ) {
        holder.bind(products[position])
    }

    override fun getItemCount(): Int {
        return products.size
    }

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val imageView = itemView.findViewById<ImageView>(R.id.product_image)
        private val nameView = itemView.findViewById<TextView>(R.id.product_name)
        private val priceView = itemView.findViewById<TextView>(R.id.product_price)

        @SuppressLint("SetTextI18n")
        fun bind(product: ProductModel) {
            Glide.with(itemView.context)
                .load(product.image)
                .placeholder(R.drawable.product_placeholder)
                .error(R.drawable.error_image)
                .into(imageView)
            nameView.text = product.name
            priceView.text = "${product.price} ₽"
        }
    }

//    class ButtonsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        private val buttonFilterView = itemView.findViewById<Button>(R.id.filter_button)
//        private val buttonSortView = itemView.findViewById<Button>(R.id.sort_button)
//    }
//
//    class HeaderViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        private val headerView = itemView.findViewById<TextView>(R.id.header_title)
//    }
}