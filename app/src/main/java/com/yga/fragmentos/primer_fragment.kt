package com.yga.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class primer_fragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_primer_fragment, container, false)
        val btnAceptar = view.findViewById<Button>(R.id.btnAceptar)
        val etNombre = view.findViewById<EditText>(R.id.etNombre)
        val segundoFragment = segundo_fragment()

        btnAceptar.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("text",etNombre.text.toString())
            segundoFragment.arguments = bundle
            parentFragmentManager.beginTransaction().apply {replace(R.id.fragmentContainer, segundoFragment).commit()}
        }
        return view
    }
}