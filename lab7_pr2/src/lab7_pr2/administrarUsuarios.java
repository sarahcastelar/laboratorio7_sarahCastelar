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
                for (Pelicula r : t.getPeliculas()) {
                    bw.write(r.getNombre() + ",");
                }
                for (Serie b : t.getSeries()) {
                    bw.write(b.getNombre());
                }
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
                System.out.println("holaa");
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
                listaUsuarios.add(new Usuario(correo, contrasena, fecha, tarjeta));
                listaUsuarios.get(listaUsuarios.size() - 1).setPeliculas(temp);
                listaUsuarios.get(listaUsuarios.size() - 1).setSeries(temp2);
            } catch (Exception e) {
            }
            sc.close();
        }

    }

}
