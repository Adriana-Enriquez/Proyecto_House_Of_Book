/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Controlador.Driver_consultas;
import Vista.paneles.Panel_consultarEstudiante;
import Vista.paneles.Panel_consultarLibro;
import Vista.paneles.Panel_consultarPrestamos;


/**
 *
 * @author lexsw
 */
public class Frame_consultas extends javax.swing.JFrame {
    //Objetos
    private Driver_consultas driver_consultas;
    public Panel_consultarEstudiante P_consultarEstudiante;
    public Panel_consultarLibro P_consultarLibro;
    public Panel_consultarPrestamos P_consultarPrestamos;
    public Frame_consultas() {
        initComponents();
        this.setLocationRelativeTo(null);
        driver_consultas = new Driver_consultas(this);
        //Listeners
        Label_Estudiantes.addMouseListener(driver_consultas);
        Label_libros.addMouseListener(driver_consultas);
        Label_prestamos.addMouseListener(driver_consultas);
        //Paneles
        P_consultarEstudiante = new Panel_consultarEstudiante();
        P_consultarLibro = new Panel_consultarLibro();
        P_consultarPrestamos = new Panel_consultarPrestamos();
        Panel_consultas.add(P_consultarEstudiante);
        Panel_consultas.add(P_consultarLibro);
        Panel_consultas.add(P_consultarPrestamos);
    }
    //Obtener Instancia
    public Driver_consultas getInstance(){
        return this.driver_consultas;
    }
    //Ocultar Paneles
    public void ocultarPaneles(){
        P_consultarEstudiante.setVisible(false);
        P_consultarLibro.setVisible(false);
        P_consultarPrestamos.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Panel_consultas = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        iconoModificar = new javax.swing.JLabel();
        iconoborrador = new javax.swing.JLabel();
        iconoIngresar = new javax.swing.JLabel();
        Label_Estudiantes = new javax.swing.JLabel();
        Label_libros = new javax.swing.JLabel();
        Label_prestamos = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_consultas.setBackground(new java.awt.Color(255, 255, 255));
        Panel_consultas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_consultas.setPreferredSize(new java.awt.Dimension(816, 539));
        Panel_consultas.setLayout(null);
        jPanel1.add(Panel_consultas, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 816, 539));

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel5.setText("CONSULTAS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 150, 23));

        iconoModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/editar24.png"))); // NOI18N
        jPanel1.add(iconoModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        iconoborrador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoborrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/borrador24.png"))); // NOI18N
        jPanel1.add(iconoborrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        iconoIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconoIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ingresar24.png"))); // NOI18N
        jPanel1.add(iconoIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        Label_Estudiantes.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_Estudiantes.setForeground(new java.awt.Color(53, 164, 3));
        Label_Estudiantes.setText("Estudiantes");
        Label_Estudiantes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Label_EstudiantesMouseMoved(evt);
            }
        });
        Label_Estudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_EstudiantesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Label_EstudiantesMouseExited(evt);
            }
        });
        jPanel1.add(Label_Estudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        Label_libros.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_libros.setForeground(new java.awt.Color(53, 164, 3));
        Label_libros.setText("Libros");
        Label_libros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Label_librosMouseClicked(evt);
            }
        });
        jPanel1.add(Label_libros, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        Label_prestamos.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Label_prestamos.setForeground(new java.awt.Color(53, 164, 3));
        Label_prestamos.setText("Prestamos");
        jPanel1.add(Label_prestamos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

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
        jPanel1.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, 30, 28));

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
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 30, 28));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Label_librosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_librosMouseClicked

    }//GEN-LAST:event_Label_librosMouseClicked

    private void Label_EstudiantesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_EstudiantesMouseMoved

    }//GEN-LAST:event_Label_EstudiantesMouseMoved

    private void Label_EstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_EstudiantesMouseClicked

    }//GEN-LAST:event_Label_EstudiantesMouseClicked

    private void Label_EstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Label_EstudiantesMouseExited

    }//GEN-LAST:event_Label_EstudiantesMouseExited

    private void minimizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseMoved

    }//GEN-LAST:event_minimizarMouseMoved

    private void minimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseExited

    }//GEN-LAST:event_minimizarMouseExited

    private void salirMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseMoved

    }//GEN-LAST:event_salirMouseMoved

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_salirMouseClicked

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited

    }//GEN-LAST:event_salirMouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Frame_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_consultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Label_Estudiantes;
    public javax.swing.JLabel Label_libros;
    public javax.swing.JLabel Label_prestamos;
    public javax.swing.JPanel Panel_consultas;
    private javax.swing.JLabel iconoIngresar;
    private javax.swing.JLabel iconoModificar;
    private javax.swing.JLabel iconoborrador;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel minimizar;
    private javax.swing.JLabel salir;
    // End of variables declaration//GEN-END:variables
}
