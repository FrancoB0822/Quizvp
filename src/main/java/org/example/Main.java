package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear las preguntas
        List<String> opciones1 = List.of("Java", "Python", "C++", "JavaScript");
        Preguntas p1 =
                new Preguntas("¿Cuál de los siguientes es un lenguaje de programación orientado a objetos?", opciones1, "Java");

        List<String> opciones2 = List.of("4", "5", "6", "7");
        Preguntas p2 =
                new Preguntas("¿Cuánto es 2 + 2?", opciones2, "4");

        List<String> opciones3 = List.of("Árbol", "Piedra", "Agua", "Roca");
        Preguntas p3 =
                new Preguntas("¿Cuál de los siguientes es un ser vivo?", opciones3, "Árbol");

        List<String> opciones4 = List.of("Madrid", "Barcelona", "Valencia", "Sevilla");
        Preguntas p4 =
                new Preguntas("¿Cuál es la capital de España?", opciones4, "Madrid");

        List<String> opciones5 = List.of("11", "12", "22", "27");
        Preguntas p5 =
                new Preguntas("¿Cuántas letras tiene el alfabeto español?", opciones5, "27");

        // Crear el quiz
        Quiz quiz = new Quiz();
        quiz.agregarPregunta(p1);
        quiz.agregarPregunta(p2);
        quiz.agregarPregunta(p3);
        quiz.agregarPregunta(p4);
        quiz.agregarPregunta(p5);

        // Iniciar el quiz
        quiz.iniciar();
    }
}

// package org.example;

//import java.util.ArrayList;
//import java.util.List;

// public class Main {
//   public static void main(String[] args) {
//   Quiz quiz = new Quiz();
//   List<String> respuestas1 = new ArrayList();
//   respuestas1.add("Negro");
//   respuestas1.add("Verde");
//   respuestas1.add("Blanco");
//   respuestas1.add("Rojo");
//   Pregunta pregunta1 = new Pregunta( "De que color es el caballo blanco de san Martin?", respuestas1, 3);
//   quiz.agregarPregunta(pregunta1);

//   pregunta1.mostrarPregunta();
//
// }
//}


//}