/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg00.helloworld;
import java.util.Scanner;
/**
 *
 * @author arohan
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Programme 2 lignes
        System.out.println("Hello");
        System.out.println("World");*/
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        System.out.print("Saisir x :");
        x = sc.nextInt();
        System.out.print("Saisir y :");
        y = sc.nextInt();
        System.out.print("Avant permutation : x="+x+" y="+y);
        System.out.print("Apres permutation : x="+y+" y="+x);
    }
    
}
