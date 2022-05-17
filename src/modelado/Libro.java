/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;
/**
 *
 * @author angel
 */
public class Libro {
    private int IdLibro;
    private boolean Status;
    private String Nombre;
    private String Autor;
    private String Edicion;
    private String Editorial;
    
    //CONTRUCTORES
    public Libro(){};
    public Libro(int IdLibro, boolean Status, String Nombre,String Autor, String Edicion, String Editorial) {
        this.IdLibro = IdLibro;
        this.Status = Status;
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.Edicion = Edicion;
        this.Editorial = Editorial;
    }
    
    //GETTERS
    public int getIdLibro() {
        return IdLibro;
    }

    public boolean isStatus() {
        return Status;
    }

    public String getNombre() {
        return Nombre;
    }
    public String getAutor() {
        return Autor;
    }

    public String getEdicion() {
        return Edicion;
    }

    public String getEditorial() {
        return Editorial;
    }
    //SETTERS

    public void setIdLibro(int IdLibro) {
        this.IdLibro = IdLibro;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setEdicion(String Edicion) {
        this.Edicion = Edicion;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "IdLibro=" + IdLibro + ", Status=" + Status + ", Nombre=" + Nombre + ", Edicion=" + Edicion + ", Editorial=" + Editorial + '}';
    }

    

    
    
    
}
