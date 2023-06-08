/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3b;

import javax.swing.JOptionPane;

/**
 *
 * @author fmora
 */
public class Clase3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Esbriba un Numero\n");
        String myNum;
        int multi;
        multi = 0;
        myNum = JOptionPane.showInputDialog("Esbriba un Numero\n");
        multi = Integer.parseInt(myNum);
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println(multi+" X "+counter+" = "+(multi*counter));
        }
    }
    
}
