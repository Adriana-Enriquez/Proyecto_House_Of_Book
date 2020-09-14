
package Vista.paneles;

public class Panel_eliminarEstudiante extends javax.swing.JPanel {

    public Panel_eliminarEstudiante() {
        initComponents();
        this.setSize(816, 542);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        Campo_id = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        Campo_apellido = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        Campo_cedula = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        Campo_codigo = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        Campo_nombre = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Boton_verificar = new javax.swing.JButton();
        Boton_eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID ", "Codigo único", "Cédula", "Nombre", "Apellido", "Carrera", "Correo electrónico"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("ID Estudiante:");
        add(jLabel7);
        jLabel7.setBounds(40, 470, 124, 23);

        Campo_id.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_id.setBorder(null);
        add(Campo_id);
        Campo_id.setBounds(170, 470, 200, 20);

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator4);
        jSeparator4.setBounds(170, 490, 200, 10);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Apellido:");
        add(jLabel9);
        jLabel9.setBounds(390, 30, 79, 23);

        Campo_apellido.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_apellido.setBorder(null);
        add(Campo_apellido);
        Campo_apellido.setBounds(480, 30, 270, 20);

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator6);
        jSeparator6.setBounds(480, 50, 270, 10);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Cédula:");
        add(jLabel8);
        jLabel8.setBounds(30, 90, 68, 23);

        Campo_cedula.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_cedula.setBorder(null);
        add(Campo_cedula);
        Campo_cedula.setBounds(110, 90, 210, 20);

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator5);
        jSeparator5.setBounds(110, 110, 210, 10);

        jLabel10.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("Código único: ");
        add(jLabel10);
        jLabel10.setBounds(390, 90, 131, 23);

        Campo_codigo.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_codigo.setBorder(null);
        add(Campo_codigo);
        Campo_codigo.setBounds(530, 90, 220, 20);

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator7);
        jSeparator7.setBounds(530, 110, 220, 10);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID ", "Codigo único", "Cédula", "Nombre", "Apellido", "Carrera", "Correo electrónico"
            }
        ));
        jScrollPane2.setViewportView(Tabla);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 170, 750, 260);

        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Nombre:");
        add(jLabel11);
        jLabel11.setBounds(30, 30, 79, 23);

        Campo_nombre.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_nombre.setBorder(null);
        add(Campo_nombre);
        Campo_nombre.setBounds(120, 30, 200, 20);

        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator8);
        jSeparator8.setBounds(120, 50, 200, 10);

        Boton_verificar.setText("Verificar");
        add(Boton_verificar);
        Boton_verificar.setBounds(430, 470, 160, 26);

        Boton_eliminar.setText("Eliminar");
        add(Boton_eliminar);
        Boton_eliminar.setBounds(620, 470, 160, 26);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        jLabel1.setText("Campo obligatorio");
        add(jLabel1);
        jLabel1.setBounds(530, 120, 200, 14);

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        jLabel2.setText("Campo obligatorio");
        add(jLabel2);
        jLabel2.setBounds(110, 120, 200, 14);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Boton_eliminar;
    public javax.swing.JButton Boton_verificar;
    public javax.swing.JTextField Campo_apellido;
    public javax.swing.JTextField Campo_cedula;
    public javax.swing.JTextField Campo_codigo;
    public javax.swing.JTextField Campo_id;
    public javax.swing.JTextField Campo_nombre;
    public javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
