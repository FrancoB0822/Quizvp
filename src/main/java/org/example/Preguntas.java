package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Preguntas {
    private String pregunta;
    private List<String> opciones;
    private String respuestaCorrecta;

    public Preguntas(String pregunta, List<String> opciones, String respuestaCorrecta) {
        this.pregunta = pregunta;
        this.opciones = new ArrayList<>(opciones);
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public List<String> getOpciones() {
        Collections.shuffle(opciones); // Mezcla las opciones
        return opciones;
    }

    public boolean esRespuestaCorrecta(String respuesta) {
        return respuesta.equals(respuestaCorrecta);
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }
}

// package org.example;

//import java.util.List;

//public class Pregunta {
//  private String pregunta;
//  private List<String> preguntas;
//  private int respuestaCorrecta;

//  public Pregunta(String pregunta, List<String> respuestas, int respuestaCorrecta) {
//   this.pregunta = pregunta;
//   this.respuestas = respuestas;
//   this.respuestaCorrecta = respuestaCorrecta;
//}

//  public int get.RespuestaCorrecta() {
//    return respuestaCorrecta;
//}

// public void mostrarPregunta(){
//   System.out.print(pregunta);
//   for (String respuesta : respuestas) {
//      System.out.print(respuesta.indexOf(respuesta)+1 *, * + respuesta;
//      }
//   }
//}
