/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Dado {
    
    private int valor;
    
    void lanzar(){
        
        Random generador=new Random();
        this.valor=generador.nextInt(5)+1;
    }

    public int getValor() {
        return valor;
    }
    
}
