/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;


import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author casas
 */
public class BolitaVacia extends JLabel {

    public BolitaVacia() {
        
        this.setIcon(new ImageIcon("src/InterfaceGame/PuntoCarruselEmpty.png"));
        //this.getClass().getClassLoader().getResource("src/InterfaceGame/PuntoCarruselEmpty.png");
    }
    
}
