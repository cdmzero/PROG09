/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestre.modelo;

/**
 *
 * @author jfunez
 */
public class Portatil extends Ordenador implements Comparable<Portatil> {
    
    int Pulgadas;
    int DuracionBateria;

    
    //Constructores
    public Portatil() {
    }
    
    public Portatil(int Pulgadas, int DuracionBateria) {
        this.Pulgadas = Pulgadas;
        this.DuracionBateria = DuracionBateria;
    }

    public Portatil(int Pulgadas, int DuracionBateria, int NumeroDeSerie, String Marca, String Modelo, int Mram, String Procesador, int Nucleos, String Almacenamiento, boolean arrancado) {
        super(NumeroDeSerie, Marca, Modelo, Mram, Procesador, Nucleos, Almacenamiento, arrancado);
        this.Pulgadas = Pulgadas;
        this.DuracionBateria = DuracionBateria;
    }
    
    //Setters & Getters
     public int getPulgadas() {
     return Pulgadas;
    }

    public void setPulgadas(int Pulgadas) {
        this.Pulgadas = Pulgadas;
    }

    public int getDuracionBateria() {
        return DuracionBateria;
    }

    public void setDuracionBateria(int DuracionBateria) {
        this.DuracionBateria = DuracionBateria;
    }

    
    
    //Metodos
    
    public void setCargar(int minutos)
    {
        int duracionRestante = this.getDuracionBateria();
        
        duracionRestante += minutos;
        
        setDuracionBateria(duracionRestante);
    }
    
    public void setDescargar(int minutos)
    {
        if(minutos <=this.getDuracionBateria()){
        int duracionRestante = this.getDuracionBateria();
        
        duracionRestante -= minutos;
        
        setDuracionBateria(duracionRestante);
        }else{
        setDuracionBateria(0);
        }
        
      
    }

    @Override
    public String toString() {
        return super.toString()+" Portatil ->" + "Pulgadas=" + Pulgadas + ", DuracionBateria=" + DuracionBateria + " \n "+' ';
    }
    
    
    @Override
    public void Dibujar() {
        
      //mostramos los atributos del portatil.
        System.out.println(this.toString()) ;
        
        
     //Memoria Ram y Nucleos
     
     int mram = this.getMram();
     int nucleos = this.getNucleos();
     
        
        for( int i = 1 ; i <= nucleos; i++)
        {
               for (int j = 0; j < mram; j++) 
               {

                    System.out.print("*");
               }
               
            System.out.println("\n");
        }

       
    }


    @Override
    public void reparar() {
      System.out.println("Arreglando portatil *****");
        
        
      if (this == null){
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }      
    
    }
    
    
    @Override
    public int compareTo(Portatil o) {

        int este = this.Pulgadas;
        int otro = o.Pulgadas;

        return otro - este;
      
    }




}
