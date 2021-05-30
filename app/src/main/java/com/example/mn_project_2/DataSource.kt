package com.example.mn_project_2

import com.example.mn_project_2.models.File

class DataSource {
    companion object{
        fun createDataSet(): ArrayList<File>{
            val list = ArrayList<File>()
            list.add(
                    File(0,"file1", "100", "", "spam text1", "20")
            )
            list.add(
                    File(1,"file2", "200", "", "spam text2", "30")
            )
            list.add(
                    File(2, "file3", "300", "", "spam text3", "40")
            )
            return list
        }
    }

}