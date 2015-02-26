/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwstringmanipulator;

import java.util.Scanner;

/**
 *
 * @author mohammed
 */
public class HwStringManipulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your favorite city: ");

        String name = scan.next();

        System.out.println("Characters name's length: " + name.length());

        System.out.println(name.toUpperCase());

        System.out.println(name.toLowerCase());
        
        System.out.println(name.charAt(0));

        System.out.println();

    }

}
