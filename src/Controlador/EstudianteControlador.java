/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela Chaux
 */
public class EstudianteControlador {
    private static EstudianteControlador instance;
    

    private EstudianteControlador() {
        prueba = ArchivoControlador.getInstance().cargarPrueba();
        pruebaEstudiante = new PruebaEstudiante();
    }

    public static EstudianteControlador getInstance() {
        if (instance == null) {
            instance = new EstudianteControlador();
        }
        return instance;
    }

    private Prueba prueba;
    private PruebaEstudiante pruebaEstudiante;
    private List<PreguntaEstudiante> preguntas;

    public Prueba getPrueba() {
        return prueba;
    }
    
    
    public void agregarPreguntaAbiertaE(int numero, String solucion){
        int indice = numero - 1;
        if(preguntas == null){
            preguntas = new ArrayList<>();
        }
        PreguntaAbiertaEstudiante pregunta = new PreguntaAbiertaEstudiante(numero, solucion);
        if((indice >= 0)&& (indice < preguntas.size())){
            preguntas.set(indice, pregunta);
        }
        else
            preguntas.add(pregunta);
    }
    public void agregarPreguntaCerradaE(int numero,boolean[] solucion){
        int indice = numero - 1;
        if(preguntas == null){
            preguntas = new ArrayList<>();
        }
        PreguntaCerradaEstudiante pregunta = new PreguntaCerradaEstudiante(numero, solucion);
        
        if((indice >= 0)&& (indice < preguntas.size())){
            preguntas.set(indice, pregunta);
        }
        else
            preguntas.add(pregunta);
    }
    public void guardarPruebaArchivo(){
        pruebaEstudiante.setPreguntas(preguntas);
        ArchivoControlador.getInstance().guardarPrueba(pruebaEstudiante);
    }
    
    
}
