
package Vista;

import AppPackage.AnimationClass;
import Controlador.Driver_login;
import javax.swing.BorderFactory;

public class Frame_login extends javax.swing.JFrame {
    //ATRIBUTOS
    AnimationClass controlador;
    Driver_login driver_login;
    public Frame_login() {
        initComponents();
        this.setLocationRelativeTo(null);
        controlador = new AnimationClass();
        driver_login = new Driver_login(this);
        //Listeners
        Boton_ingresar.addActionListener(driver_login);
        Icono_ajustes.addMouseListener(driver_login);
        Icono_busquedas.addMouseListener(driver_login);
        Icono_detalles.addMouseListener(driver_login);
        Icono_salir.addMouseListener(driver_login);
        Icono_modificaciones.addMouseListener(driver_login);
        Icono_consultas.addMouseListener(driver_login);
    }
    public Driver_login getInstance(){
        return this.driver_login;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_usuario = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Campo_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Campo_contraseña = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        Boton_ingresar = new javax.swing.JButton();
        Panel_iconos = new javax.swing.JPanel();
        Icono_consultas = new javax.swing.JLabel();
        Label_consultas = new javax.swing.JLabel();
        Icono_detalles = new javax.swing.JLabel();
        Label_detalles = new javax.swing.JLabel();
        Icono_ajustes = new javax.swing.JLabel();
        Label_ajustes = new javax.swing.JLabel();
        Icono_modificaciones = new javax.swing.JLabel();
        Label_modificaciones = new javax.swing.JLabel();
        Icono_busquedas = new javax.swing.JLabel();
        Label_busquedas = new javax.swing.JLabel();
        Icono_configuracion = new javax.swing.JLabel();
        Label_configuracion = new javax.swing.JLabel();
        Panel_barra = new javax.swing.JPanel();
        Icono_minimizar = new javax.swing.JLabel();
        Icono_salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_usuario.setBackground(new java.awt.Color(255, 255, 255));
        Panel_usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_usuario.setForeground(new java.awt.Color(255, 255, 255));
        Panel_usuario.setPreferredSize(new java.awt.Dimension(290, 625));
        Panel_usuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/usuario128.png"))); // NOI18N
        Panel_usuario.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 160, 180));

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(53, 117, 173));
        jLabel3.setText("Contraseña:");
        Panel_usuario.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        Campo_usuario.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_usuario.setBorder(null);
        Panel_usuario.add(Campo_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 210, 30));

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(53, 117, 173));
        jLabel4.setText("Usuario:");
        Panel_usuario.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Panel_usuario.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 210, 10));

        Campo_contraseña.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_contraseña.setBorder(null);
        Panel_usuario.add(Campo_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 210, 40));

        jSeparator2.setForeground(new java.awt.Color(102, 102, 102));
        Panel_usuario.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 210, 10));

        Boton_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/button_ingresar.png"))); // NOI18N
        Boton_ingresar.setText("jButton1");
        Boton_ingresar.setBorder(null);
        Boton_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ingresarActionPerformed(evt);
            }
        });
        Panel_usuario.add(Boton_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 140, 40));

        getContentPane().add(Panel_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 630));

        Panel_iconos.setBackground(new java.awt.Color(255, 255, 255));
        Panel_iconos.setForeground(new java.awt.Color(255, 255, 255));
        Panel_iconos.setLayout(null);

        Icono_consultas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono_consultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/expediente128.png"))); // NOI18N
        Icono_consultas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Icono_consultasMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Icono_consultasMouseMoved(evt);
            }
        });
        Icono_consultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Icono_consultasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Icono_consultasMouseExited(evt);
            }
        });
        Panel_iconos.add(Icono_consultas);
        Icono_consultas.setBounds(-300, 50, 160, 150);

        Label_consultas.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        Label_consultas.setForeground(new java.awt.Color(53, 117, 173));
        Label_consultas.setText("Consultas");
        Panel_iconos.add(Label_consultas);
        Label_consultas.setBounds(-250, 240, 86, 23);

        Icono_detalles.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono_detalles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/detalles128.png"))); // NOI18N
        Icono_detalles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Icono_detallesMouseMoved(evt);
            }
        });
        Icono_detalles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Icono_detallesMouseExited(evt);
            }
        });
        Panel_iconos.add(Icono_detalles);
        Icono_detalles.setBounds(-300, 330, 160, 150);

        Label_detalles.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        Label_detalles.setForeground(new java.awt.Color(53, 117, 173));
        Label_detalles.setText("Detalles de cuenta");
        Panel_iconos.add(Label_detalles);
        Label_detalles.setBounds(-300, 510, 164, 23);

        Icono_ajustes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/controles128.png"))); // NOI18N
        Icono_ajustes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Icono_ajustesMouseMoved(evt);
            }
        });
        Icono_ajustes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Icono_ajustesMouseExited(evt);
            }
        });
        Panel_iconos.add(Icono_ajustes);
        Icono_ajustes.setBounds(-220, 330, 160, 150);

        Label_ajustes.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        Label_ajustes.setForeground(new java.awt.Color(53, 117, 173));
        Label_ajustes.setText("Ajustes de cuenta");
        Panel_iconos.add(Label_ajustes);
        Label_ajustes.setBounds(-210, 510, 158, 23);

        Icono_modificaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono_modificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/modificacion128.png"))); // NOI18N
        Icono_modificaciones.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Icono_modificacionesMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Icono_modificacionesMouseMoved(evt);
            }
        });
        Icono_modificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Icono_modificacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Icono_modificacionesMouseExited(evt);
            }
        });
        Panel_iconos.add(Icono_modificaciones);
        Icono_modificaciones.setBounds(-400, 330, 160, 150);

        Label_modificaciones.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        Label_modificaciones.setForeground(new java.awt.Color(53, 117, 173));
        Label_modificaciones.setText("Modificaciones");
        Panel_iconos.add(Label_modificaciones);
        Label_modificaciones.setBounds(-390, 510, 134, 23);

        Icono_busquedas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono_busquedas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa128.png"))); // NOI18N
        Icono_busquedas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Icono_busquedasMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Icono_busquedasMouseMoved(evt);
            }
        });
        Icono_busquedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Icono_busquedasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Icono_busquedasMouseExited(evt);
            }
        });
        Panel_iconos.add(Icono_busquedas);
        Icono_busquedas.setBounds(-300, 50, 160, 150);

        Label_busquedas.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        Label_busquedas.setForeground(new java.awt.Color(53, 117, 173));
        Label_busquedas.setText("Buscar Libros");
        Panel_iconos.add(Label_busquedas);
        Label_busquedas.setBounds(-290, 240, 118, 23);

        Icono_configuracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono_configuracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/configuracion128.png"))); // NOI18N
        Icono_configuracion.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Icono_configuracionMouseMoved(evt);
            }
        });
        Icono_configuracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Icono_configuracionMouseExited(evt);
            }
        });
        Panel_iconos.add(Icono_configuracion);
        Icono_configuracion.setBounds(-220, 330, 160, 150);

        Label_configuracion.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        Label_configuracion.setForeground(new java.awt.Color(53, 117, 173));
        Label_configuracion.setText("Configuracion");
        Panel_iconos.add(Label_configuracion);
        Label_configuracion.setBounds(-200, 510, 128, 23);

        getContentPane().add(Panel_iconos, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 750, 580));

        Panel_barra.setBackground(new java.awt.Color(255, 255, 255));
        Panel_barra.setForeground(new java.awt.Color(255, 255, 255));
        Panel_barra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Icono_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/minimizar.png"))); // NOI18N
        Icono_minimizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Icono_minimizarMouseMoved(evt);
            }
        });
        Icono_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Icono_minimizarMouseExited(evt);
            }
        });
        Panel_barra.add(Icono_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 30, 28));

        Icono_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        Icono_salir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Icono_salirMouseMoved(evt);
            }
        });
        Icono_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Icono_salirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Icono_salirMouseExited(evt);
            }
        });
        Panel_barra.add(Icono_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 30, 28));

        getContentPane().add(Panel_barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 750, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Icono_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Icono_salirMouseClicked

    private void Icono_consultasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_consultasMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Icono_consultasMouseDragged

    private void Icono_consultasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_consultasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Icono_consultasMouseEntered

    private void Icono_consultasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_consultasMouseMoved
        Icono_consultas.setBorder(BorderFactory.createLineBorder(new java.awt.Color(172,172,172)));
    }//GEN-LAST:event_Icono_consultasMouseMoved

    private void Icono_consultasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_consultasMouseExited
        Icono_consultas.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_Icono_consultasMouseExited

    private void Icono_detallesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_detallesMouseMoved
        Icono_detalles.setBorder(BorderFactory.createLineBorder(new java.awt.Color(172,172,172)));
    }//GEN-LAST:event_Icono_detallesMouseMoved

    private void Icono_detallesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_detallesMouseExited
        Icono_detalles.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_Icono_detallesMouseExited

    private void Icono_ajustesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_ajustesMouseMoved
        Icono_ajustes.setBorder(BorderFactory.createLineBorder(new java.awt.Color(172,172,172)));
    }//GEN-LAST:event_Icono_ajustesMouseMoved

    private void Icono_ajustesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_ajustesMouseExited
        Icono_ajustes.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_Icono_ajustesMouseExited

    private void Icono_salirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_salirMouseMoved
        Icono_salir.setBorder(BorderFactory.createLineBorder(new java.awt.Color(172,172,172)));
    }//GEN-LAST:event_Icono_salirMouseMoved

    private void Icono_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_salirMouseExited
        Icono_salir.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_Icono_salirMouseExited

    private void Icono_minimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_minimizarMouseMoved
        Icono_minimizar.setBorder(BorderFactory.createLineBorder(new java.awt.Color(172,172,172)));
    }//GEN-LAST:event_Icono_minimizarMouseMoved

    private void Icono_minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_minimizarMouseExited
        Icono_minimizar.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_Icono_minimizarMouseExited

    private void Icono_modificacionesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_modificacionesMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Icono_modificacionesMouseDragged

    private void Icono_modificacionesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_modificacionesMouseMoved
        Icono_modificaciones.setBorder(BorderFactory.createLineBorder(new java.awt.Color(172,172,172)));
    }//GEN-LAST:event_Icono_modificacionesMouseMoved

    private void Icono_modificacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_modificacionesMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Icono_modificacionesMouseEntered

    private void Icono_modificacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_modificacionesMouseExited
        Icono_modificaciones.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_Icono_modificacionesMouseExited

    private void Icono_busquedasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_busquedasMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_Icono_busquedasMouseDragged

    private void Icono_busquedasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_busquedasMouseMoved
        Icono_busquedas.setBorder(BorderFactory.createLineBorder(new java.awt.Color(172,172,172)));
    }//GEN-LAST:event_Icono_busquedasMouseMoved

    private void Icono_busquedasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_busquedasMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Icono_busquedasMouseEntered

    private void Icono_busquedasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_busquedasMouseExited
        Icono_busquedas.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_Icono_busquedasMouseExited

    private void Boton_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ingresarActionPerformed
    }//GEN-LAST:event_Boton_ingresarActionPerformed

    private void Icono_configuracionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_configuracionMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_Icono_configuracionMouseMoved

    private void Icono_configuracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Icono_configuracionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Icono_configuracionMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Boton_ingresar;
    public javax.swing.JPasswordField Campo_contraseña;
    public javax.swing.JTextField Campo_usuario;
    public javax.swing.JLabel Icono_ajustes;
    public javax.swing.JLabel Icono_busquedas;
    public javax.swing.JLabel Icono_configuracion;
    public javax.swing.JLabel Icono_consultas;
    public javax.swing.JLabel Icono_detalles;
    private javax.swing.JLabel Icono_minimizar;
    public javax.swing.JLabel Icono_modificaciones;
    private javax.swing.JLabel Icono_salir;
    public javax.swing.JLabel Label_ajustes;
    public javax.swing.JLabel Label_busquedas;
    public javax.swing.JLabel Label_configuracion;
    public javax.swing.JLabel Label_consultas;
    public javax.swing.JLabel Label_detalles;
    public javax.swing.JLabel Label_modificaciones;
    public javax.swing.JPanel Panel_barra;
    public javax.swing.JPanel Panel_iconos;
    public javax.swing.JPanel Panel_usuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
