/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestre.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import maestre.electrodomesticos.Lavadora;
import maestre.interfaces.Reparable;
import maestre.modelo.Portatil;
import maestre.modelo.Sobremesa;

/**
 *
 * @author jfunez
 */
public class Parte2app {
    
    
static ArrayList<Portatil> listaPortatiles = new ArrayList<>();

static Sobremesa sobre1 = new Sobremesa("Sobre1", " AMD", 123 , "Asus", "P23", 16, "Intel", 4, "No HDD", false);
static Sobremesa sobre2 = new Sobremesa("Sobre2", " Nvidia", 143 , "Sony", "Model2", 16, "Intel", 6, "HDD", false);

  
static Portatil porta1 = new Portatil(13, 300, 111, "porta1", "Asus", 16, "AMD", 4, "SSD", false);
static Portatil porta2 = new Portatil(15, 300, 222, "porta2", "Apple", 16, "AMD", 4, "HDD", false);
static Portatil porta3 = new Portatil(16, 300, 222, "porta2", "Apple", 16, "AMD", 4, "HDD", false);

static Lavadora lava1 = new Lavadora ("Lava1","Todo", 200);
static Lavadora lava2 = new Lavadora ("Lava2","TodoEstodo", 200);

  

static void ReparaTodo(Reparable[] cosas)
{

        for (int i = 0; i <= cosas.length -1; i++) {
            if(cosas[i] instanceof Sobremesa){
                
                Sobremesa coso = (Sobremesa) cosas[i];
                
                coso.reparar();
            }else if(cosas[i] instanceof Portatil){
             Portatil coso = (Portatil) cosas[i];
                
                coso.reparar();
            
            }else if((cosas[i] instanceof Lavadora)){
             Lavadora coso = (Lavadora) cosas[i];
                
                coso.reparar();
            }
        }
    }

 public static void main(String[] args) 
 {
 

 
  Reparable[] lista;
  
  lista = new Reparable[6];
          
 lista[0] = sobre1;
 lista[1] = sobre2;
 lista[2] = porta1;
 lista[3] = porta2;
 lista[4] = lava1;
 lista[5] = lava2;

 ReparaTodo(lista);
 
 System.out.println("\n");
     
/*
 
 listaPortatiles.add(porta1);
 listaPortatiles.add(porta2);
 listaPortatiles.add(porta3);
 
 //Desordenando Con ArrayList
 
 //Collections.shuffle(listaPortatiles);
  //System.out.println(listaPortatiles.toString());
 
 
 //Ordenando Con ArrayList
 

  
 //Collections.sort(listaPortatiles); 
 //System.out.println(listaPortatiles.toString());

 
  
*/

Portatil[] listaPortatilesarray;

listaPortatilesarray = new Portatil[3];

listaPortatilesarray[0]=  porta1;
listaPortatilesarray[1]=  porta2;
listaPortatilesarray[2]=  porta3;




//Desordenando un Array con List
 List<Portatil> listaPortatilesDesordenada = Arrays.asList(listaPortatilesarray);
 
 //Desordenadamos los indices
 Collections.shuffle(listaPortatilesDesordenada);
 
 //Volvemos al array original
 listaPortatilesDesordenada.toArray(listaPortatilesarray);
 
 //Imprimimos Pantalla los resultados
 System.out.println("Lista Desordenado---> "+Arrays.toString(listaPortatilesarray));
      
  System.out.println("\n");
//Ordenado por Pulgadas 
Arrays.sort(listaPortatilesarray);
 
 System.out.println("Lista Ordenada de mayor a menor pulgadas"+Arrays.toString(listaPortatilesarray));
     
 }

}
