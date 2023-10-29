package com.example.netclanexplorer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonalAdapter (private val items: List<PersonalItem>) : RecyclerView.Adapter<PersonalAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val locationOccupationTextView: TextView = itemView.findViewById(R.id.locationOccupationTextView)
        val distanceDataTextView: TextView = itemView.findViewById(R.id.distanceDataTextView)
        val tagDataTextView: TextView = itemView.findViewById(R.id.tagDataTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.foxy, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.imageView.setImageResource(item.imageNo)
        holder.nameTextView.text = item.Name
        holder.locationOccupationTextView.text = item.loatction_Occupation
        holder.distanceDataTextView.text = item.distane_data
        holder.tagDataTextView.text = item.tag_data
        holder.descriptionTextView.text = item.descriptinon
    }

    override fun getItemCount(): Int {
        return items.size
    }
}
