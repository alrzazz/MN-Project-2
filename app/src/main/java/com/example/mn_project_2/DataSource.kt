package com.example.mn_project_2

import com.example.mn_project_2.models.File

class DataSource {
    companion object{
        fun createDataSet(): ArrayList<File>{
            val list = ArrayList<File>()
            list.add(
                    File(0,"Cute cat", "100", "android.resource://com.example.mn_project_2/drawable/cute_cat", "spam text1", "20")
            )
            list.add(
                    File(1,"Black cat", "200", "android.resource://com.example.mn_project_2/drawable/black_cat", "spam text2", "30")
            )
            list.add(
                    File(2, "Female lion", "300", "android.resource://com.example.mn_project_2/drawable/lion_female", "spam text3", "40")
            )
            list.add(
                    File(3, "White cat", "50", "android.resource://com.example.mn_project_2/drawable/white_cat", "spam text4", "40")
            )
            return list
        }
    }

}