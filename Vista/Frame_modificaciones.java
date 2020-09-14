
package Vista;

import AppPackage.AnimationClass;
import Controlador.Driver_modificaciones;
import Vista.paneles.Panel_eliminarEstudiante;
import Vista.paneles.Panel_eliminarLibro;
import Vista.paneles.Panel_ingresarEstudiante;
import Vista.paneles.Panel_ingresarLibro;
import Vista.paneles.Panel_modificarEstudiante;
import Vista.paneles.Panel_modificarLibro;
import javax.swing.BorderFactory;

public class Frame_modificaciones extends javax.swing.JFrame {
    //Objetos
    private AnimationClass controlador;
    private Driver_modificaciones driver_modificaciones;
    public Panel_eliminarEstudiante P_eliminarEstudiante;
    public Panel_eliminarLibro P_eliminarLibro;
    public Panel_ingresarEstudiante P_ingresarEstudiante;
    public Panel_ingresarLibro P_ingresarLibro;
    public Panel_modificarEstudiante P_modificarEstudiante;
    public Panel_modificarLibro P_modificarLibro;
    //Paneles
    
    public Frame_modificaciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1025, 625);
        controlador = new AnimationClass();
        driver_modificaciones = new Driver_modificaciones(this);
        //Listeners
        Label_ingresarE.addMouseListener(driver_modificaciones);
        Label_ingresarL.addMouseListener(driver_modificaciones);
        Label_eliminarE.addMouseListener(driver_modificaciones);
        Label_eliminarL.addMouseListener(driver_modificaciones);
        Label_modificarE.addMouseListener(driver_modificaciones);
        Label_modificarL.addMouseListener(driver_modificaciones);
        //Paneles
        P_eliminarEstudiante = new Panel_eliminarEstudiante();
        P_eliminarLibro = new Panel_eliminarLibro();
        P_ingresarEstudiante = new Panel_ingresarEstudiante();
        P_ingresarLibro = new Panel_ingresarLibro();
        P_modificarEstudiante = new Panel_modificarEstudiante();
        P_modificarLibro = new Panel_modificarLibro();
        Panel_modificaciones.add(P_eliminarEstudiante);
        Panel_modificaciones.add(P_eliminarLibro);
        Panel_modificaciones.add(P_ingresarEstudiante);
        Panel_modificaciones.add(P_ingresarLibro);
        Panel_modificaciones.add(P_modificarEstudiante);
        Panel_modificaciones.add(P_modificarLibro);
        //LISTER
        P_ingresarEstudiante.Boton_ingresar.addActionListener(driver_modificaciones);
        P_ingresarLibro.Boton_ingresar.addActionListener(driver_modificaciones);
        P_eliminarEstudiante.Boton_verificar.addActionListener(driver_modificaciones);
        P_eliminarEstudiante.Boton_eliminar.addActionListener(driver_modificaciones);
        P_eliminarLibro.Boton_verificar.addActionListener(driver_modificaciones);
        P_eliminarLibro.Boton_eliminar.addActionListener(driver_modificaciones);
        P_modificarEstudiante.Boton_verEstudiante.addActionListener(driver_modificaciones);
        P_modificarEstudiante.Boton_modificar.addActionListener(driver_modificaciones);
        P_modificarEstudiante.Boton_contraseña.addActionListener(driver_modificaciones);
        P_modificarLibro.Boton_verLibro.addActionListener(driver_modificaciones);
        P_modificarLibro.Boton_modificar.addActionListener(driver_modificaciones);
        
    }
    public Driver_modificaciones getInstance(){
        return this.driver_modificaciones;
    }
    public void ocultarPaneles(){
        this.P_eliminarEstudiante.setVisible(false);
        this.P_eliminarLibro.setVisible(false);
        this.P_ingresarEstudiante.setVisible(false);
        this.P_ingresarLibro.setVisible(false);
        this.P_modificarEstudiante.setVisible(false);
        this.P_modificarLibro.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label_modificar = new javax.swing.JLabel();
        iconoborrador = new javax.swing.JLabel();
        iconoModificar = new javax.swing.JLabel();
        iconoIngresar = new javax.swing.JLabel();
        Label_eliminar = new javax.swing.JLabel();
        Label_ingresarL = new javax.swing.JLabel();
        Label_ingresar = new javax.swing.JLabel();
        Label_ingresarE = new javax.swing.JLabel();
        Label_modificarP = new javax.swing.JLabel();
        Label_modificarL = new javax.swing.JLabel();
        Label_eliminarE = new javax.swing.JLabel();
        Label_eliminarL = new javax.swing.JLabel();
        Label_modificarE = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        minimizar = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Panel_modificaciones = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        Label_modificar.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_modificar.setForeground(new java.awt.Color(255, 124, 54));
        Label_modificar.setText("Modificar");
        Label_modificar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Label_modificarMouseMoved(evt);
            }
        });
        Label_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_modificarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label_modificarMouseExited(evt);
            }
        });
        jPanel1.add(Label_modificar);
        Label_modificar.setBounds(70, 290, 80, 23);

        iconoborrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoborrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/borrador24.png"))); // NOI18N
        jPanel1.add(iconoborrador);
        iconoborrador.setBounds(30, 150, 30, 40);

        iconoModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar24.png"))); // NOI18N
        jPanel1.add(iconoModificar);
        iconoModificar.setBounds(30, 280, 30, 40);

        iconoIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ingresar24.png"))); // NOI18N
        jPanel1.add(iconoIngresar);
        iconoIngresar.setBounds(30, 20, 30, 40);

        Label_eliminar.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_eliminar.setForeground(new java.awt.Color(255, 124, 54));
        Label_eliminar.setText("Eliminar");
        Label_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_eliminarMouseClicked(evt);
            }
        });
        jPanel1.add(Label_eliminar);
        Label_eliminar.setBounds(70, 160, 73, 23);

        Label_ingresarL.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_ingresarL.setForeground(new java.awt.Color(102, 102, 102));
        Label_ingresarL.setText("Libros");
        jPanel1.add(Label_ingresarL);
        Label_ingresarL.setBounds(50, 110, 100, 23);

        Label_ingresar.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_ingresar.setForeground(new java.awt.Color(255, 124, 54));
        Label_ingresar.setText("Ingresar");
        jPanel1.add(Label_ingresar);
        Label_ingresar.setBounds(70, 30, 73, 23);

        Label_ingresarE.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_ingresarE.setForeground(new java.awt.Color(102, 102, 102));
        Label_ingresarE.setText("Estudiantes");
        jPanel1.add(Label_ingresarE);
        Label_ingresarE.setBounds(50, 80, 100, 23);

        Label_modificarP.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_modificarP.setForeground(new java.awt.Color(102, 102, 102));
        Label_modificarP.setText("Prestamos");
        jPanel1.add(Label_modificarP);
        Label_modificarP.setBounds(50, 400, 100, 23);

        Label_modificarL.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_modificarL.setForeground(new java.awt.Color(102, 102, 102));
        Label_modificarL.setText("Libros");
        jPanel1.add(Label_modificarL);
        Label_modificarL.setBounds(50, 370, 100, 23);

        Label_eliminarE.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_eliminarE.setForeground(new java.awt.Color(102, 102, 102));
        Label_eliminarE.setText("Estudiantes");
        jPanel1.add(Label_eliminarE);
        Label_eliminarE.setBounds(50, 210, 100, 23);

        Label_eliminarL.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_eliminarL.setForeground(new java.awt.Color(102, 102, 102));
        Label_eliminarL.setText("Libros");
        jPanel1.add(Label_eliminarL);
        Label_eliminarL.setBounds(50, 240, 100, 23);

        Label_modificarE.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_modificarE.setForeground(new java.awt.Color(102, 102, 102));
        Label_modificarE.setText("Estudiantes");
        jPanel1.add(Label_modificarE);
        Label_modificarE.setBounds(50, 340, 100, 23);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 160, 580));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/minimizar.png"))); // NOI18N
        minimizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                minimizarMouseMoved(evt);
            }
        });
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizarMouseExited(evt);
            }
        });
        jPanel3.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 30, 28));

        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        salir.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                salirMouseMoved(evt);
            }
        });
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });
        jPanel3.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 30, 28));

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel5.setText("MODIFICACIONES");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 23));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Panel_modificaciones.setBackground(new java.awt.Color(255, 255, 255));
        Panel_modificaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_modificaciones.setLayout(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Panel_modificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Panel_modificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 870, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseMoved
        minimizar.setBorder(BorderFactory.createLineBorder(new java.awt.Color(172,172,172)));
    }//GEN-LAST:event_minimizarMouseMoved

    private void minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseExited
        minimizar.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_minimizarMouseExited

    private void salirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseMoved
        salir.setBorder(BorderFactory.createLineBorder(new java.awt.Color(172,172,172)));
    }//GEN-LAST:event_salirMouseMoved

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_salirMouseClicked

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        salir.setBorder(BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_salirMouseExited

    private void Label_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_eliminarMouseClicked

    }//GEN-LAST:event_Label_eliminarMouseClicked

    private void Label_modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_modificarMouseExited

    }//GEN-LAST:event_Label_modificarMouseExited

    private void Label_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_modificarMouseClicked

    }//GEN-LAST:event_Label_modificarMouseClicked

    private void Label_modificarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_modificarMouseMoved

    }//GEN-LAST:event_Label_modificarMouseMoved

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
            java.util.logging.Logger.getLogger(Frame_modificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_modificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_modificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_modificaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_modificaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_eliminar;
    public javax.swing.JLabel Label_eliminarE;
    public javax.swing.JLabel Label_eliminarL;
    public javax.swing.JLabel Label_ingresar;
    public javax.swing.JLabel Label_ingresarE;
    public javax.swing.JLabel Label_ingresarL;
    private javax.swing.JLabel Label_modificar;
    public javax.swing.JLabel Label_modificarE;
    public javax.swing.JLabel Label_modificarL;
    public javax.swing.JLabel Label_modificarP;
    public javax.swing.JPanel Panel_modificaciones;
    private javax.swing.JLabel iconoIngresar;
    private javax.swing.JLabel iconoModificar;
    private javax.swing.JLabel iconoborrador;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel minimizar;
    private javax.swing.JLabel salir;
    // End of variables declaration//GEN-END:variables
}
