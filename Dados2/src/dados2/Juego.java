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
public class Juego {
    
    Dado dado1, dado2;
    Jugador jugador;
    Pantalla pantalla;
    

    void iniciar(){
        
        dado1=new Dado();
        dado2=new Dado();
        jugador=new Jugador();
        
        jugador.dadoJugador1=dado1;
        jugador.dadoJugador2=dado2;
        
        
        pantalla=new Pantalla();
        pantalla.setVisible(true);
        pantalla.unJugador=jugador;
        
        
    }
    
}
