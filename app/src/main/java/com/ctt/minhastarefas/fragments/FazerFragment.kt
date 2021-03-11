package com.ctt.minhastarefas.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.ctt.minhastarefas.R

class FazerFragment : Fragment() {

    private val CICLO_VIDA = "CICLO_VIDA"
    private lateinit var botaoCadastrar : Button
    private lateinit var tituloTarefa : EditText
    private lateinit var descricaoTarefa : EditText

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {



        Log.e(CICLO_VIDA, "App em OnCreate")

        if (recyclerView.isEmpty){
            return inflater.inflate(R.layout.fragment_fazer_empty, container, false)
    }else {
            return inflater.inflate(R.layout.fragment_fazer, container, false)
        }

        botaoCadastrar = findViewById(R.id.btnCadastrar)
        nomeUsuario = findViewById(R.id.edtNomeUsuario)
        idadeUsuario = findViewById(R.id.edtIdadeUsuario)

}