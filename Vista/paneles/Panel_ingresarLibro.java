
package Vista.paneles;

public class Panel_ingresarLibro extends javax.swing.JPanel {

    public Panel_ingresarLibro() {
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
        jLabel8 = new javax.swing.JLabel();
        Campo_edicion = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        Campo_notas = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Boton_ingresar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        Campo_categoria = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Título:");
        add(jLabel7);
        jLabel7.setBounds(30, 30, 54, 23);

        Campo_titulo.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_titulo.setBorder(null);
        add(Campo_titulo);
        Campo_titulo.setBounds(120, 30, 200, 20);

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator4);
        jSeparator4.setBounds(120, 50, 200, 10);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Autor:");
        add(jLabel9);
        jLabel9.setBounds(390, 30, 56, 23);

        Campo_autor.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_autor.setBorder(null);
        add(Campo_autor);
        Campo_autor.setBounds(480, 30, 270, 20);

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator6);
        jSeparator6.setBounds(480, 50, 270, 10);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Edición:");
        add(jLabel8);
        jLabel8.setBounds(30, 90, 71, 23);

        Campo_edicion.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_edicion.setBorder(null);
        add(Campo_edicion);
        Campo_edicion.setBounds(120, 89, 160, 21);

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator5);
        jSeparator5.setBounds(120, 110, 160, 10);

        jLabel10.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("Notas:");
        add(jLabel10);
        jLabel10.setBounds(30, 150, 57, 23);

        Campo_notas.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_notas.setBorder(null);
        add(Campo_notas);
        Campo_notas.setBounds(100, 150, 650, 20);

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator7);
        jSeparator7.setBounds(100, 170, 650, 10);

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
        jScrollPane1.setBounds(30, 220, 750, 230);

        Boton_ingresar.setText("INGRESAR");
        add(Boton_ingresar);
        Boton_ingresar.setBounds(340, 480, 110, 40);

        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Categoria:");
        add(jLabel11);
        jLabel11.setBounds(310, 90, 110, 23);

        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator8);
        jSeparator8.setBounds(420, 110, 250, 10);

        Campo_categoria.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_categoria.setBorder(null);
        add(Campo_categoria);
        Campo_categoria.setBounds(420, 90, 250, 20);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Boton_ingresar;
    public javax.swing.JTextField Campo_autor;
    public javax.swing.JTextField Campo_categoria;
    public javax.swing.JTextField Campo_edicion;
    public javax.swing.JTextField Campo_notas;
    public javax.swing.JTextField Campo_titulo;
    public javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}
