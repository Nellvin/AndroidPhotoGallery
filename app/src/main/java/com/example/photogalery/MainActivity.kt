package com.example.photogalery

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var mData =ArrayList<MyData>(20)
    val tags= ArrayList<String>()
    val adapter = CustomAdapter(mData)

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById(R.id.recycleView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        initList()


        recyclerView.adapter = adapter


    }

    private fun initList() {
//        val tags= ArrayList<String>()
        tags.add("delo")
        tags.add("elo")
        tags.add("melo")
        mData.add(MyData("ELO",tags, Date()))
        mData.add(MyData("ELO",tags, Date()))
        mData.add(MyData("ELO",tags, Date()))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item!!.itemId == R.id.mainMenu_addingbutton) {
            mData.add(mData.size,MyData("ELO",tags, Date()))
            adapter.notifyItemInserted(mData.size-1)
            recycleView.scrollToPosition(mData.size-1)
        }

        return super.onOptionsItemSelected(item)
    }
}
