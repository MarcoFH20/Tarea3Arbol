
package com.mycompany.tarea3;

import EstructuraNoLineales.Arbol;


public class Tarea3 {

    public static void main(String[] args) {
        
        Arbol arbol=new Arbol();
        arbol.insertar(43);
        arbol.insertar(14);
        arbol.insertar(8);
        arbol.insertar(48);
        arbol.insertar(15);
        arbol.insertar(55);
        arbol.insertar(22);
        System.out.println("INORDEN: ");
        arbol.dispararInorden();
        System.out.println(" ");
        System.out.println("POSTORDEN: ");
        arbol.dispararPostorden();
         System.out.println(" ");
        System.out.println("PREORDEN: ");
        arbol.dispararPreorden();
        
        
    }
}
