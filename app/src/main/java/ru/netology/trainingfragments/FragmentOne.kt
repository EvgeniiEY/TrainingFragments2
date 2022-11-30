package ru.netology.trainingfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController


class FragmentOne : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageButton: ImageButton = view.findViewById(R.id.imgButton)
        val editText: EditText = view.findViewById(R.id.editText)
        val bundle = Bundle()

        imageButton.setOnClickListener {
            val name = editText.text
            val hello = "Привет, $name"

            bundle.putString("MyArg", hello)
            findNavController().navigate(R.id.fragmentTwo,bundle)
        }
    }
}
