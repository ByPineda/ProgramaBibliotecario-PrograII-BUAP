/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

/**
 *
 * @author angel
 */
public class Usuario {
    private int IdUsuario;
    private int UserType;
    private String Nombre;
    private String ApellidoP;
    private String ApellidoM;
    private String Direccion;
    
    //CONSTRUCTORES
    public Usuario(){};
    public Usuario(int IdUsuario, int UserType, String Nombre, String ApellidoP,String ApellidoM, String Direccion) {
        this.IdUsuario = IdUsuario;
        this.UserType = UserType;
        this.Nombre = Nombre;
        this.ApellidoP = ApellidoP;
        this.ApellidoM = ApellidoM;
        this.Direccion = Direccion;
    }
    
    //GETTERS
    public int getIdUsuario() {
        return IdUsuario;
    }

    public int getUserType() {
        return UserType;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidoP() {
        return ApellidoP;
    }

    public String getApellidoM() {
        return ApellidoM;
    }
    

    public String getDireccion() {
        return Direccion;
    }
    
    
    //SETTERS
    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public void setUserType(int UserType) {
        this.UserType = UserType;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidoP(String Apellido) {
        this.ApellidoP = Apellido;
    }

    public void setApellidoM(String ApellidoM) {
        this.ApellidoM = ApellidoM;
    }
    
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "IdUsuario=" + IdUsuario + ", UserType=" + UserType + ", Nombre=" + Nombre + ", ApellidoP=" + ApellidoP + ", ApellidoM=" + ApellidoM + ", Direccion=" + Direccion + '}';
    }

    
    
    
    
    
}
