package maestre.modelo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author jfunez
 */
public class Parte1app {
    
static BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));

static ArrayList<Ordenador> listaOrdenadores = new ArrayList<>();

static Sobremesa sobre1 = new Sobremesa("Sobre1", " AMD", 123 , "Asus", "P23", 16, "Intel", 4, "No HDD", false);
static Sobremesa sobre2 = new Sobremesa("Sobre2", " Nvidia", 143 , "Sony", "Model2", 16, "Intel", 6, "HDD", false);
static Sobremesa sobre3 = new Sobremesa("Sobre3", " AMD", 173 , "Samsung", "Series 8", 16, "Intel", 4, "SSD", false);
  
static Portatil porta1 = new Portatil(13, 300, 111, "porta1", "Asus", 16, "AMD", 4, "SSD", false);
static Portatil porta2 = new Portatil(13, 300, 222, "porta2", "Apple", 16, "AMD", 4, "HDD", false);
static Portatil porta3 = new Portatil(13, 300, 333, "porta3", "Acer", 16, "AMD", 4, "NFS", false);
  
  




private static void mostrarMenu()   {

        
        boolean enabledmostrarMenu = true;
        
       
          while (enabledmostrarMenu == true) { 
        System.out.println("Bienvenido al inventario de Ordenadores");
        System.out.println("\n");
        System.out.println("Selecciona una opcion.");
        System.out.println("          Opcion 1 Listar ordenadores Mezclados");
        System.out.println("          Opcion 2 Listar solo Portatiles");
        System.out.println("          Opcion 3 Lista solo Sobremesas");
        System.out.println("          Opcion 4 Encender un ordenador");
        System.out.println("          Opcion 5 Apagar un ordenador :");
        System.out.println("          Opcion 6 Dibujar un ordenador :");
        System.out.println("          Opcion 7 Cargar un portatil :");
        System.out.println("          Opcion 8 Descargar un portatil\n");
        System.out.println("          Opcion 9 Salir.");
            try {
                    System.out.print("Introduzca su opcion[1-8][9 Salir]: ");

                    int opt = Integer.parseInt(dato.readLine());
                    

                    switch (opt) {

                        case 1:
                            listarEquiposDesordenado();
                            break;

                        case 2:
                            listarSolo("Portatil");
                            break;

                        case 3:
                             listarSolo("Sobremesa");
                            break;

                        case 4:
                            EncenderApagarEquipo("Encender");
                            break;

                        case 5:
                            EncenderApagarEquipo("Apagar");
                            break;

                        case 6:
                            Dibujar();
                            break;
                        case 7:
                            CargarDescargarEquipo("Cargar");
                            break;
                        case 8:
                            CargarDescargarEquipo("Descargar");
                            break;

                        case 9:
                            System.out.println("Adios");
                            enabledmostrarMenu = false;
                            
                            break;

                        default:
                            System.err.println("Opcion invalida");

                    }
               

            } catch (InputMismatchException err) {
                System.err.println("Dato invalido");
                
            } catch (IOException | NumberFormatException err) {
                System.err.println(err.getMessage());
            }
       }

    }
static int Decision(boolean limit) throws IOException{      
    int decision = 0;  
    boolean menu = true;
               
          while (menu)
          {
            if(limit == false){System.out.print("Cuantos minutos vas a añadir/quitar ---> ");}else{System.out.print("Elige un ordenador ---> ");}
                    try 
                    {
                                decision = Integer.parseInt(dato.readLine());

                                    if(decision > 0 && decision <= listaOrdenadores.size() && limit == true)
                                    {

                                        menu=false;
                                        break;

                                    }
                                    else if (decision > 0 && decision <= 2000 && limit == false)
                                    {

                                        menu=false;
                                        break;

                                    }
                                    else
                                    {

                                        System.out.println("Rango no valido");
                                    }

                    }
                    catch(InputMismatchException err)
                    {
                        System.err.println("Dato invalido");
                    }


          
        }
    return decision;
}
static void listarEquiposDesordenado(){


        Random rnd = new Random();
        Iterator itr;
    
  //Desordenamos la lista 
       for(int i = listaOrdenadores.size() -1; i >= 1; i--)
       {
           //Tomamos el indice mas alto y lo cambiamos a uno aleatorio ; vamos decreciendo indice en cada iterecion
          Collections.swap(listaOrdenadores, i, rnd.nextInt(i+1));
       }
  //Creamos un iterador del arraylist
      itr = listaOrdenadores.iterator();
   //Mientras tenga un valor que siga leyendo recorre e imprime la lista
        while (itr.hasNext()) {
            System.out.print(itr.next() + "  \n");
            System.out.println("");
        }
        



}
static void listarSolo(String tipo){

 
    Boolean opt = false;
    
    if("Portatil".equals(tipo)){
        opt=true;
    }
    
    for( int i = 0 ; i < listaOrdenadores.size() ; i++)
    {

            if ( listaOrdenadores.get(i) instanceof Portatil && opt == true )
            {
             System.out.println( listaOrdenadores.get(i));

             }
            
            
            if(listaOrdenadores.get(i) instanceof Sobremesa && opt == false){

             System.out.println("Registro nº "+ i +"-"+listaOrdenadores.get(i));
            }

    }
    
    opt=false;
}
static void EncenderApagarEquipo(String opcion) throws IOException{
    
    
    int indexLista = Decision(true);
    

    if("Apagar".equals(opcion)){
        
        listaOrdenadores.get(indexLista).setArrancado(false);
        System.out.println("Apagado \n");
        System.out.println(listaOrdenadores.get(indexLista).toString());
        
    }else{
        
    listaOrdenadores.get(indexLista).setArrancado(true);
    System.out.println("Encendido \n");
          System.out.println(listaOrdenadores.get(indexLista).toString());
    }    
    
    
    
    
    
    
    
}
static void Dibujar() throws IOException{

  int indexLista = Decision(true);
  
  listaOrdenadores.get(indexLista).Dibujar();
  


}
static void CargarDescargarEquipo(String accion) throws IOException{

 int minutos = Decision(false);

Ordenador RefOrd;
 
if("Cargar".equals(accion)){
        for( int i = 0 ; i < listaOrdenadores.size() ; i++)
    {

            if ( listaOrdenadores.get(i) instanceof Portatil)
            {
                
             RefOrd = listaOrdenadores.get(i);
             Portatil port = (Portatil) RefOrd ;
             
             port.setCargar(minutos);
   
             System.out.println( listaOrdenadores.get(i));

             }
    }
        }else{

      for( int i = 0 ; i < listaOrdenadores.size() ; i++)
    {

            if ( listaOrdenadores.get(i) instanceof Portatil)
            {
                
             RefOrd = listaOrdenadores.get(i);
             Portatil port = (Portatil) RefOrd ;
             
             port.setDescargar(minutos);
   
             System.out.println( listaOrdenadores.get(i));

             }
    }


}

 
 
 
 
  
    
            
 
 
 

}




    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
 
           

 listaOrdenadores.add(sobre1);
 listaOrdenadores.add(sobre2);
 listaOrdenadores.add(sobre3);
 listaOrdenadores.add(porta1);
 listaOrdenadores.add(porta2);
 listaOrdenadores.add(porta3);


mostrarMenu();
        

        
        
    }


}

