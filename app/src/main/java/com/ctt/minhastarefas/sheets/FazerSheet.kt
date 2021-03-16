package com.ctt.minhastarefas.sheets

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.ctt.minhastarefas.R
import com.ctt.minhastarefas.adapter.TarefasAdapter
import com.ctt.minhastarefas.model.Tarefa
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_fazer.*


class FazerSheet : BottomSheetDialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.sheet_fazer, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnTaskAdd =  view.findViewById<Button>(R.id.btnCriarTarefa)
        val edtTitle = view.findViewById<EditText>(R.id.editFazerTitulo)
        val edtDescription = view.findViewById<EditText>(R.id.editFazerDescricao)
        // val model = ViewModelProviders.of(activity!!).get(TaskAddViewModel::class.java)


        btnTaskAdd.setOnClickListener {
            Log.e("CICLO_VIDA", "Tarefa criada!")
            //model!!.dataTask(Task(edtTitle.text.toString(), edtDescription.text.toString()))
        }

    }
}





    //    private lateinit var tituloTarefa : EditText
//    private lateinit var descricaoTarefa : EditText
////
//    val itemAdapter = TarefasAdapter(listaFazer)
//    rvItems.adapter = itemsAdapter
//
//    override fun onCreateView(
//            inflater: LayoutInflater, container: ViewGroup?,
//            savedInstanceState: Bundle?
//    ): View? {
//
//        var btnAdd: Button = findViewById(R.id.btnCriar)
//
//        btnAdd.setOnClickListener {
//            val tituloDigitado = titulo.text.toString()
//            val descricaoDigitada = descricao.text.toString()
//
//            if (tituloDigitado.isEmpty()) {
//                tituloDigitado.error = "Favor escrever uma tarefa!"
//            } else {
//
//                itemAdapter.addItem(
//                        Tarefa(titulo = nomeDigitado, descricao = descricaoDigitada)
//                )
//                Toast.makeText(this, "Tarefa adicionada com sucesso!", Toast.LENGTH_SHORT).show()
//                clearInputFields()
//            }
//        }
//
//
//    }
//}
//
//}
//

