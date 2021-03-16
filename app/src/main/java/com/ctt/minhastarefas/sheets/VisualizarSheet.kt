package com.ctt.minhastarefas.sheets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import com.ctt.minhastarefas.MainActivity
import com.ctt.minhastarefas.R
import com.ctt.minhastarefas.model.Tarefa
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.sheet_visualizar.*

class VisualizarSheet(tarefa: Tarefa) : BottomSheetDialogFragment() {

    val tarefa = tarefa

    companion object {
        const val TAG = "VisualizarSheet"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.sheet_visualizar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val txtTituloVisualizar = view!!.findViewById<TextView>(R.id.txtTituloVisualizar)
        val txtConteudoVisualizar = view!!.findViewById<TextView>(R.id.txtConteudoVisualizar)
        txtTituloVisualizar.setText(tarefa.titulo)
        txtConteudoVisualizar.setText(tarefa.descricao)
        initClick()
    }

    private fun initClick() {

        btnExcluirTarefa.setOnClickListener {
            MainActivity.removerTarefa(tarefa)
            dismissAllowingStateLoss()
            Toast.makeText(it.context, "Tarefa excluída", Toast.LENGTH_LONG).show()
        }
    }
}