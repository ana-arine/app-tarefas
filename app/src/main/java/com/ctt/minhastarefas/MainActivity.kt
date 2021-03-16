package com.ctt.minhastarefas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.viewpager.widget.ViewPager
import com.ctt.minhastarefas.adapter.TarefasAdapter
import com.ctt.minhastarefas.model.Tarefa
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //supportActionBar?.hide()

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        val viewPager = findViewById<ViewPager>(R.id.viewPager)

        val adapter = ViewPagerAdapter(this, supportFragmentManager,
                tabLayout.tabCount)
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                viewPager.currentItem = tab.position
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

    }
    companion object {
        val listaTarefas: MutableList<Tarefa> = mutableListOf(
            Tarefa("Fazer bola de ferro", "Pra ficar mais forte"),
            Tarefa("Ir no mercado", "Comprar leite")
        )

        val listaEmProgresso: MutableList<Tarefa> = mutableListOf(
            Tarefa("Fazendo umas coisas aí", "Pra ficar mais forte"),
            Tarefa("No momento indo na farmácia", "Comprar xantinon")
        )
        val listaFeitas: MutableList<Tarefa> = mutableListOf(
            Tarefa("Fiz tudo", "Pra ficar mais forte"),
            Tarefa("Fui na praia", "Pra tomar picolé")
        )
        val adapterFazer = TarefasAdapter(listaTarefas)
        val adapterEmProgresso = TarefasAdapter(listaEmProgresso)
        val adapterFeitas = TarefasAdapter(listaFeitas)

        fun adicionarTarefa(titulo: String, descricao: String) {
            listaTarefas.add(Tarefa(titulo, descricao))
            adapterFazer.updateList()
        }

        fun removerTarefa(tarefa: Tarefa) {
            if (tarefa in listaTarefas) {
                listaTarefas.remove(tarefa)
                adapterFazer.updateList()
            }
        }

        fun copiarParaProgresso(tarefa: Tarefa) {
            listaEmProgresso.add(tarefa)
            adapterEmProgresso.updateList()
        }

        fun copiarParaFeitas(tarefa: Tarefa) {
            listaFeitas.add(tarefa)
            adapterFeitas.updateList()
        }
    }
}


