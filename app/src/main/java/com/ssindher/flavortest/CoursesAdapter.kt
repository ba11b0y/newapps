package com.ssindher.flavortest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CoursesAdapter(
    private val context:Context,
    private val list:List<Course>
): RecyclerView.Adapter<CoursesAdapter.CoursesVH>() {

    class CoursesVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image:ImageView = itemView.findViewById(R.id.image)
        val name:TextView = itemView.findViewById(R.id.name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoursesAdapter.CoursesVH {
        val rootView: View =
            LayoutInflater.from(context).inflate(R.layout.course_item,parent, false)
        return CoursesVH(rootView)
    }

    override fun onBindViewHolder(holder: CoursesAdapter.CoursesVH, position: Int) {
        Picasso.get().load(list[position].image).into(holder.image)
        holder.name.text = list[position].name
    }

    override fun getItemCount(): Int {
        return list.size
    }
}