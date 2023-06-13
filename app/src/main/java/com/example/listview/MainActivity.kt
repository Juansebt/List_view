package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Objeto ListView con el elemento creado en el layout
        val listaPersonas:ListView=findViewById(R.id.listaPersonas)
        //Lista mutable de tipo String
        var personas = mutableListOf<String>()
        //Agregar elementos a la lista
        personas.add("Juan Sebastián Laguna")
        personas.add("Ariadna Sofia Mosquera")
        personas.add("Andrés Felipe Quintero")
        personas.add("Juan Esteban Diaz")
        //Crear el adaptador asociado al activity, con un layout predetermindado y con los datos
        val adaptador = ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,personas)
        //Al objeto ListView llamado listaPersonas asignarle como adapter el adaptador creado
        listaPersonas.adapter = adaptador
        //respuesta al evento click en un item de la lista
        listaPersonas.setOnItemClickListener { adapterView, View, posicion, id ->
            Toast.makeText(this@MainActivity,
            "Click en posición $posicion, con nombre: " +
            personas[posicion],Toast.LENGTH_LONG).show()
        }
    }
}