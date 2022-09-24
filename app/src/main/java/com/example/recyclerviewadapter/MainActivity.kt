package com.example.recyclerviewadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)

        val listO = listOf<String>("Gaddar", "kumar", "chaudhary", "village", "malahi", "tola", "PO", "dhobini", "PS", "Lauriya", "Dist", "West", "Champaran", "lauriya","Gaddar", "kumar", "chaudhary", "village", "malahi", "tola", "PO", "dhobini", "PS", "Lauriya", "Dist", "West", "Champaran", "lauriya","Gaddar", "kumar", "chaudhary", "village", "malahi", "tola", "PO", "dhobini", "PS", "Lauriya", "Dist", "West", "Champaran", "lauriya","Gaddar", "kumar", "chaudhary", "village", "malahi", "tola", "PO", "dhobini", "PS", "Lauriya", "Dist", "West", "Champaran", "lauriya")
        val listO1 = listOf<String>("Gaddar", "kumar", "chaudhary", "village", "malahi", "tola", "PO", "dhobini", "PS", "Lauriya", "Dist", "West", "Champaran", "lauriya","Gaddar", "kumar", "chaudhary", "village", "malahi", "tola", "PO", "dhobini", "PS", "Lauriya", "Dist", "West", "Champaran", "lauriya","Gaddar", "kumar", "chaudhary", "village", "malahi", "tola", "PO", "dhobini", "PS", "Lauriya", "Dist", "West", "Champaran", "lauriya","Gaddar", "kumar", "chaudhary", "village", "malahi", "tola", "PO", "dhobini", "PS", "Lauriya", "Dist", "West", "Champaran", "lauriya")
        recyclerView.adapter = AdaterClass(listO, listO1)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}
