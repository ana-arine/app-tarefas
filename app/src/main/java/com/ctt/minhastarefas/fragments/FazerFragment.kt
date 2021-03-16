package com.ctt.minhastarefas.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ctt.minhastarefas.MainActivity
import com.ctt.minhastarefas.MainActivity.Companion.adapterFazer
import com.ctt.minhastarefas.R
import com.ctt.minhastarefas.adapter.TarefasAdapter
import com.ctt.minhastarefas.model.Tarefa
import com.ctt.minhastarefas.sheets.FazerSheet
import com.google.android.material.bottomsheet.BottomSheetDialog

class FazerFragment : Fragment() {

    private val CICLO_VIDA = "CICLO_VIDA"
//    private lateinit var botaoCadastrar: Button
//    private lateinit var tituloTarefa: EditText
//    private lateinit var descricaoTarefa: EditText
//    private lateinit var adapter: TarefasAdapter

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        // O que onCreateView vai retornar
        val view: View = inflater.inflate(R.layout.fragment_fazer, container, false)


// Define a sheet
//        val bottomSheet = layoutInflater.inflate(R.layout.sheet_fazer, null)
//        val dialog = BottomSheetDialog(this.requireContext())
//        dialog.setContentView(bottomSheet)

        // Botão flutuante de adicionar tarefas
        val btnAdicionar: View = view.findViewById(R.id.btnAdicionar)
        initClick(btnAdicionar)
        return view
        }

    private fun initClick(btnAdicionar: View) {

        val manager = (this.context as AppCompatActivity).supportFragmentManager
        btnAdicionar.setOnClickListener {
            FazerSheet().show(manager, FazerSheet.TAG)
            Log.e(CICLO_VIDA, "Botao de adicionar apertado")
        }
    }

        //Após a fragment ser criada
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rvFazer = view.findViewById<RecyclerView>(R.id.listaFazer)

        rvFazer.adapter = adapterFazer
        rvFazer.layoutManager = LinearLayoutManager(requireContext())


    }

//    companion object {
//        val listaTarefas: MutableList<Tarefa> = mutableListOf(
//                Tarefa("Fazer bola de ferro", "Pra ficar mais forte"),
//                Tarefa("Ir no mercado", "Comprar leite")
//        )
//    }


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
