/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROL;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import modelado.*;
/**
 *
 * @author angel
 */
public class Almacenes {
    public LinkedList<Libro> Libros;
    public LinkedList<Usuario> Usuarios;
    public LinkedList<LogPrestamo> Prestamos;
    
    public Almacenes(){
        Libros = new LinkedList<>();
        Usuarios = new LinkedList<>();
        Prestamos = new LinkedList<>();
    }
    
    public void cargarLibros(){
        //LIBROS
        BufferedReader br = null;
        String id = "";
        String Status = "";
        String Nombre = "";
        String edicion="";
        String autor ="";
        String editorial="";
        
        try {
            br=new BufferedReader(new FileReader("libros.txt"));
            while ((id= br.readLine())!=null) {
                Status = br.readLine();
                Nombre = br.readLine();
                edicion = br.readLine();
                autor = br.readLine();
                editorial = br.readLine();
                Libro libro = new Libro();
                libro.setIdLibro(Integer.parseInt(id));
                libro.setStatus(Boolean.parseBoolean(Status));
                libro.setNombre(Nombre);
                libro.setEdicion(edicion);
                libro.setAutor(autor);
                libro.setEditorial(editorial);
                Libros.add(libro);
            }
        } catch (IOException e) {
            System.out.println("Error"+e.getMessage());
        }
        finally{
            try{
                if(br !=null)
                    br.close();
                System.out.println(Libros);
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    
    public void cargarUsuarios(){
        //USUARIOS
        BufferedReader br = null;
        String id = "";
        String nombre = "";
        String apellidoP ="";
        String apellidoM ="";
        String direccion= "";
        String tipo="";
        
        try {
            br=new BufferedReader(new FileReader("usuarios.txt"));
            while ((id= br.readLine())!=null) {
                nombre = br.readLine();
                apellidoP = br.readLine();
                apellidoM = br.readLine();
                direccion = br.readLine();
                tipo = br.readLine();
                Usuario usuario = new Usuario();
                usuario.setIdUsuario(Integer.parseInt(id));
                usuario.setNombre(nombre);
                usuario.setApellidoP(apellidoP);
                usuario.setApellidoM(apellidoM);
                usuario.setDireccion(direccion);
                usuario.setUserType(Integer.parseInt(tipo));
                Usuarios.add(usuario);
            }
        } catch (IOException e) {
            System.out.println("Error"+e.getMessage());
        }
        finally{
            try{
                if(br !=null)
                    br.close();
                System.out.println(Usuarios);
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }
    }
     
    public void registrarPrestamo(){}
    
    public void actualizarEstatus(){}
    
    public void visualizarPrestamos(){}
}
