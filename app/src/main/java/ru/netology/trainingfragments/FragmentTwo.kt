package ru.netology.trainingfragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.coroutines.selects.SelectInstance


class FragmentTwo : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanccState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_two, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tv: TextView = view.findViewById(R.id.tvFragmentTwo)
        val text = arguments?.getString("MyArg")
        tv.text = text
    }
}