package com.mycompany.sistemasolar.clases;

import com.mycompany.sistemasolar.enumeraciones.TipoPlaneta;

public class Planeta {
    
    //ATRIBUTOS//

    public String nombre;
    public int cantidadSatelite;
    public double masa;
    public double volumen;
    public double diametro;
    public double distanciaMedia;
    public TipoPlaneta tipoPlaneta;
    public boolean exterior = false;

    
    //CONSTRUCTOR//
    //vacio//
     
    public Planeta() {
    
}
  //no vacio//
    public Planeta (String nombre,int cantidadSatelite){
     this.nombre=nombre;
     this.cantidadSatelite =cantidadSatelite;
    }
            
           
    public void imprimir() {
        String nombre="";
        System.out.println("Nombre:" + nombre);
        System.out.println("Cantida de Satelite:" + cantidadSatelite);
        System.out.println("Masa en kilogramos:" + masa);
        System.out.println("Volumen en kilometro Cubico:" + volumen);
        System.out.println("Diametro en kilometro:" + diametro);
        System.out.println("Distancia Media al Sol:" + distanciaMedia);
        System.out.println("Tipo de planeta:" + tipoPlaneta);

    }

    public double calcularDensidad() {
        return masa / volumen;

    }

    public boolean determinAExterior() {

        double maximo = 3.4;
        double distancia = 14597870;
        double limite = maximo * distancia;

        if (distanciaMedia > limite) {
            exterior = true;

        }
        return exterior;

       

    }

}
