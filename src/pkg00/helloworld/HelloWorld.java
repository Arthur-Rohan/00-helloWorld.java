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
        System.out.println("Hello");            //  2) Affichage message sur 2 lignes
        System.out.println("World");*/
        
        
        /*Scanner sc = new Scanner(System.in);        //  4) Permutation variables
        int x;
        int y;
        int z;
        System.out.print("Saisir x :"); //Saisir X
        x = sc.nextInt();
        System.out.print("Saisir y :"); //Saisir Y
        y = sc.nextInt();
        System.out.println("Avant permutation : x="+x+" y="+y); //Afficher X et Y Avant permutation
       z=x;
       x=y; //Inverse X et Y grace a la troisieme variable Z
       y=z;
       System.out.println("Apres permutation : x="+x+" y="+y); //Affiche X et Y Apres permutation*/
       
        /*Scanner sc = new Scanner(System.in);   //Exercice 5   
        float a;
        float b;
        float x;
        System.out.print("Saisir a :"); //Saisir a
        a = sc.nextInt();
        System.out.print("Saisir b :"); //Saisir b
        b = sc.nextInt();
        x=((a+b)*2);  //Calcule du résultat et définir sur x
        System.out.println(x); //Affiche juste le résultat*/
        
        int x;
        
        
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1: Bonjour");
            System.out.println("2: Au revoir");
            System.out.println("0: Quitter");
            x = sc.nextInt();
        } while(x!=0);
    }
   
}
