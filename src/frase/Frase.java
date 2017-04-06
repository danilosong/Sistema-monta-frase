/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frase;

import javax.swing.JOptionPane;

/**
 *
 * @author danco
 */
public class Frase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String  completa, space = " ";
        String[] frase = new String[3];
        
        for(int n=0;n<=2;n++)
        {
            frase[n] = JOptionPane.showInputDialog("Por favor digite uma palavra");
            if(n==2)
            {
                completa = frase[0]+space+frase[1]+space+frase[2];
                JOptionPane.showMessageDialog(null,"Resultado: "+completa);         
            }
        }
    }
    
}
