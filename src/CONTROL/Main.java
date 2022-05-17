/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROL;
import java.util.LinkedList;
import modelado.*;
import proyectofinalpii.*;

/**
 *
 * @author angel
 */


public class Main {
    //INSTANCIAMOS LOS ALMACENES
    public static Almacenes Storage = new Almacenes();
    public static PanelPrincipal PANTALLA = new PanelPrincipal();

    public static void main(String[] args) {
        //CREAMOS LA PANTALLA PARA INICIALIZARLA
        PANTALLA.setVisible(true);
        Storage.cargarUsuarios();
        Storage.cargarLibros();
        //OUTPUT A CONSOLA PARA VERIFICAR (DEBUG)
        System.out.println("Datos Cargados al sistema.");
        for (int i = 0; i <Storage.Usuarios.size(); i++) {
            System.out.println(Storage.Usuarios.get(i));
        }
        for (int i = 0; i <Storage.Libros.size(); i++) {
            System.out.println(Storage.Libros.get(i));
        }
    }
}
