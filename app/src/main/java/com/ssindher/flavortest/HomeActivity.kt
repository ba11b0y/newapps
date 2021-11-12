package com.ssindher.flavortest

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class HomeActivity : AppCompatActivity() {
    lateinit var toolbar: Toolbar
    lateinit var banner:ImageView
    lateinit var rv_courses:RecyclerView
    lateinit var list:MutableList<Course>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val name = "Welcome"
        toolbar = findViewById(R.id.toolbar)
        banner = findViewById(R.id.banner)
        rv_courses = findViewById(R.id.rv_courses)

        list = ArrayList()
        list.add(
            Course(
                "https://www.clipartmax.com/png/middle/262-2620113_cbse-logo-central-board-of-secondary-education.png",
                "Class 12 Science"
            )
        )
        list.add(
            Course(
                "https://www.clipartmax.com/png/middle/262-2620113_cbse-logo-central-board-of-secondary-education.png",
                "Class 12 Commerce"
            )
        )
        list.add(
            Course(
                "https://www.clipartmax.com/png/middle/262-2620113_cbse-logo-central-board-of-secondary-education.png",
                "JEE Mains"
            )
        )
        list.add(
            Course(
                "https://www.clipartmax.com/png/middle/262-2620113_cbse-logo-central-board-of-secondary-education.png",
                "NEET"
            )
        )
        list.add(
            Course(
                "https://thumbs.dreamstime.com/z/computer-science-isolated-eyeball-blue-round-button-computer-science-eyeball-blue-round-button-129678317.jpg",
                "Computer Science"
            )
        )

        toolbar.title = name
        Picasso.get().load("https://t3.ftcdn.net/jpg/02/37/57/40/360_F_237574042_UUqnYdNfjWZMdCoZuvsZmHcfDCmC36nN.jpg").into(banner)

        rv_courses.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity,LinearLayoutManager.VERTICAL,false)
            adapter = CoursesAdapter(this@HomeActivity,list.toList())
        }
    }
}