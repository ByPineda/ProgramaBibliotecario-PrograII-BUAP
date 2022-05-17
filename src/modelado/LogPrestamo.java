/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelado;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author angel
 */
public class LogPrestamo {
    private int IdPrestamo;
    private int IdLibro;
    private int IdUsuario;
    private LocalDate FechaEntrada;
    private LocalDate FechaSalida;
    private long Dias;
   
    //CONTRUCTORES
    public LogPrestamo(){};
    public LogPrestamo(int IdPrestamo, int IdLibro, int IdUsuario, String FechaEntrada, String FechaSalida ) throws ParseException {
        this.IdPrestamo = IdPrestamo;
        this.IdLibro = IdLibro;
        this.IdUsuario = IdUsuario;
        
        this.FechaEntrada = LocalDate.parse(FechaEntrada, DateTimeFormatter.ISO_LOCAL_DATE);
        this.FechaSalida = LocalDate.parse(FechaSalida, DateTimeFormatter.ISO_LOCAL_DATE);
        Duration diff = Duration.between(this.FechaSalida.atStartOfDay(), this.FechaEntrada.atStartOfDay());
        Dias = diff.toDays();
        System.out.println("Dias: "+Dias); 
    }
    
    //GETTERS
    public int getIdPrestamo() {
        return IdPrestamo;
    }

    public int getIdLibro() {
        return IdLibro;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public LocalDate getFechaEntrada() {
        return FechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return FechaSalida;
    }
    
    public long getDias() {
        return Dias;
    }
    
    //SETTERS
    public void setIdPrestamo(int IdPrestamo) {
        this.IdPrestamo = IdPrestamo;
    }

    public void setIdLibro(int IdLibro) {
        this.IdLibro = IdLibro;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public void setFechaEntrada(LocalDate FechaEntrada) {
        this.FechaEntrada = FechaEntrada;
    }

    public void setFechaSalida(LocalDate FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public void setDias(long Dias) {
        this.Dias = Dias;
    }

    @Override
    public String toString() {
        return "LogPrestamo{" + "IdPrestamo=" + IdPrestamo + ", IdLibro=" + IdLibro + ", IdUsuario=" + IdUsuario + ", FechaEntrada=" + FechaEntrada + ", FechaSalida=" + FechaSalida + ", Dias=" + Dias + '}';
    }
    
    
    
}
