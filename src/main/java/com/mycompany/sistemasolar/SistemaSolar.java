

package com.mycompany.sistemasolar;

import com.mycompany.sistemasolar.clases.Planeta;
import com.mycompany.sistemasolar.enumeraciones.TipoPlaneta;


public class SistemaSolar {

    public static void main(String[] args) {
        
        Planeta objPlaneta = new Planeta("Tierra",int cantidadSatelite);
        
        objPlaneta.nombre="Marte";
        objPlaneta.cantidadSatelite=0;
        objPlaneta.masa=0;
        objPlaneta.volumen=0;
        objPlaneta.diametro=0;
        objPlaneta.distanciaMedia=0;
        objPlaneta.tipoPlaneta=TipoPlaneta.TERRESTRE;
        
        objPlaneta.imprimir();{
        
        double  densidad =objPlaneta.calcularDensidad();
        System.out.println("La densidad es:"+densidad);
        
        
    }
               
                
                
             
        
    }
    
}
 