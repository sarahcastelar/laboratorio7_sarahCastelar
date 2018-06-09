
package lab7_pr2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class UniFlix extends javax.swing.JFrame {

    ArrayList <Usuario> listaUsuarios = new ArrayList();
    boolean esAdmin = false;
    Usuario u;
    int optionPeli, optionSerie;
    
    public UniFlix() {
        initComponents();
        listaUsuarios.add(new Usuario("sc@gmail.com", "1"));
        pelis(0);
        serie(0);
        Login.setModal(true);
        Login.pack();
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
        
        
    }

    public final void pelis(int num){
        ((Usuario) listaUsuarios.get(num)).getPeliculas().add(new Pelicula(01, "Titanic", "love", 1, 20, 4, "sofia", "carlos"));
        ((Usuario) listaUsuarios.get(num)).getPeliculas().add(new Pelicula(02, "Inifinity War", "accion", 2, 20, 5, "hector", "mario"));
        ((Usuario) listaUsuarios.get(num)).getPeliculas().add(new Pelicula(03, "El Padrino", "drama", 2, 20, 4, "jose", "efrain"));
        ((Usuario) listaUsuarios.get(num)).getPeliculas().add(new Pelicula(04, "La vida es bella", "love", 1, 0, 5, "maria", "fernanda"));
        ((Usuario) listaUsuarios.get(num)).getPeliculas().add(new Pelicula(05, "Deadpool", "comedia", 2, 40, 5, "carla", "carl"));
        ((Usuario) listaUsuarios.get(num)).getPeliculas().add(new Pelicula(06, "Monster University", "ninos", 1, 50, 5, "carlos", "lina"));
        ((Usuario) listaUsuarios.get(num)).getPeliculas().add(new Pelicula(07, "500 day of Summer", "love", 1, 20, 5, "anna", "gordon"));
        ((Usuario) listaUsuarios.get(num)).getPeliculas().add(new Pelicula(8, "World war z", "accion", 1, 20, 4, "sofia", "carlos"));
        ((Usuario) listaUsuarios.get(num)).getPeliculas().add(new Pelicula(9, "Iron Man", "accion", 1, 20, 4, "sofia", "carlos"));
        ((Usuario) listaUsuarios.get(num)).getPeliculas().add(new Pelicula(10, "Avengers Era de Ultron", "accion", 1, 20, 4, "sofia", "carlos"));
    }
    
    public final void serie(int num){
        ((Usuario) listaUsuarios.get(num)).getSeries().add(new Serie(11, "how to get away with a murder", "suspenso"));
        ((Usuario) listaUsuarios.get(num)).getSeries().add(new Serie(12, "Friends", "comedia"));
        ((Usuario) listaUsuarios.get(num)).getSeries().add(new Serie(13, "Velvet", "love"));
        ((Usuario) listaUsuarios.get(num)).getSeries().add(new Serie(14, "Velvet Collection", "love"));
        ((Usuario) listaUsuarios.get(num)).getSeries().add(new Serie(15, "Patron del mal", "drama"));
        ((Usuario) listaUsuarios.get(num)).getSeries().add(new Serie(16, "Ricky and Morty", "comedia"));
        ((Usuario) listaUsuarios.get(num)).getSeries().add(new Serie(17, "Spongebob SquarePants", "ninos"));
        ((Usuario) listaUsuarios.get(num)).getSeries().add(new Serie(18, "Jessica Jones", "accion"));
        ((Usuario) listaUsuarios.get(num)).getSeries().add(new Serie(19, "La casa de papel", "drama"));
        ((Usuario) listaUsuarios.get(num)).getSeries().add(new Serie(20, "Riverdale", "suspenso"));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_registrar = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_contrasena = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        tf_tarjeta = new javax.swing.JTextField();
        jb_registrar2 = new javax.swing.JButton();
        jd_arbol = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        tb_actualizarTabla = new javax.swing.JButton();
        Login = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_correo2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_contrasena2 = new javax.swing.JTextField();
        jb_login = new javax.swing.JButton();
        jb_registrar = new javax.swing.JButton();
        pop_peli = new javax.swing.JPopupMenu();
        jmi_CrearPeli = new javax.swing.JMenuItem();
        jmi_borrarPeli = new javax.swing.JMenuItem();
        jmi_modificarPeli = new javax.swing.JMenuItem();
        jmi_actualizarLista = new javax.swing.JMenuItem();
        pop_series = new javax.swing.JPopupMenu();
        jmi_crearSerie = new javax.swing.JMenuItem();
        jmi_borrarSerie = new javax.swing.JMenuItem();
        jmi_modificarSerie = new javax.swing.JMenuItem();
        jmi_actualizarLista2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jb_agregarFavoritos = new javax.swing.JButton();
        jb_verArbol = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_peliculas = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_series = new javax.swing.JList<>();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Bienvenido");

        jLabel4.setText("Correo");

        jLabel5.setText("Contrasena");

        jLabel6.setText("Fecha Nacimiento");

        jLabel7.setText("Tarjeta");

        jb_registrar2.setText("Registrar");
        jb_registrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registrar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_registrarLayout = new javax.swing.GroupLayout(jd_registrar.getContentPane());
        jd_registrar.getContentPane().setLayout(jd_registrarLayout);
        jd_registrarLayout.setHorizontalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registrarLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_correo)
                    .addComponent(tf_contrasena)
                    .addComponent(tf_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_registrarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_registrarLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_registrarLayout.createSequentialGroup()
                        .addComponent(jb_registrar2)
                        .addGap(155, 155, 155))))
        );
        jd_registrarLayout.setVerticalGroup(
            jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_registrarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jd_registrarLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(tf_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_registrarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jd_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jb_registrar2)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Tus peliculas y series favoritas");

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Favoritos");
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(arbol);

        tb_actualizarTabla.setText("Actualizar Tabla");
        tb_actualizarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_actualizarTablaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_arbolLayout = new javax.swing.GroupLayout(jd_arbol.getContentPane());
        jd_arbol.getContentPane().setLayout(jd_arbolLayout);
        jd_arbolLayout.setHorizontalGroup(
            jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_arbolLayout.createSequentialGroup()
                .addGroup(jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_arbolLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_arbolLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_arbolLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tb_actualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jd_arbolLayout.setVerticalGroup(
            jd_arbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_arbolLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(tb_actualizarTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Bienvenido");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Correo");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Contrasena");

        jb_login.setText("Log in");
        jb_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_loginMouseClicked(evt);
            }
        });

        jb_registrar.setText("Registrarse");
        jb_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_registrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login.getContentPane());
        Login.getContentPane().setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(LoginLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_contrasena2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(tf_correo2)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jb_login, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jb_registrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_correo2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_contrasena2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_login)
                    .addComponent(jb_registrar))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        jmi_CrearPeli.setText("Agregar Pelicula");
        jmi_CrearPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_CrearPeliActionPerformed(evt);
            }
        });
        pop_peli.add(jmi_CrearPeli);

        jmi_borrarPeli.setText("Eliminar Pelicula");
        jmi_borrarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_borrarPeliActionPerformed(evt);
            }
        });
        pop_peli.add(jmi_borrarPeli);

        jmi_modificarPeli.setText("Modificar Pelicula");
        jmi_modificarPeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarPeliActionPerformed(evt);
            }
        });
        pop_peli.add(jmi_modificarPeli);

        jmi_actualizarLista.setText("Ver informacion de la Pelicula");
        jmi_actualizarLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_actualizarListaActionPerformed(evt);
            }
        });
        pop_peli.add(jmi_actualizarLista);

        jmi_crearSerie.setText("Agregar Serie");
        jmi_crearSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_crearSerieActionPerformed(evt);
            }
        });
        pop_series.add(jmi_crearSerie);

        jmi_borrarSerie.setText("Eliminar Serie");
        jmi_borrarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_borrarSerieActionPerformed(evt);
            }
        });
        pop_series.add(jmi_borrarSerie);

        jmi_modificarSerie.setText("Modificar Serie");
        jmi_modificarSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_modificarSerieActionPerformed(evt);
            }
        });
        pop_series.add(jmi_modificarSerie);

        jmi_actualizarLista2.setText("Ver informacion de la Serie");
        jmi_actualizarLista2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmi_actualizarLista2ActionPerformed(evt);
            }
        });
        pop_series.add(jmi_actualizarLista2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Peliculas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Series");
        jLabel2.setToolTipText("");

        jb_agregarFavoritos.setText("Agregar a Favoritos");
        jb_agregarFavoritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregarFavoritosMouseClicked(evt);
            }
        });

        jb_verArbol.setText("Ver Lista de Favoritos");
        jb_verArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_verArbolMouseClicked(evt);
            }
        });

        jl_peliculas.setModel(new DefaultListModel());
        jl_peliculas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_peliculasMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jl_peliculas);

        jl_series.setModel(new DefaultListModel());
        jl_series.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_seriesMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jl_series);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jb_agregarFavoritos, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jb_verArbol))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_agregarFavoritos)
                    .addComponent(jb_verArbol))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void cargarLists(){
        DefaultListModel modelo = (DefaultListModel)jl_peliculas.getModel();
        DefaultListModel modelo2 = (DefaultListModel)jl_series.getModel();
        for (Usuario t : listaUsuarios) {
            for (Pelicula r : t.getPeliculas()) {
                modelo.addElement(r.getNombre() + "\n");
            }
            for (Serie b : t.getSeries()) {
                modelo2.addElement(b.getNombre()+ "\n");
            }
        }
        
        jl_peliculas.setModel(modelo);
        jl_series.setModel(modelo2);
    }
    
    
    private void jb_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_loginMouseClicked
   if ((listaUsuarios.get(0).getCorreo().equals("sc@gmail.com")) && (listaUsuarios.get(0).getContrasena().equals("1"))) {
            JOptionPane.showMessageDialog(this, "Bienvenido adminstrador. ");
            Login.setVisible(false);
            jb_agregarFavoritos.setEnabled(false);
            jb_verArbol.setEnabled(false);
            cargarLists();
            esAdmin = true;
        } else if (  (listaUsuarios.get(0).getCorreo().equals(tf_correo2.getText())) && ((listaUsuarios.get(0).getContrasena().equals(tf_contrasena2.getText())))  ){
            JOptionPane.showMessageDialog(this, "Bienvenido! ");
            Login.setVisible(false);
            cargarLists();
            
        }else 
            JOptionPane.showMessageDialog(this, "No esta registrado.");
    }//GEN-LAST:event_jb_loginMouseClicked

    private void jb_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_registrarMouseClicked
        // TODO add your handling code
       jd_registrar.setModal(true);
       jd_registrar.pack();
       jd_registrar.setLocationRelativeTo(null);
       jd_registrar.setVisible(true);
    }//GEN-LAST:event_jb_registrarMouseClicked

    private void jb_registrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registrar2ActionPerformed
        // TODO add your handling code here:
        administrarUsuarios au = new administrarUsuarios("./progra2/usuarios.txt");
        boolean fueCreado;
         u = new Usuario(tf_correo.getText(),tf_contrasena.getText(),tf_date.getDateFormatString(),tf_tarjeta.getText());
        try {au.cargarArchivo();
            au.setUsuario(u);
            au.escribirArchivo();
            fueCreado = true;
        } catch (IOException ex) {
            fueCreado=false;
        }
        
        if (fueCreado) {
            listaUsuarios.remove(0);
            listaUsuarios.add(u);
            pelis(0);
            serie(0);
            JOptionPane.showMessageDialog(this, "Se registro exitosamente. ");
        }else{
            JOptionPane.showMessageDialog(this,"Error al registrarse. Ingrese otra vez. ");
        }
        
        jd_registrar.setVisible(false);
    }//GEN-LAST:event_jb_registrar2ActionPerformed

    private void jb_agregarFavoritosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregarFavoritosMouseClicked
        // TODO add your handling code here:
        
        
        if (jl_peliculas.getSelectedIndex() >= 0 && (!esAdmin)) {
            String categoria = ((Usuario) listaUsuarios.get(0)).getPeliculas().get(jl_peliculas.getSelectedIndex()).getCategoria();
            int id = ((Usuario) listaUsuarios.get(0)).getPeliculas().get(jl_peliculas.getSelectedIndex()).getId();
            ((Usuario)listaUsuarios.get(0)).getPeliculasFav().add(new Pelicula(id, jl_peliculas.getSelectedValue(), categoria)) ;
            administrarUsuarios au = new administrarUsuarios("./progra2/usuarios.txt");
            au.cargarArchivo();
            au.getListaUsuarios2().add(u);
            au.setPelicula(id);
            try {
                au.escribirArchivo();
            } catch (IOException ex) {
            }
            
            JOptionPane.showMessageDialog(this, "se agrego a favoritos existosamente. ");
            jl_peliculas.clearSelection();
           
        } else if (jl_series.getSelectedIndex() >= 0 && (!esAdmin)) {
            String categoria = ((Usuario) listaUsuarios.get(0)).getSeries().get(jl_series.getSelectedIndex()).getCategoria();
            int id = ((Usuario) listaUsuarios.get(0)).getSeries().get(jl_series.getSelectedIndex()).getId();
            ((Usuario)listaUsuarios.get(0)).getSeriesFav().add(new Serie(id, jl_series.getSelectedValue(),categoria));
            administrarUsuarios au = new administrarUsuarios("./progra2/usuarios.txt");
            au.cargarArchivo();
            au.getListaUsuarios2().add(u);
            au.setSerie(id);
            try {
                au.escribirArchivo();
            } catch (IOException ex) {
            }
            
            JOptionPane.showMessageDialog(this, "se agrego a favoritos existosamente. ");
            jl_series.clearSelection();
            
        }else if (!esAdmin){
            JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna pelicula o serie. ");
        }else
            JOptionPane.showMessageDialog(this, "Administrador no agrega peliculas o series favoritas. ");
    }//GEN-LAST:event_jb_agregarFavoritosMouseClicked

    private void jb_verArbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_verArbolMouseClicked
        // TODO add your handling code here:
        if (!esAdmin) {
            jd_arbol.setModal(true);
            jd_arbol.pack();
            jd_arbol.setLocationRelativeTo(null);
            jd_arbol.setVisible(true);
        } else 
            JOptionPane.showMessageDialog(this, "Admin no tiene peliculas o series favoritas. ");
        
    }//GEN-LAST:event_jb_verArbolMouseClicked

    private void tb_actualizarTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_actualizarTablaMouseClicked
        // TODO add your handling code here: 
        if (!esAdmin) {
            DefaultTreeModel m = (DefaultTreeModel) arbol.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            DefaultMutableTreeNode nodo_cruces;//la categoriaaa
            for (Usuario t : listaUsuarios) {
                for (Pelicula r : t.getPeliculas()) {
                    for (Serie b : t.getSeries()) {

                        nodo_cruces = new DefaultMutableTreeNode(r.getCategoria());
                        int c = -1;
                        for (int i = 0; i < raiz.getChildCount(); i++) {
                            if (raiz.getChildAt(i).toString().equals(r.getCategoria())) {
                                c = 1;
                                DefaultMutableTreeNode p = new DefaultMutableTreeNode(r.getNombre());
                                ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                            }
                        }
                        if (c == -1) {
                            DefaultMutableTreeNode n = new DefaultMutableTreeNode(nodo_cruces);
                            DefaultMutableTreeNode p = new DefaultMutableTreeNode(r.getNombre());
                            n.add(p);
                            raiz.add(n);
                        }
                        m.reload();
                    }

                }
            }
        } 
        
   
           
        
        /*
             
        DefaultTreeModel m = (DefaultTreeModel) arbol.getModel();
            DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) m.getRoot();
            DefaultListModel pelis = (DefaultListModel) jl_peliculas.getModel();
            DefaultListModel series = (DefaultListModel) jl_series.getModel();
            int c = -1;
            
             for (int i = 0; i < raiz.getChildCount(); i++) {
                 String nombreCategoria = ((Usuario) listaUsuarios.get(0)).getPeliculas().get(i).getCategoria();
                 String nombrePeli = ((Usuario) listaUsuarios.get(0)).getPeliculas().get(i).getCategoria();
                 System.out.println("nombreCategoria: " + nombreCategoria + "nombrePeli: " + nombrePeli);
                 JOptionPane.showMessageDialog(this, "nombreCategoria: " + nombreCategoria + "nombrePeli: " + nombrePeli);
                 
                 if(raiz.getChildAt(i).toString().equals(nombreCategoria)){
                     DefaultMutableTreeNode p = new DefaultMutableTreeNode((Pelicula) pelis.get(i));
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(p);
                    c = 1;
                 }
                 
                 if(c == -1){
                DefaultMutableTreeNode n = new DefaultMutableTreeNode (nombreCategoria);
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(nombrePeli);
                n.add(p);
                raiz.add(n); 
                } 
             }    
             m.reload();
        
        */
        
        
    }//GEN-LAST:event_tb_actualizarTablaMouseClicked

    private void jl_peliculasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_peliculasMouseClicked
        // TODO add your handling code here:
        if (esAdmin && evt.isMetaDown() && jl_peliculas.getSelectedIndex()>= 0) {
            pop_peli.show(evt.getComponent(),evt.getX(),evt.getY());
            optionPeli = jl_peliculas.getSelectedIndex();
        }
    }//GEN-LAST:event_jl_peliculasMouseClicked

    private void jl_seriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_seriesMouseClicked
        // TODO add your handling code here:
        if (esAdmin && evt.isMetaDown() && jl_series.getSelectedIndex()>=0) {
            pop_series.show(evt.getComponent(),evt.getX(),evt.getY());
            optionSerie = jl_series.getSelectedIndex();
        }
    }//GEN-LAST:event_jl_seriesMouseClicked

    private void jmi_CrearPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_CrearPeliActionPerformed
        // TODO add your handling code here:
        DefaultListModel m = (DefaultListModel) jl_peliculas.getModel();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID de la pelicula: "));
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la pelicula: ");
        String categoria = JOptionPane.showInputDialog("Ingrese categoria de la pelicula: ");
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese duracion (horas) de la pelicula: "));
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese duracion (minutos) de la pelicula: "));
        int rating = Integer.parseInt(JOptionPane.showInputDialog("Ingrese rating de la pelicula: "));
        String productora = JOptionPane.showInputDialog("Ingrese productora de la pelicula: ");
        String director = JOptionPane.showInputDialog("Ingrese director de la pelicula: ");
        
        ((Usuario)listaUsuarios.get(0)).getPeliculas().add(new Pelicula(id, nombre, categoria, hora, minutos, rating, productora, director));
        m.addElement(nombre);
        jl_peliculas.setModel(m);
        JOptionPane.showMessageDialog(this, "Pelicula agregada exitosamente.");
        
    }//GEN-LAST:event_jmi_CrearPeliActionPerformed

    private void jmi_crearSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_crearSerieActionPerformed
        // TODO add your handling code here:
        DefaultListModel m = (DefaultListModel) jl_series.getModel();
        int numTemporadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de temporadas de la serie: "));
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID de la serie: "));
        String nombre = JOptionPane.showInputDialog("Ingrese nombre de la serie: ");
        String categoria = JOptionPane.showInputDialog("Ingrese categoria de la serie: ");
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese duracion (horas) de la serie: "));
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese duracion (minutos) de la serie: "));
        int rating = Integer.parseInt(JOptionPane.showInputDialog("Ingrese rating de la serie: "));
        String productora = JOptionPane.showInputDialog("Ingrese productora de la serie: ");
        String director = JOptionPane.showInputDialog("Ingrese director de la serie: ");
        ((Usuario)listaUsuarios.get(0)).getSeries().add(new Serie(numTemporadas, id, nombre, categoria, hora, minutos, rating, productora, director));
        m.addElement(nombre);
        jl_series.setModel(m);
        
        JOptionPane.showMessageDialog(this, "Serie agregada exitosamente.");
    }//GEN-LAST:event_jmi_crearSerieActionPerformed

    private void jmi_borrarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_borrarPeliActionPerformed
        // TODO add your handling code here:
            DefaultListModel m = (DefaultListModel) jl_peliculas.getModel();
            ((Usuario)listaUsuarios.get(0)).getPeliculas().remove(optionPeli);
            m.remove(optionPeli);
            jl_peliculas.setModel(m);
            JOptionPane.showMessageDialog(this, "Pelicula borrada exitosamente.");
        
    }//GEN-LAST:event_jmi_borrarPeliActionPerformed

    private void jmi_borrarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_borrarSerieActionPerformed
        // TODO add your handling code here:
            DefaultListModel m = (DefaultListModel) jl_series.getModel();
            ((Usuario)listaUsuarios.get(0)).getSeries().remove(optionSerie);
            m.remove(optionSerie);
            jl_series.setModel(m);
            JOptionPane.showMessageDialog(this, "Serie borrada exitosamente.");
        
    }//GEN-LAST:event_jmi_borrarSerieActionPerformed

    private void jmi_modificarPeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarPeliActionPerformed
        // TODO add your handling code here:
            DefaultListModel m = (DefaultListModel) jl_peliculas.getModel();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID nuevo de la pelicula: "));
        String nombre = JOptionPane.showInputDialog("Ingrese nombre nuevo de la pelicula: ");
        String categoria = JOptionPane.showInputDialog("Ingrese categoria nueva de la pelicula: ");
        int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva duracion (horas) de la pelicula: "));
        int minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva duracion (minutos) de la pelicula: "));
        int rating = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo rating de la pelicula: "));
        String productora = JOptionPane.showInputDialog("Ingrese nueva productora de la pelicula: ");
        String director = JOptionPane.showInputDialog("Ingrese nuevo director de la pelicula: ");
        
        ((Usuario)listaUsuarios.get(0)).getPeliculas().get(optionPeli).setId(id);
        ((Usuario)listaUsuarios.get(0)).getPeliculas().get(optionPeli).setNombre(nombre);
        ((Usuario)listaUsuarios.get(0)).getPeliculas().get(optionPeli).setCategoria(categoria);
        ((Usuario)listaUsuarios.get(0)).getPeliculas().get(optionPeli).setHora(hora);
        ((Usuario)listaUsuarios.get(0)).getPeliculas().get(optionPeli).setMinutos(minutos);
        ((Usuario)listaUsuarios.get(0)).getPeliculas().get(optionPeli).setRating(rating);
        ((Usuario)listaUsuarios.get(0)).getPeliculas().get(optionPeli).setProductora(productora);
        ((Usuario)listaUsuarios.get(0)).getPeliculas().get(optionPeli).setDirector(director);
        
        m.set(jl_peliculas.getSelectedIndex(), nombre);
        jl_peliculas.setModel(m);
        JOptionPane.showMessageDialog(this, "Pelicula modificada correctamente.");
        
    }//GEN-LAST:event_jmi_modificarPeliActionPerformed

    private void jmi_modificarSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_modificarSerieActionPerformed
        // TODO add your handling code here:
            DefaultListModel m = (DefaultListModel) jl_series.getModel();
            int numTemporadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo numero de temporadas de la serie: "));
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo ID de la serie: "));
            String nombre = JOptionPane.showInputDialog("Ingrese nuevo nombre de la serie: ");
            String categoria = JOptionPane.showInputDialog("Ingrese nueva categoria de la serie: ");
            int hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva duracion (horas) de la serie: "));
            int minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nueva duracion (minutos) de la serie: "));
            int rating = Integer.parseInt(JOptionPane.showInputDialog("Ingrese nuevo rating de la serie: "));
            String productora = JOptionPane.showInputDialog("Ingrese nueva productora de la serie: ");
            String director = JOptionPane.showInputDialog("Ingrese nuevo director de la serie: ");
            
            ((Usuario)listaUsuarios.get(0)).getSeries().get(optionSerie).setNumTemporadas(numTemporadas);
            ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).setId(id);
            ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).setNombre(nombre);
            ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).setCategoria(categoria);
            ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).setHora(hora);
            ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).setMinutos(minutos);
            ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).setRating(rating);
            ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).setProductora(productora);
            ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).setDirector(director);
            m.set(optionSerie, nombre);
            jl_series.setModel(m);
        JOptionPane.showMessageDialog(this, "Serie modificada correctamente.");
    }//GEN-LAST:event_jmi_modificarSerieActionPerformed

    private void jmi_actualizarListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_actualizarListaActionPerformed
        // TODO add your handling code here:
            JOptionPane.showMessageDialog(this, ""
                    + "ID: " + ((Usuario) listaUsuarios.get(0)).getPeliculas().get(optionPeli).getId() + "\n"
                    + "Nombre: " + ((Usuario) listaUsuarios.get(0)).getPeliculas().get(optionPeli).getNombre() + "\n"
                    + "Categoria: " + ((Usuario) listaUsuarios.get(0)).getPeliculas().get(optionPeli).getCategoria()+ "\n"
                    + "Duracion: Hora " + ((Usuario) listaUsuarios.get(0)).getPeliculas().get(optionPeli).getHora()+ " con " + ((Usuario) listaUsuarios.get(0)).getPeliculas().get(optionPeli).getMinutos()+ "minutos \n"
                    + "Rating: " + ((Usuario) listaUsuarios.get(0)).getPeliculas().get(optionPeli).getRating() + "\n"
                    + "Productora: " +((Usuario) listaUsuarios.get(0)).getPeliculas().get(optionPeli).getProductora() + "\n"
                    + "Director: " + ((Usuario) listaUsuarios.get(0)).getPeliculas().get(optionPeli).getDirector()+"\n"
                    + "");
    }//GEN-LAST:event_jmi_actualizarListaActionPerformed

    private void jmi_actualizarLista2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_actualizarLista2ActionPerformed
        // TODO add your handling code here:
            JOptionPane.showMessageDialog(this, ""
                    + "ID: " + ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).getId() + "\n"
                    + "Nombre: " + ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).getNombre() + "\n"
                    + "Categoria: " + ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).getCategoria()+ "\n"
                    + "Duracion: Hora " + ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).getHora()+ " con " + ((Usuario) listaUsuarios.get(0)).getPeliculas().get(optionSerie).getMinutos()+ "minutos \n"
                    + "Rating: " + ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).getRating() + "\n"
                    + "Productora: " +((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).getProductora() + "\n"
                    + "Director: " + ((Usuario) listaUsuarios.get(0)).getSeries().get(optionSerie).getDirector()+"\n"
                    + "Numero de Temporadas:" + ((Usuario)listaUsuarios.get(0)).getSeries().get(optionSerie).getNumTemporadas());
    }//GEN-LAST:event_jmi_actualizarLista2ActionPerformed

    /**
     * @param args the command line arguments
//     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UniFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UniFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UniFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UniFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new UniFlix().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Login;
    private javax.swing.JTree arbol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jb_agregarFavoritos;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_registrar;
    private javax.swing.JButton jb_registrar2;
    private javax.swing.JButton jb_verArbol;
    private javax.swing.JDialog jd_arbol;
    private javax.swing.JDialog jd_registrar;
    private javax.swing.JList<String> jl_peliculas;
    private javax.swing.JList<String> jl_series;
    private javax.swing.JMenuItem jmi_CrearPeli;
    private javax.swing.JMenuItem jmi_actualizarLista;
    private javax.swing.JMenuItem jmi_actualizarLista2;
    private javax.swing.JMenuItem jmi_borrarPeli;
    private javax.swing.JMenuItem jmi_borrarSerie;
    private javax.swing.JMenuItem jmi_crearSerie;
    private javax.swing.JMenuItem jmi_modificarPeli;
    private javax.swing.JMenuItem jmi_modificarSerie;
    private javax.swing.JPopupMenu pop_peli;
    private javax.swing.JPopupMenu pop_series;
    private javax.swing.JButton tb_actualizarTabla;
    private javax.swing.JTextField tf_contrasena;
    private javax.swing.JTextField tf_contrasena2;
    private javax.swing.JTextField tf_correo;
    private javax.swing.JTextField tf_correo2;
    private com.toedter.calendar.JDateChooser tf_date;
    private javax.swing.JTextField tf_tarjeta;
    // End of variables declaration//GEN-END:variables
}
