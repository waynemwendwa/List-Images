package com.wayne.listimages

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val productsLists: List<Product>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = productsLists[position]
        holder.txtName.text = product.name
        holder.txtPrice.text = product.price.toString()
        holder.txtQuantity.text = product.quantity.toString()
        holder.imgProduct.setImageResource(product.image)

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, product.name, Toast.LENGTH_SHORT).show()
        }

        /*holder.txtName.setOnClickListener {
            val popupMenu = PopupMenu(holder.txtName.context, holder.txtName)
            popupMenu.menuInflater.inflate(R.menu.pop_up_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.item_delete-> {
                        Toast.makeText(holder.itemView.context, "Deleting", Toast.LENGTH_SHORT).show()
                    }
                }
                true
            }
        }*/
    }

    override fun getItemCount(): Int {
        return productsLists.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName: TextView = itemView.findViewById(R.id.txtProductName)
        val txtPrice: TextView = itemView.findViewById(R.id.txtPrice)
        val txtQuantity: TextView = itemView.findViewById(R.id.txtQuantity)
        val imgProduct: ImageView = itemView.findViewById(R.id.imgProduct)
    }

}