package com.rdiaaz.proyectschool

import android.util.Log
class Alumno(val id :Int, val nombre : String = "",val listaasignaturas: List<Asignatura>){
    fun mostrarAlumno(alumno: Alumno) {
        Log.d("dev", "id: ${alumno.id}")
        Log.d("dev","nombre: ${alumno.nombre}")
        Log.d("dev","Asignaturas:")
        for(asignatura in alumno.listaasignaturas){
            Log.d("dev", "${asignatura.name}")
        }
    }

}