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
public class Pelicula {
    
    private int id;//validar
    private String nombre;
    private String categoria;
    private ArrayList <String> idiomas = new ArrayList();
    private ArrayList <String> subtitulos = new ArrayList();
    private int hora;
    private int minutos;
    private int rating; //validar
    private ArrayList <String> listaComentarios = new ArrayList();
    private ArrayList <String> listaActores = new ArrayList();
    private String productora;
    private String director;

    public Pelicula() {
    }
    
    public Pelicula(int id) {
        this.id = id;
    }

    public Pelicula(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    
    

    public Pelicula(int id, String nombre, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
    }
    
    

    public Pelicula(int id, String nombre, String categoria, int hora, int minutos, int rating, String productora, String director) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.hora = hora;
        this.minutos = minutos;
        this.rating = rating;
        this.productora = productora;
        this.director = director;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<String> getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(ArrayList<String> subtitulos) {
        this.subtitulos = subtitulos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<String> getListaComentarios() {
        return listaComentarios;
    }

    public void setListaComentarios(ArrayList<String> listaComentarios) {
        this.listaComentarios = listaComentarios;
    }

    public ArrayList<String> getListaActores() {
        return listaActores;
    }

    public void setListaActores(ArrayList<String> listaActores) {
        this.listaActores = listaActores;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
    
    
    
    
}
