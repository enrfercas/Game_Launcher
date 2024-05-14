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
public class BolitaLlena extends JLabel {
    
    private boolean llena;

    public BolitaLlena() {
        
        setLlena(false);
        this.setIcon(new ImageIcon("src/InterfaceGame/PuntoCarruselFilled.png"));
    }
    
    /**
     * Método para establecer si la bolita está llena o vacía.
     * @param llena true si la bolita debe estar llena, false si debe estar vacía
     */
    public void setLlena(boolean llena) {
        this.llena = llena;
        // Cambiar la imagen de la bolita según si está llena o vacía
        if (llena) {
            setIcon(new ImageIcon(getClass().getResource("/InterfazGame/PuntoCarruselFilled.png")));
        } else {
            setIcon(new ImageIcon(getClass().getResource("/InterfazGame/PuntoCarruselEmpty.png")));
        }
    }
    
}
