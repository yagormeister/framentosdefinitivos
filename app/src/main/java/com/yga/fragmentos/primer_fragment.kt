package com.mkrdeveloper.fragmentexample2

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.yga.fragmentos.R


class primer_fragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_primer_fragment, container, false)

        val btn = view.findViewById<Button>(R.id.btnAceptar)
        val edtFr1 = view.findViewById<EditText>(R.id.etNombre)

        val segundoFragment = segundo_fragment()

        btn.setOnClickListener {

            val bundle = Bundle()

            bundle.putString("text",edtFr1.text.toString())

            segundoFragment.arguments = bundle


            parentFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainer, segundoFragment)
                    .commit()
            }

        }
        return view
    }
}