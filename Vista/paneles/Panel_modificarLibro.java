
package Vista.paneles;

public class Panel_modificarLibro extends javax.swing.JPanel {

    public Panel_modificarLibro() {
        initComponents();
        this.setSize(816, 542);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        Campo_id = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Boton_verLibro = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_vista = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_resultados = new javax.swing.JTable();
        Boton_modificar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Campo_titulo = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        Campo_autor = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        Campo_edicion = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        Campo_categoria = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        Campo_notas = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Id del Libro:");
        add(jLabel7);
        jLabel7.setBounds(30, 30, 105, 23);

        Campo_id.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_id.setBorder(null);
        add(Campo_id);
        Campo_id.setBounds(150, 30, 250, 20);

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator4);
        jSeparator4.setBounds(150, 50, 250, 10);

        Boton_verLibro.setText("Ver Libro");
        add(Boton_verLibro);
        Boton_verLibro.setBounds(500, 30, 240, 26);

        Tabla_vista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Categoría", "Autor", "Edicion", "Notas", "Disponible"
            }
        ));
        jScrollPane2.setViewportView(Tabla_vista);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 90, 710, 50);

        Tabla_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Categoría", "Autor", "Edición", "Notas", "Disponible"
            }
        ));
        jScrollPane1.setViewportView(Tabla_resultados);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 400, 710, 50);

        Boton_modificar.setText("Modificar");
        add(Boton_modificar);
        Boton_modificar.setBounds(40, 480, 160, 26);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Título:");
        add(jLabel8);
        jLabel8.setBounds(30, 190, 54, 23);

        Campo_titulo.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_titulo.setBorder(null);
        add(Campo_titulo);
        Campo_titulo.setBounds(120, 190, 200, 20);

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator5);
        jSeparator5.setBounds(120, 210, 200, 10);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Autor:");
        add(jLabel9);
        jLabel9.setBounds(390, 190, 56, 23);

        Campo_autor.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_autor.setBorder(null);
        add(Campo_autor);
        Campo_autor.setBounds(480, 190, 270, 20);

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator6);
        jSeparator6.setBounds(480, 210, 270, 10);

        jLabel10.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("Edición:");
        add(jLabel10);
        jLabel10.setBounds(30, 250, 71, 23);

        Campo_edicion.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_edicion.setBorder(null);
        add(Campo_edicion);
        Campo_edicion.setBounds(120, 240, 160, 21);

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator7);
        jSeparator7.setBounds(120, 270, 160, 10);

        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Categoria:");
        add(jLabel11);
        jLabel11.setBounds(310, 250, 110, 23);

        Campo_categoria.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_categoria.setBorder(null);
        add(Campo_categoria);
        Campo_categoria.setBounds(420, 250, 250, 20);

        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator8);
        jSeparator8.setBounds(420, 270, 250, 10);

        jLabel12.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("Notas:");
        add(jLabel12);
        jLabel12.setBounds(30, 310, 57, 23);

        Campo_notas.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_notas.setBorder(null);
        add(Campo_notas);
        Campo_notas.setBounds(100, 310, 650, 20);

        jSeparator9.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator9);
        jSeparator9.setBounds(100, 330, 650, 10);

        jLabel13.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 102));
        jLabel13.setText("Resultados");
        add(jLabel13);
        jLabel13.setBounds(30, 360, 110, 23);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Boton_modificar;
    public javax.swing.JButton Boton_verLibro;
    public javax.swing.JTextField Campo_autor;
    public javax.swing.JTextField Campo_categoria;
    public javax.swing.JTextField Campo_edicion;
    public javax.swing.JTextField Campo_id;
    public javax.swing.JTextField Campo_notas;
    public javax.swing.JTextField Campo_titulo;
    public javax.swing.JTable Tabla_resultados;
    public javax.swing.JTable Tabla_vista;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
