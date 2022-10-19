/*
    * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
    * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template

    * created by 21343083_Mubarakh Hayatna Khairy
*/

package UTS_PPBO;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UTS_2 {
    
     public static void main(String[]args){
         Scanner in = new Scanner(System.in);
         
         System.out.print("Masukan Jumlah baris :");
         int n = in.nextInt();
         
         for (int i = 1; i <=n; i++){
             for (int j = 1; j <i; j++)
           {
               System.out.print(" ");
           }
              for (int k = i; k <=n; k++)
           {
               System.out.print(" *");
           }
              System.out.println(" ");
         }
          for (int i = n; i >=1; i--){
             for (int j = 1; j <i; j++)
           {
               System.out.print(" ");
           }
              for (int k = i; k <=n; k++)
           {
               System.out.print(" #");
           }
              System.out.println(" ");
         }
     }
}
