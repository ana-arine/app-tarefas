package com.ctt.minhastarefas.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ctt.minhastarefas.R
import com.ctt.minhastarefas.adapter.TarefasAdapter
import com.ctt.minhastarefas.model.Tarefa


class FeitasFragment : Fragment() {

    private val CICLO_VIDA = "CICLO_VIDA"
    private lateinit var botaoCadastrar: Button
    private lateinit var tituloTarefa: EditText
    private lateinit var descricaoTarefa: EditText

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feitas, container, false)
    }

    //Após a fragment ser criada
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val listaFeitas: MutableList<Tarefa> = mutableListOf(
                Tarefa("Fiz tudo", "Pra ficar mais forte"),
                Tarefa("Fui na praia", "Pra tomar picolé")
        )
        val rvFeitas = view.findViewById<RecyclerView>(R.id.listaFeitas)
        val adapterFeitas = TarefasAdapter(listaFeitas)
        rvFeitas.adapter = adapterFeitas
        rvFeitas.layoutManager = LinearLayoutManager(requireContext())
    }
}
