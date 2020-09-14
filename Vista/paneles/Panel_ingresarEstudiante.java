package Vista.paneles;

public class Panel_ingresarEstudiante extends javax.swing.JPanel {

    public Panel_ingresarEstudiante() {
        initComponents();
        this.setSize(816, 542);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        Campo_nombre = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Campo_cedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        Campo_apellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        Campo_codigo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        Campo_carrera = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        Campo_correo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Boton_ingresar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Nombre:");
        add(jLabel7);
        jLabel7.setBounds(30, 30, 79, 23);

        Campo_nombre.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_nombre.setBorder(null);
        add(Campo_nombre);
        Campo_nombre.setBounds(120, 30, 200, 20);

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator4);
        jSeparator4.setBounds(120, 50, 200, 10);

        Campo_cedula.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_cedula.setBorder(null);
        add(Campo_cedula);
        Campo_cedula.setBounds(110, 89, 210, 21);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Cédula:");
        add(jLabel8);
        jLabel8.setBounds(30, 90, 68, 23);

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator5);
        jSeparator5.setBounds(110, 110, 210, 10);

        Campo_apellido.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_apellido.setBorder(null);
        add(Campo_apellido);
        Campo_apellido.setBounds(480, 30, 270, 20);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Apellido:");
        add(jLabel9);
        jLabel9.setBounds(390, 30, 79, 23);

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator6);
        jSeparator6.setBounds(480, 50, 270, 10);

        Campo_codigo.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_codigo.setBorder(null);
        add(Campo_codigo);
        Campo_codigo.setBounds(530, 89, 220, 21);

        jLabel10.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("Código único: ");
        add(jLabel10);
        jLabel10.setBounds(390, 90, 131, 23);

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator7);
        jSeparator7.setBounds(530, 110, 220, 10);

        Campo_carrera.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_carrera.setBorder(null);
        add(Campo_carrera);
        Campo_carrera.setBounds(110, 159, 210, 21);

        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Carrera:");
        add(jLabel11);
        jLabel11.setBounds(30, 160, 72, 23);

        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator8);
        jSeparator8.setBounds(110, 180, 210, 10);

        Campo_correo.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_correo.setBorder(null);
        add(Campo_correo);
        Campo_correo.setBounds(480, 159, 270, 21);

        jLabel12.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("Correo:");
        add(jLabel12);
        jLabel12.setBounds(390, 160, 67, 23);

        jSeparator9.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator9);
        jSeparator9.setBounds(480, 180, 270, 10);

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
        jScrollPane1.setViewportView(Tabla);
        if (Tabla.getColumnModel().getColumnCount() > 0) {
            Tabla.getColumnModel().getColumn(0).setHeaderValue("ID ");
            Tabla.getColumnModel().getColumn(1).setHeaderValue("Codigo único");
            Tabla.getColumnModel().getColumn(2).setHeaderValue("Cédula");
            Tabla.getColumnModel().getColumn(3).setHeaderValue("Nombre");
            Tabla.getColumnModel().getColumn(4).setHeaderValue("Apellido");
            Tabla.getColumnModel().getColumn(5).setHeaderValue("Carrera");
            Tabla.getColumnModel().getColumn(6).setHeaderValue("Correo electrónico");
        }

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 230, 750, 200);

        Boton_ingresar.setText("INGRESAR");
        add(Boton_ingresar);
        Boton_ingresar.setBounds(342, 456, 110, 40);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Boton_ingresar;
    public javax.swing.JTextField Campo_apellido;
    public javax.swing.JTextField Campo_carrera;
    public javax.swing.JTextField Campo_cedula;
    public javax.swing.JTextField Campo_codigo;
    public javax.swing.JTextField Campo_correo;
    public javax.swing.JTextField Campo_nombre;
    public javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
