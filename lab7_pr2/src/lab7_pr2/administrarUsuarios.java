/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_pr2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Inspiron
 */
public class administrarUsuarios {

    private ArrayList<Usuario> listaUsuarios = new ArrayList();
    private File archivo = null;

    public administrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setUsuario(Usuario p) {
        this.listaUsuarios.add(p);
    }

    

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter(fw);
            for (Usuario t : listaUsuarios) {
               bw.write(t.getCorreo() + ";");
               bw.write(t.getContrasena() + ";");
               bw.write(t.getFecha() + ";");
               bw.write(t.getTarjeta()+";");
            }
            bw.flush();
        } catch (IOException e) {
        }
            bw.close();
            fw.close();
        
        
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaUsuarios = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaUsuarios.add(new Usuario(sc.next(), sc.next(), sc.next(), sc.next()));
                }
            } catch (Exception e) {
            }
            sc.close();
        }

    }

}
