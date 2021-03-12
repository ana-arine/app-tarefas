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
    private lateinit var botaoCadastrar: Button
    private lateinit var tituloTarefa: EditText
    private lateinit var descricaoTarefa: EditText

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {


        Log.e(CICLO_VIDA, "App em OnCreate")

        if (recyclerView.isEmpty) {
            return inflater.inflate(R.layout.fragment_fazer_empty, container, false)
        } else {
            return inflater.inflate(R.layout.fragment_fazer, container, false)
        }

        botaoCadastrar = findViewById(R.id.btnCadastrar)
        nomeUsuario = findViewById(R.id.edtNomeUsuario)
        idadeUsuario = findViewById(R.id.edtIdadeUsuario)

    }
}

    //aula DIO

// private lateinit var myLocationListener: MyLocationListener
//    private val rvList: RecyclerView by lazy {
//        findViewById<RecyclerView>(R.id.rv_list)
//   }
//    private val adapter = TarefasAdapter()

//
//        bindViews()
//    }
//    private fun bindViews() {
//        rvList.adapter = adapter // o adapter desse componente da RV é o adapter de Tarefas
//        rvList.layoutManager = LinearLayoutManager(this) // a forma que o RV vai se comportar
//
//    }
//
//    private fun updateList() {
//        adapter.updateList(
//            arrayListOf(
//                Tarefa(titulo = "Bola de Ferro", descricao = "Ir na bola de ferro 2a, 4a e 6a")
//
//        )
//        )
//    }
