package lab7_pr2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class administrarUsuarios {

    private ArrayList<Usuario> listaUsuarios2 = new ArrayList();
    private File archivo = null;

    public administrarUsuarios(String path) {
        archivo = new File(path);
    }

    public ArrayList<Usuario> getListaUsuarios2() {
        return listaUsuarios2;
    }

    public void setListaUsuarios2(ArrayList<Usuario> listaUsuarios2) {
        this.listaUsuarios2 = listaUsuarios2;
    }
    
    public void setPelicula(int peliId){
        this.listaUsuarios2.get(0).getPeliculas().add(new Pelicula(peliId));
    }
    
    public void setSerie(int serieId){
        this.listaUsuarios2.get(0).getSeries().add(new Serie(serieId));
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void setUsuario(Usuario p) {
        this.listaUsuarios2.add(p);
    }

    

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter(fw);
            bw.write("Informacion Usuario: ");
            bw.newLine();
            for (Usuario t : listaUsuarios2) {
               bw.write("Correo: " + t.getCorreo() + ";");
               bw.write("  Password: "+t.getContrasena() + ";");
               bw.write("  Fecha Nacimiento: "+t.getFecha() + ";");
               bw.write("  Numero de Tarjeta: "+t.getTarjeta()+";");
               bw.newLine();
               bw.write("ID Peliculas Favoritas: " );
               bw.newLine();
                for (Pelicula r : t.getPeliculasFav()) {
                    bw.write(r.getId() + ",");
                }
                bw.newLine();
                bw.write("ID Series Favoritas: ");
                bw.newLine();
                for (Serie b : t.getSeriesFav()) {
                    bw.write(b.getId() + ":");
                }
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
        }
            bw.close();
            fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaUsuarios2 = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                String correo, contrasena, fecha, tarjeta;
                ArrayList <Pelicula> temp = new ArrayList();
                ArrayList <Serie> temp2 = new ArrayList();
                correo = sc.next();
                contrasena = sc.next();
                fecha = sc.next();
                tarjeta = sc.next();
                Scanner s2 = new Scanner(sc.next());
                s2.useDelimiter(",");
                while (s2.hasNext()) {
                    temp.add(new Pelicula(s2.nextInt(), s2.next(), s2.next()));
                }
                Scanner s3 = new Scanner(sc.next());
                s3.useDelimiter(":");
                while (s2.hasNext()) {
                    temp2.add(new Serie(s3.nextInt(), s3.next(), s3.next()));
                }
                listaUsuarios2.add(new Usuario(correo, contrasena, fecha, tarjeta));
                listaUsuarios2.get(listaUsuarios2.size() - 1).setPeliculas(temp);
                listaUsuarios2.get(listaUsuarios2.size() - 1).setSeries(temp2);
            } catch (Exception e) {
            }
            sc.close();
        }

    }

}
