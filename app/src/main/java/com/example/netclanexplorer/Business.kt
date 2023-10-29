package com.example.netclanexplorer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Business : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_business, container, false)

        val fab = view.findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener {
        }
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView)
        val items = listOf(
            BuisnessItem("SO", "Sophia", "New York City| Student", "Within 350 meters", "Coffee | ", "Sophia is a student in New York City, and she enjoys exploring the city in her free time, visiting museums, and trying out new restaurants."),
            BuisnessItem("AV", "Ava", "Los Angeles | Actress", "Within 380 meters", "Coffee | ", "Ava is an aspiring actress living in Los Angeles. She loves attending auditions, going to acting classes, and exploring the city's entertainment scene."),
            BuisnessItem("IS", "Isabella", "Miami| Beachgoer", "Within 310 meters", "Coffee | ", "Isabella is a beachgoer in Miami, spending her days soaking up the sun, swimming in the crystal-clear waters, and enjoying the vibrant beach culture.")
        )

        val adapter = BuisnessAdapter(items)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter




        return view
    }


}


data class BuisnessItem(
    val Name_in_code: String,
    val Name: String,
    val loatction_Occupation:String,
    val distane_data:String,
    val tag_data:String,
    val descriptinon:String
)
