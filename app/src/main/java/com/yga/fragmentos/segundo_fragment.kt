package com.mkrdeveloper.fragmentexample2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.yga.fragmentos.R


class segundo_fragment : Fragment(){


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_segundo_fragment, container, false)

        val tvRespuesta = view.findViewById<TextView>(R.id.tvRespuesta)
        val btnVolver = view.findViewById<Button>(R.id.btnVolver)
        val primerFragment = primer_fragment()

        btnVolver.setOnClickListener {       }


        val data = arguments

        tvRespuesta.text = "Hola " + data?.getString("text") + "!!"


        return view
    }


}