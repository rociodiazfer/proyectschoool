package com.rdiaaz.proyectschool

import android.util.Log

class MainActivity {

    fun main() {
        val asignatura1 = Asignatura(2, "Lengua")
        val asignatura2 = Asignatura(33, "Historia")
        val asignatura5 = Asignatura(5, "lengua")
        val asignatura3 = Asignatura(77, "ingles")
        val asignatura6 = Asignatura(54, "matematicas")

        val alumno1 = Alumno(2, "Ricardo", listOf(asignatura1, asignatura5, asignatura6))
        val alumno2 = Alumno(4, "Jesus", listOf(asignatura1, asignatura3, asignatura2))

        Log.d("dev","Alumno 1: ")
        alumno1.mostrarAlumno(alumno1)

        Log.d("dev","Alumno 2: ")
        alumno2.mostrarAlumno(alumno2)

    }

}