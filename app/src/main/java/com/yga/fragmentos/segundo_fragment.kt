package com.yga.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView


class segundo_fragment : Fragment(){


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_segundo_fragment, container, false)
        val tvRespuesta = view.findViewById<TextView>(R.id.tvRespuesta)
        val btnVolver = view.findViewById<Button>(R.id.btnVolver)
        val primerFragment = primer_fragment()
        val data = arguments

        btnVolver.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {replace(R.id.fragmentContainer, primerFragment).commit()}
        }
        tvRespuesta.text = "Hola " + data?.getString("text") + "!!"
        return view
    }


}