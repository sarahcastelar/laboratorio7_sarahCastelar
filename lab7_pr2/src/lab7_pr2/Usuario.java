/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_pr2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Usuario {
    
    private String correo;
    private String contrasena;
    private String fecha;
    private ArrayList <Pelicula> peliculas = new ArrayList();
    private ArrayList <Serie> series = new ArrayList();
    private String tarjeta;
    private ArrayList <Pelicula> peliculasFav = new ArrayList();
    private ArrayList <Serie> seriesFav = new ArrayList();
    
    
    public Usuario() {
    }

    public Usuario(String correo, String contrasena) {
        this.correo = correo;
        this.contrasena = contrasena;
    }
    
    

    public Usuario(String correo, String contrasena, String fecha, String tarjeta) {
        this.correo = correo;
        this.contrasena = contrasena;
        this.fecha = fecha;
        this.tarjeta = tarjeta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public ArrayList<Serie> getSeries() {
        return series;
    }

    public void setSeries(ArrayList<Serie> series) {
        this.series = series;
    }

    public String getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(String tarjeta) {
        this.tarjeta = tarjeta;
    }

    public ArrayList<Pelicula> getPeliculasFav() {
        return peliculasFav;
    }

    public void setPeliculasFav(ArrayList<Pelicula> peliculasFav) {
        this.peliculasFav = peliculasFav;
    }

    public ArrayList<Serie> getSeriesFav() {
        return seriesFav;
    }

    public void setSeriesFav(ArrayList<Serie> seriesFav) {
        this.seriesFav = seriesFav;
    }
    
    
    
    
}
