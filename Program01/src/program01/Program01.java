/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program01;

import java.util.Scanner;

/**
 *
 * @author jgoff
 */
public class Program01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1,temp;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your celsius temp:");
        temp = keyboard.nextDouble();
        temp = 9.0 / 5.0 * temp +32;
        System.out.println("celsius converted to fahrenheit is "+ temp);
       
      
    }
}
