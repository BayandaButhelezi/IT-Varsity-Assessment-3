package co.za.bayandabuthelezi.assessment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class dashboard : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Trades>
    private lateinit var imageId : Array<Int>
    private lateinit var heading : Array<String>
    private lateinit var text : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        imageId = arrayOf(
            R.drawable.itemimage,
            R.drawable.itemimage,
            R.drawable.itemimage,
            R.drawable.itemimage,
            R.drawable.itemimage,
            R.drawable.itemimage,
        )

        heading = arrayOf(
            "Beginner's guide to carpenting",
            "Beginner's guide to being an electrician",
            "Beginner's guide to plumbing",
            "Beginner's guide to being a Pipe Fitter",
            "Beginner's guide to Masoning",
            "Beginner's guide to being a Heating Technician",
        )

        text = arrayOf(
            "https://restless.co.uk/leisure-and-lifestyle/learning/a-beginners-guide-to-carpentry/",
            "https://www.indeed.com/career-advice/career-development/how-to-become-an-electrician",
            "https://homeclimates.com/blog/beginners-guide-to-plumbing",
            "https://specifiedfittings.com/blog/guide-to-pipe-fitting-basics/",
            "https://www.indeed.com/career-advice/career-development/how-to-become-an-electrician",
            "https://www.interplaylearning.com/blog/hvac-training-101",
        )

        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this )
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<Trades>()
        getUserdata()
    }

    private fun getUserdata() {
        for(i in imageId.indices){

            val trades = Trades(imageId[i], heading[i], text[i])
            newArrayList.add(trades)

        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }
}