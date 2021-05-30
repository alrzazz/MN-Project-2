package com.example.mn_project_2.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mn_project_2.R
import com.example.mn_project_2.models.File

class FileAdapter(val fileList: ArrayList<File>, val onItemClicked: (Int)->Unit): RecyclerView.Adapter<FileAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FileAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_row_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: FileAdapter.ViewHolder, position: Int) {
        holder.bindItems(fileList[position])
        holder.itemView.setOnClickListener( View.OnClickListener {
            onItemClicked(position)
        })
    }

    override fun getItemCount(): Int {
        return fileList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(file: File) {
            val nameItem = itemView.findViewById(R.id.nameItem) as TextView
            val downloadsItem  = itemView.findViewById(R.id.downloadsItem) as TextView
            val imageItem  = itemView.findViewById(R.id.imageItem) as ImageView
            nameItem.text = file.name
            downloadsItem.text = file.downloads
//            imageItem.setImageURI(file.image)
        }
    }
}