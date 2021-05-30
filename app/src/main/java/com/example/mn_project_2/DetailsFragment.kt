package com.example.mn_project_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.mn_project_2.models.File

class DetailsFragment : Fragment() {
    private var pos: Int = -1
    private var param2: String? = null
    private lateinit var image: ImageView
    private lateinit var name: TextView
    private lateinit var downloads: TextView
    private lateinit var size: TextView
    private lateinit var description: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            pos = it.getInt("pos")
            param2 = it.getString("param2")
        }
    }

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_details, container, false)
        image = view.findViewById(R.id.file_image)
        description = view.findViewById(R.id.file_description)
        name = view.findViewById(R.id.file_name)
        downloads = view.findViewById(R.id.file_downloads)
        size = view.findViewById(R.id.file_size)
        val file: File = DataSource.createDataSet()[pos]
        name.text = file.name
        description.text = file.description
        size.text = file.size
        downloads.text = file.downloads
        return view
    }

    companion object{

        @JvmStatic
        fun newInstance(param1: String, param2: String) = DetailsFragment().apply {
            arguments = Bundle().apply {
                putString("pos", param1)
                putString("param2", param2)
            }
        }
    }
}