/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Prueba;
import Modelo.PruebaEstudiante;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Daniela Chaux
 */
public class ArchivoControlador {
    private static ArchivoControlador instance;

    private ArchivoControlador() {
    }

    public static ArchivoControlador getInstance() {
        if (instance == null) {
            instance = new ArchivoControlador();
        }
        return instance;
    }
    public Prueba cargarPrueba() {
        Prueba prueba = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\Daniela Chaux\\Documents\\progra 4\\Calificado_Profesor\\Examen.cad")))) {
            Object readObject = ois.readObject();
            System.out.println(readObject);
            if (readObject != null && readObject instanceof Prueba) {
                prueba = ((Prueba) readObject);
            }
        } catch (Exception ex) {
              System.out.println("Error al leer archivo: " + ex);
        }

        return prueba;
    }

    public void guardarPrueba(PruebaEstudiante pruebaestudiante) {
        //try {
            try (ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("SolucionExamen.cad"))) {
            ois.writeObject(pruebaestudiante);
            } catch (Exception ex) {
            Logger.getLogger(ArchivoControlador.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
