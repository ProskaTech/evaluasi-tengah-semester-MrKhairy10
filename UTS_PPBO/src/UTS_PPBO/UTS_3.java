/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package UTS_PPBO;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class UTS_3 {
    
    public static void main(String[]args){
        int angka;
        String a;
        
        a = JOptionPane.showInputDialog("Masukan Angka");
        angka = Integer.parseInt(a);
        
        if (angka >=0){
            JOptionPane.showMessageDialog(null, "Angka"+angka+"Merupakan bilangan Positif");
        }
        else{
            JOptionPane.showMessageDialog(null, "Angka"+angka+"Merupakan bilangan Negatif");

        }
    }
}
