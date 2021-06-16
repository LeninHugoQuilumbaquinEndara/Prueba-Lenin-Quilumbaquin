
package test;

import java.util.Scanner;
import prueba.operaciones;
import prueba.serieEstufiantes;

public class PruebaEstudiante {
   static Scanner datos = new Scanner (System.in);
   public static void main (String [] args){
       int cantidad=0;
       String nombre;
       String sexo;
       double nota;
       serieEstufiantes[] estudiantes;
       System.out.println("Ingrese cauntos estudiantes van a ser");
       cantidad = datos.nextInt();
       estudiantes = new serieEstufiantes[cantidad];
       llenaDatos(estudiantes);
       System.out.println("Datos almacenados");
       for ( int i =0; i < estudiantes.length; i++){
           System.out.println(estudiantes[i]);
           
       }
       
   }
     
   
   
   public static void llenaDatos(serieEstufiantes est[]){
       String nombre;
       String sexo;
       double nota;
       for( int i = 0 ; i <= est.length;i++){
           System.out.println("");
   System.out.println("Nombre: ");
   nombre = datos.nextLine();
   System.out.println("Sexo :");
   sexo = datos.nextLine();
   System.out.println("Nota :");
   nota = datos.nextDouble();
   est[i]= new serieEstufiantes(nombre,sexo,nota);
           System.out.println("");
           datos.nextLine();
       }

   }
}
