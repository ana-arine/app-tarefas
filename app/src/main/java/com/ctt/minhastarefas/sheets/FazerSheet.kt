package com.ctt.minhastarefas.sheets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.ctt.minhastarefas.MainActivity.Companion.adicionarTarefa
import com.ctt.minhastarefas.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.sheet_fazer.*


class FazerSheet : BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sheet_fazer, container, false)
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initClick()
    }

    private fun initClick() {

        val txtTitulo = view?.findViewById<EditText>(R.id.editFazerTitulo)
        val txtDescricao = view?.findViewById<EditText>(R.id.editFazerDescricao)

        btnCriarTarefa.setOnClickListener {
            adicionarTarefa(txtTitulo?.text.toString(), txtDescricao?.text.toString())
            dismissAllowingStateLoss()
            Toast.makeText(it.context, "Tarefa adicionada ;)", Toast.LENGTH_LONG).show()
        }
    }
}


