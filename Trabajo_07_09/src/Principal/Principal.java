/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Admin_BD.Ferreteria;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author daniel
 */
public class Principal {
    
    public static void main(String[] args)
    {
        Ferreteria mostrar = new Ferreteria();
        int a=0;
        int  b =0;
        while (a!=5)
        {
             a = Integer.parseInt(JOptionPane.showInputDialog("ingrese una opcion\n1- crear tabla"
                + "\n2- insertar datos a una tabla\n3- mostrar tabla\n4- eliminar tabla"));
            switch(a)
            {
                case 1:
                    String tabla = JOptionPane.showInputDialog("ingrese el nombre de la tabla");
                    String dato1 = JOptionPane.showInputDialog("ingrese nombre del primer dato, que es de tipo entero");
                    String dato2 = JOptionPane.showInputDialog("ingrese nombre del segundo dato");
                    String dato3 = JOptionPane.showInputDialog("ingrese nombre del tercer dato");
                    String dato4 = JOptionPane.showInputDialog("ingrese nombre del cuarto dato");
                    mostrar.crear_tabla(tabla,dato1,dato2,dato3,dato4);
                    break; 
                    
                case 2:
                   
                    while (b!=5)
                    {
                        b= Integer.parseInt(JOptionPane.showInputDialog("elija una tabla\n1- pintura\n2-herramientas"));
                        
                        switch(b)
                        {
                            case 1:
                            int dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo"));
                            dato2 = JOptionPane.showInputDialog("ingrese el color");
                            dato3 = JOptionPane.showInputDialog("ingrese la marca");
                            dato4 = JOptionPane.showInputDialog("ingrese tipo de pintura");
                            mostrar.insertar(dato, dato2, dato3, dato4);
                            JOptionPane.showMessageDialog(null, "se guardaron los datos correctamente");
                                break;
                            case 2:
                            dato = Integer.parseInt(JOptionPane.showInputDialog("ingrese el codigo"));
                            dato2 = JOptionPane.showInputDialog("ingrese el nombre");
                            dato3 = JOptionPane.showInputDialog("ingrese la cantidad");
                            dato4 = JOptionPane.showInputDialog("ingrese el valor");
                            mostrar.insertar(dato, dato2, dato3, dato4);
                            JOptionPane.showMessageDialog(null, "se guardaron los datos correctamente");
                                break;
                            case 5:
                                b=5;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "la tabla no existe");
                                break;
                        } 
                    }
                    break;
                case 3:
                    
                    while (b!=5)
                    {
                        b= Integer.parseInt(JOptionPane.showInputDialog("elija una tabla\n1- pintura\n2-herramientas"));
                        switch(b)
                        {
                            case 1:
                                String tablas = "pinturas";
                                mostrar.mostrar_pinturas(tablas);
                                break;
                            case 2:
                                tablas = "herramientas";
                                mostrar.mostrar_pinturas(tablas);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "la tabla no existe");
                                break;
                        }
                           
                    }   
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
    }
}
