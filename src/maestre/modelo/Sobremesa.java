/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maestre.modelo;

/**
 *
 * @author jfunez
 */
public class Sobremesa extends Ordenador{
    
    
        
    String PlacaBase;
    String TarjetaGrafica;

    //Constructores
    public Sobremesa() {
    }
    
    public Sobremesa(String PlacaBase, String TarjetaGrafica) {
        this.PlacaBase = PlacaBase;
        this.TarjetaGrafica = TarjetaGrafica;
    }

    public Sobremesa(String PlacaBase, String TarjetaGrafica, int NumeroDeSerie, String Marca, String Modelo, int Mram, String Procesador, int Nucleos, String Almacenamiento, boolean arrancado) {
        super(NumeroDeSerie, Marca, Modelo, Mram, Procesador, Nucleos, Almacenamiento, arrancado);
        this.PlacaBase = PlacaBase;
        this.TarjetaGrafica = TarjetaGrafica;
    }

    //Setters & Getters
  
      public String getPlacaBase() {
        return PlacaBase;
    }

    public void setPlacaBase(String PlacaBase) {
        this.PlacaBase = PlacaBase;
    }

    public String getTarjetaGrafica() {
        return TarjetaGrafica;
    }

    public void setTarjetaGrafica(String TarjetaGrafica) {
        this.TarjetaGrafica = TarjetaGrafica;
    }
    

    
    //Metodos
    
    @Override
    public String toString() {
        return super.toString() +" Sobremesa -->" + "PlacaBase=" + PlacaBase + ", TarjetaGrafica=" + TarjetaGrafica + "\n" + ' ';
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
                for (int j = 0; j < mram; j++) {

                    System.out.print("*");
                }
             
                System.out.println("\n");
            }
           
    }






  

    public int compareTo(Object o) {
            Portatil ob = (Portatil) o;
        
        if (this.getNumeroDeSerie() == ob.getNumeroDeSerie()){
                System.out.println("Iguales");
                
                return 0;
                
            }else{
        
                
                throw new UnsupportedOperationException("No iguales");
                      
            }
    }

    @Override
    public void reparar() {
        
              System.out.println("Arreglando Sobremesa ******");
        
        
      if (this == null){
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }  

    }
    
    
    
}
