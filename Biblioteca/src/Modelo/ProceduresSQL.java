/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lexsw
 */
public class ProceduresSQL {
    //Atributos
    //Metodos
    public static void ingresarEstudiante(Estudiante estudiante) throws SQLException{
        CallableStatement ingresar = ConexionSQL.conexion.prepareCall("{call IngresarEstudiante (?,?,?,?,?,?)}");
        ingresar.setString(1,estudiante.getCodigo_unico());
        ingresar.setString(2,estudiante.getCedula());
        ingresar.setString(3,estudiante.getNombre());
        ingresar.setString(4,estudiante.getApellido());
        ingresar.setString(5,estudiante.getCarrera());
        ingresar.setString(6,estudiante.getCorreo());
        ingresar.execute();
    }
    public static void ingresarLibro(Libro libro) throws SQLException{
        CallableStatement ingresar = ConexionSQL.conexion.prepareCall("{call IngresarLibro (?,?,?,?,?)}");
        ingresar.setString(1,libro.getTitulo());
        ingresar.setString(2,libro.getCategoria());
        ingresar.setString(3,libro.getAutor());
        ingresar.setString(4,libro.getEdicion());
        ingresar.setString(5,libro.getNotas());
        ingresar.execute();
    }
    public static void eliminarEstudiante(Estudiante estudiante) throws SQLException{
        CallableStatement ingresar = ConexionSQL.conexion.prepareCall("{call EliminarEstudiante (?)}");
        ingresar.setInt(1,estudiante.getId());
        ingresar.execute();
    }
    public static void eliminarLibro(Libro libro) throws SQLException{
        CallableStatement ingresar = ConexionSQL.conexion.prepareCall("{call EliminarLibro (?)}");
        ingresar.setInt(1,libro.getId());
        ingresar.execute();
    }
    public static void modificarEstudiante(int filtro,String identificador,Estudiante estudiante) throws SQLException{
        //El entero filtro solo puede tomar los valores 1,2 o 3.
        //El valor 1 representa que se modificara al estudiante basandose en su id.
        //El valor 2 representa que se modificara al estudiante basandose en su codigo unico.
        //El valor 3 representa que se modificara al estudiante basandose en su cedula.
        //El String identificador representa el identificador del estudiante a modificarse.
        CallableStatement ingresar = ConexionSQL.conexion.prepareCall("{call modificarEstudiante (?,?,?,?,?,?,?,?)}");
        ingresar.setInt(1, filtro);
        ingresar.setString(2,identificador);
        ingresar.setString(3,estudiante.getCodigo_unico());
        ingresar.setString(4,estudiante.getCedula());
        ingresar.setString(5,estudiante.getNombre());
        ingresar.setString(6,estudiante.getApellido());
        ingresar.setString(7,estudiante.getCarrera());
        ingresar.setString(8,estudiante.getCorreo());
        ingresar.execute();
    }
    public static void modificarLibro(Libro libro){
        
    }
    public static void modificarPrestamo(Prestamo prestamo){
        
    }
    public static boolean existenciaEstudiante(Estudiante e) throws SQLException{
        ResultSet resultado1,resultado2,resultado3; 
        int resultados1=0,resultados2=0,resultados3=0;
        resultado1 = ConexionSQL.consulta("SELECT count(*) FROM Estudiantes WHERE cedula = "+e.getCedula());
        resultado2 = ConexionSQL.consulta("SELECT count(*) FROM Estudiantes WHERE codigo_unico = "+e.getCodigo_unico());
        resultado3 = ConexionSQL.consulta("SELECT count(*) FROM Estudiantes WHERE correo = '"+e.getCorreo()+"'");
        while(resultado1.next()){
            resultados1 = resultado1.getInt(1); 
        }
        while(resultado2.next()){
            resultados2 = resultado2.getInt(1); 
        }
        while(resultado3.next()){
            resultados3 = resultado3.getInt(1); 
        }
        return resultados1+resultados2+resultados3>=1;
    }

}
