package com.example.mn_project_2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mn_project_2.adapters.FileAdapter

class HomeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val mView = inflater.inflate(R.layout.fragment_home, container, false)
        val recyclerView = mView.findViewById<RecyclerView>(R.id.recyclerView)
//
        val adapter = FileAdapter(DataSource.createDataSet()){
//            Log.i("HomeFragment", "file $it clicked")
            val fileDetailFragment = DetailsFragment()
            val bundle: Bundle = Bundle()
            fileDetailFragment.arguments = bundle
            bundle.putInt("pos", it)
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            if (transaction != null){
                transaction.replace(R.id.nav_host_fragment_container, fileDetailFragment)
                transaction.addToBackStack(null)
                transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                transaction.commit()
            }
        }
//
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        return mView
    }

}