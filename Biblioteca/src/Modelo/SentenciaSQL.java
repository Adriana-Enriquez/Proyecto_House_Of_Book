
package Modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class SentenciaSQL {
    //Constructor
    //Metodos
    public static DefaultTableModel consultaEstudiante(String consulta) throws SQLException{
        ResultSet resultado = ConexionSQL.consulta(consulta);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Código único");
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Carrera");
        modelo.addColumn("Correo");
         while(resultado.next()){
            String[] tupla = new String[7];
            tupla[0]=String.valueOf(resultado.getInt(1));
            tupla[1]=resultado.getString(2);
            tupla[2]=resultado.getString(3);
            tupla[3]=resultado.getString(4);
            tupla[4]=resultado.getString(5);
            tupla[5]=resultado.getString(6);
            tupla[6]=resultado.getString(7);
            modelo.addRow(tupla);
         }
        return modelo;
    }
    public static DefaultTableModel consultaLibro(String consulta) throws SQLException{
        ResultSet resultado = ConexionSQL.consulta(consulta);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Titulo");
        modelo.addColumn("Categoria");
        modelo.addColumn("Autor");
        modelo.addColumn("Edicion");
        modelo.addColumn("Notas");
        modelo.addColumn("Disponible");
        while(resultado.next()){
            String[] tupla = new String[7];
            tupla[0]=String.valueOf(resultado.getInt(1));
            tupla[1]=resultado.getString(2);
            tupla[2]=resultado.getString(3);
            tupla[3]=resultado.getString(4);
            tupla[4]=resultado.getString(5);
            tupla[5]=resultado.getString(6);
            tupla[6]=resultado.getString(7);
            modelo.addRow(tupla);
        }
        return modelo;
    }
    public static DefaultTableModel mostrarEstudiantes(Estudiante estudiante) throws SQLException{
        CallableStatement consulta = ConexionSQL.conexion.prepareCall("{call verificarEstudiante (?,?,?,?)}");
        consulta.setString(1,estudiante.getCodigo_unico());
        consulta.setString(2,estudiante.getCedula());
        consulta.setString(3,estudiante.getNombre());
        consulta.setString(4,estudiante.getApellido());
        ResultSet resultado = consulta.executeQuery();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Código único");
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Carrera");
        modelo.addColumn("Correo");
        while(resultado.next()){
            String[] tupla = new String[7];
            tupla[0]=String.valueOf(resultado.getInt(1));
            tupla[1]=resultado.getString(2);
            tupla[2]=resultado.getString(3);
            tupla[3]=resultado.getString(4);
            tupla[4]=resultado.getString(5);
            tupla[5]=resultado.getString(6);
            tupla[6]=resultado.getString(7);
            modelo.addRow(tupla);
        }
        return modelo;
    }
    public static DefaultTableModel mostrarLibros(Libro libro) throws SQLException{
        CallableStatement consulta = ConexionSQL.conexion.prepareCall("{call verificarLibro (?,?)}");
        consulta.setString(1,libro.getTitulo());
        consulta.setString(2,libro.getAutor());
        ResultSet resultado = consulta.executeQuery();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Titulo");
        modelo.addColumn("Categoria");
        modelo.addColumn("Autor");
        modelo.addColumn("Edicion");
        modelo.addColumn("Notas");
        modelo.addColumn("Disponible");
        while(resultado.next()){
            String[] tupla = new String[7];
            tupla[0]=String.valueOf(resultado.getInt(1));
            tupla[1]=resultado.getString(2);
            tupla[2]=resultado.getString(3);
            tupla[3]=resultado.getString(4);
            tupla[4]=resultado.getString(5);
            tupla[5]=resultado.getString(6);
            tupla[6]=resultado.getString(7);
            modelo.addRow(tupla);
        }
        return modelo;
    }
}
