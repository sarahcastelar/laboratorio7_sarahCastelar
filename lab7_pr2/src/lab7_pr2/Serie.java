/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_pr2;

/**
 *
 * @author Usuario
 */
public class Serie extends Pelicula{
    
    private int numTemporadas;

    public Serie() {
        super();
    }

    public Serie(int id, String nombre, String categoria) {
        super(id, nombre, categoria);
    }
    
    

    public Serie(int numTemporadas, int id, String nombre, String categoria, int hora, int minutos, int rating, String productora, String director) {
        super(id, nombre, categoria, hora, minutos, rating, productora, director);
        this.numTemporadas = numTemporadas;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }
    
    
    
    
}
