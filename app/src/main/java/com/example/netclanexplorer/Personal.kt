package com.example.netclanexplorer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Personal : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_personal, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)

        // Create a list of PersonalItem objects with three sets of data
        val items = listOf(
            PersonalItem(R.drawable.im1, "Sophia", "New York City| Student", "Within 350 meters", "Coffee | ", "Sophia is a student in New York City, and she enjoys exploring the city in her free time, visiting museums, and trying out new restaurants."),
            PersonalItem(R.drawable.im2, "Ava", "Los Angeles | Actress", "Within 380 meters", "Coffee | ", "Ava is an aspiring actress living in Los Angeles. She loves attending auditions, going to acting classes, and exploring the city's entertainment scene."),
            PersonalItem(R.drawable.im3, "Isabella", "Miami| Beachgoer", "Within 310 meters", "Coffee | ", "Isabella is a beachgoer in Miami, spending her days soaking up the sun, swimming in the crystal-clear waters, and enjoying the vibrant beach culture.")
        )

        val adapter = PersonalAdapter(items)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        return view
    }


}
data class PersonalItem(
    val imageNo: Int,
    val Name: String,
    val loatction_Occupation:String,
    val distane_data:String,
    val tag_data:String,
    val descriptinon:String
)
