package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Preguntas> preguntas;
    private int correctas;
    private int incorrectas;

    public Quiz() {
        preguntas = new ArrayList<>();
        correctas = 0;
        incorrectas = 0;
    }

    public void agregarPregunta(Preguntas pregunta) {
        preguntas.add(pregunta);
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        for (Preguntas pregunta : preguntas) {
            System.out.println(pregunta.getPregunta());
            List<String> opciones = pregunta.getOpciones();

            for (int i = 0; i < opciones.size(); i++) {
                System.out.println((i + 1) + ". " + opciones.get(i));
            }

            System.out.print("Elige una opción (número): ");
            int seleccion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            if (seleccion < 1 || seleccion > opciones.size()) {
                System.out.println("Opción no válida.");
                continue;
            }

            String respuesta = opciones.get(seleccion - 1);
            if (pregunta.esRespuestaCorrecta(respuesta)) {
                System.out.println("¡Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta era: " + pregunta.getRespuestaCorrecta());
                incorrectas++;
            }
        }

        System.out.println("Resultados finales:");
        System.out.println("Respuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);
        scanner.close();
    }
}

// package org.example;


// public class Quiz {
//    private List<Preguntas> preguntas
//    private int puntaje;

//    public Quiz() {
//      preguntas = new ArrayList<Preguntas>();
//      puntaje = 0;
//}

//    public void agregarPregunta(Pregunta pregunta){
//       preguntas.add(pregunta);
//}

//    public void evaluarPregunta(int nroPregunta, int respuestaUsuario){
//       if(pregunta.get(indicePregunta).getRespuestaCorrecta() == respuestaUsuario){
//           puntaje++;
//           }
//}

//    public void mostrarPregunta(){
//         System.out.print("Su puntaje es: " + puntaje);
//  }
//}
