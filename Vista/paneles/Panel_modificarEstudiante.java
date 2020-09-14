
package Vista.paneles;

public class Panel_modificarEstudiante extends javax.swing.JPanel {

    public Panel_modificarEstudiante() {
        initComponents();
        this.setSize(816, 542);
        this.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        Campo_filtros = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Filtros = new javax.swing.JComboBox<>();
        Boton_contraseña = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_resultados = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Campo_nombre = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Campo_apellido = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla_vista = new javax.swing.JTable();
        jSeparator6 = new javax.swing.JSeparator();
        Campo_cedula = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        Campo_carrera = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        Campo_codigo = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        Campo_correo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Boton_verEstudiante = new javax.swing.JButton();
        Boton_modificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Modificar por: ");
        add(jLabel7);
        jLabel7.setBounds(30, 30, 130, 23);

        Campo_filtros.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_filtros.setBorder(null);
        add(Campo_filtros);
        Campo_filtros.setBounds(330, 30, 210, 20);

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator4);
        jSeparator4.setBounds(330, 50, 210, 10);

        Filtros.setBackground(new java.awt.Color(255, 255, 255));
        Filtros.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        Filtros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Código único", "Cédula" }));
        add(Filtros);
        Filtros.setBounds(170, 30, 140, 26);

        Boton_contraseña.setText("Habilitar cambio de contraseña");
        add(Boton_contraseña);
        Boton_contraseña.setBounds(240, 480, 220, 26);

        Tabla_resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Código único", "Cédula", "Nombre", "Apellido", "Carrera", "Correo"
            }
        ));
        jScrollPane1.setViewportView(Tabla_resultados);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 400, 710, 50);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 102));
        jLabel8.setText("Resultados");
        add(jLabel8);
        jLabel8.setBounds(30, 360, 110, 23);

        Campo_nombre.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_nombre.setBorder(null);
        add(Campo_nombre);
        Campo_nombre.setBounds(120, 180, 200, 20);

        jSeparator5.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator5);
        jSeparator5.setBounds(120, 200, 200, 10);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Cédula:");
        add(jLabel9);
        jLabel9.setBounds(30, 240, 68, 23);

        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        jLabel11.setText("Carrera:");
        add(jLabel11);
        jLabel11.setBounds(30, 310, 72, 23);

        jLabel10.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setText("Apellido:");
        add(jLabel10);
        jLabel10.setBounds(390, 180, 79, 23);

        Campo_apellido.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_apellido.setBorder(null);
        add(Campo_apellido);
        Campo_apellido.setBounds(480, 180, 270, 20);

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator7);
        jSeparator7.setBounds(480, 200, 270, 10);

        jLabel12.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText("Código único: ");
        add(jLabel12);
        jLabel12.setBounds(390, 240, 131, 23);

        jLabel13.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 102));
        jLabel13.setText("Correo:");
        add(jLabel13);
        jLabel13.setBounds(390, 310, 67, 23);

        Tabla_vista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Código único", "Cédula", "Nombre", "Apellido", "Carrera", "Correo"
            }
        ));
        jScrollPane2.setViewportView(Tabla_vista);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 90, 710, 50);

        jSeparator6.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator6);
        jSeparator6.setBounds(110, 260, 200, 10);

        Campo_cedula.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_cedula.setBorder(null);
        add(Campo_cedula);
        Campo_cedula.setBounds(110, 240, 200, 20);

        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator8);
        jSeparator8.setBounds(110, 330, 200, 10);

        Campo_carrera.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_carrera.setBorder(null);
        add(Campo_carrera);
        Campo_carrera.setBounds(110, 310, 200, 20);

        jSeparator9.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator9);
        jSeparator9.setBounds(530, 260, 210, 10);

        Campo_codigo.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_codigo.setBorder(null);
        add(Campo_codigo);
        Campo_codigo.setBounds(530, 240, 210, 20);

        jSeparator10.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        add(jSeparator10);
        jSeparator10.setBounds(470, 330, 270, 10);

        Campo_correo.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        Campo_correo.setBorder(null);
        add(Campo_correo);
        Campo_correo.setBounds(470, 310, 270, 20);

        jLabel14.setFont(new java.awt.Font("Eras Medium ITC", 0, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setText("Nombre:");
        add(jLabel14);
        jLabel14.setBounds(30, 180, 79, 23);

        Boton_verEstudiante.setText("Ver Estudiante");
        add(Boton_verEstudiante);
        Boton_verEstudiante.setBounds(580, 30, 160, 26);

        Boton_modificar.setText("Modificar");
        add(Boton_modificar);
        Boton_modificar.setBounds(40, 480, 160, 26);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Boton_contraseña;
    public javax.swing.JButton Boton_modificar;
    public javax.swing.JButton Boton_verEstudiante;
    public javax.swing.JTextField Campo_apellido;
    public javax.swing.JTextField Campo_carrera;
    public javax.swing.JTextField Campo_cedula;
    public javax.swing.JTextField Campo_codigo;
    public javax.swing.JTextField Campo_correo;
    public javax.swing.JTextField Campo_filtros;
    public javax.swing.JTextField Campo_nombre;
    public javax.swing.JComboBox<String> Filtros;
    public javax.swing.JTable Tabla_resultados;
    public javax.swing.JTable Tabla_vista;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
