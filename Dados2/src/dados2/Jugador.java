/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

/**
 *
 * @author Estudiantes
 */
public class Jugador {
    
    String nombre;
    float presupuesto;
    Dado dadoJugador1;
    Dado dadoJugador2;
    
           
    
    
    
    void jugar(){
        
        this.dadoJugador1.lanzar();
        this.dadoJugador2.lanzar();
        
    }
    
    void apostar(){
        
        
    }
    
    
    
}
