
package Vista.paneles;

public class Panel_eliminarLibro extends javax.swing.JPanel {

    public Panel_eliminarLibro() {
        initComponents();
        this.setSize(816, 542);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        Campo_titulo = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        Campo_autor = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        Campo_id = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        Boton_verificar = new javax.swing.JButton();
        Boton_eliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Título:");
        add(jLabel7);
        jLabel7.setBounds(30, 70, 54, 23);

        Campo_titulo.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_titulo.setBorder(null);
        add(Campo_titulo);
        Campo_titulo.setBounds(120, 70, 200, 20);

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator4);
        jSeparator4.setBounds(120, 90, 200, 10);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Autor:");
        add(jLabel9);
        jLabel9.setBounds(390, 70, 56, 23);

        Campo_autor.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_autor.setBorder(null);
        add(Campo_autor);
        Campo_autor.setBounds(480, 70, 270, 20);

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator6);
        jSeparator6.setBounds(480, 90, 270, 10);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID ", "Título", "Categoria", "Autor", "Edición", "Notas", "Disponible"
            }
        ));
        jScrollPane1.setViewportView(Tabla);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 160, 750, 270);

        jLabel10.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("ID Libro:");
        add(jLabel10);
        jLabel10.setBounds(40, 470, 76, 23);

        Campo_id.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_id.setBorder(null);
        add(Campo_id);
        Campo_id.setBounds(170, 470, 200, 20);

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator7);
        jSeparator7.setBounds(170, 490, 200, 10);

        Boton_verificar.setText("Verificar");
        add(Boton_verificar);
        Boton_verificar.setBounds(430, 470, 160, 26);

        Boton_eliminar.setText("Eliminar");
        add(Boton_eliminar);
        Boton_eliminar.setBounds(620, 470, 160, 26);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Boton_eliminar;
    public javax.swing.JButton Boton_verificar;
    public javax.swing.JTextField Campo_autor;
    public javax.swing.JTextField Campo_id;
    public javax.swing.JTextField Campo_titulo;
    public javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables
}
