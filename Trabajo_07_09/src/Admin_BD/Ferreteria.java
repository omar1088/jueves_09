/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_BD;
import java.sql.*;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author daniel
 */
public class Ferreteria {
    
    Connection conexion = null;
    Statement sentencia = null;
    String cadena = "org.sqlite.JDBC";
    String url = "jdbc:sqlite:ferreteria.sqlite";
    
    public void crear_tabla(String tabla,String dato1, String dato2, String dato3, String dato4)
    {
        try
        {
            Class.forName(cadena);
            conexion = DriverManager.getConnection(url);
            sentencia = conexion.createStatement();
            String sql = "create table "+tabla+" ("+dato1+" int not null, "+
                          dato2+" text, "+dato3+" text, "+dato4+" text)";
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.close();         
        }
        catch(Exception e)
        {
            System.err.println("error:" + e.getMessage());
            System.exit(0);
        }       
    }
     public void insertar( int dato1, String dato2, String dato3, String dato4)
    {
        try
        {
            Class.forName(cadena);
            conexion = DriverManager.getConnection(url);
            conexion.setAutoCommit(false);
            sentencia = conexion.createStatement();
            
            String sql = "insert into pinturas values("+dato1+",'"+dato2+"','"+
                          dato3+"','"+dato4+"')";
            sentencia.executeUpdate(sql);
            sentencia.close();
            conexion.commit();
            conexion.close();
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System .err.println("Error :" + e.getMessage());
            System.exit(0);
        }
    }
     public void mostrar_pinturas(String tabla)
    {
        try
        {
            Class.forName(cadena);
            conexion = DriverManager.getConnection(url);
            conexion.setAutoCommit(false);
            sentencia = conexion.createStatement();
            
            ResultSet resultado = sentencia.executeQuery("select * from "+tabla);
            
            while(resultado.next())
            {
                int codigo = resultado.getInt("codigo");
                String color = resultado.getString("color");
                String marca = resultado.getString("marca");
                int tipo = resultado.getInt("tipo");
                
                System.out.println("codigo   :"+ codigo);
                System.out.println("color    :"+ color);
                System.out.println("marca    :"+ marca);
                System.out.println("tipo     :"+ tipo);
                System.out.println("");
            }           
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System .err.println("Error :" + e.getMessage());
            System.exit(0);
        }
    }
      public void mostrar_herramientas(String tabla)
    {
        try
        {
            Class.forName(cadena);
            conexion = DriverManager.getConnection(url);
            conexion.setAutoCommit(false);
            sentencia = conexion.createStatement();
            
            ResultSet resultado = sentencia.executeQuery("select * from "+tabla);
            
            while(resultado.next())
            {
                int codigo = resultado.getInt("codigo");
                String color = resultado.getString("nombre");
                String marca = resultado.getString("marca");
                int valor = resultado.getInt("valor");
                
                System.out.println("codigo       :"+ codigo);
                System.out.println("herramienta  :"+ color);
                System.out.println("cantidad     :"+ marca);
                System.out.println("valor        :"+ valor);
                System.out.println("");
            }           
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System .err.println("Error :" + e.getMessage());
            System.exit(0);
        }
    }
}
