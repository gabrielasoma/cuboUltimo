/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import cubito.cubito;


/*Este programa dado un cubo calcula el volumnen del cubo y lo muestra por pantalla */

public class prinicipal {
    
      public static void main(String[] args) {
     //Instancio mi cubo 
     cubito cubo1 = new cubito(2,2,2);
     
     //llamo al metodo calcularVolumen
     int res = cubo1.calcularVolumen(cubo1.getAlto(), cubo1.getAncho(), cubo1.getProfundo());
     
     //imprimo por pantalla en el resultado
     System.out.println("El resultado del volumen de mi cubo es = "+res);
     
    }

    
}
