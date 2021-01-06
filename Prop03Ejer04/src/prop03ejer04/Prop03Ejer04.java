/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prop03ejer04;

import java.util.Scanner;

/**
 *
 * @author heber y entornos, segundo commit
 */
public class Prop03Ejer04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h;
        int e;
        Scanner entrada=new Scanner(System.in);
        System.out.print("Inserta el tamaño del rombo: ");
        e=entrada.nextInt(); 
        while (e%2==0){
        System.out.print("Inserta el tamaño del rombo(que sea impar): ");
        e=entrada.nextInt();
        }
        h=e/2+1;
        int i,j,k;
        for (i=1;i<=h;i++){
            for (k=1;k<=h-i;k++){
                System.out.print(" ");
            }
            for (j=1;j<=2*(i-1)+1;j++){
                 if(j==1||j==2*(i-1)+1){
                  System.out.print("*");  
                 }else{System.out.print(" ");} 
            }
        System.out.println("");
        }
        
        int l,m,n;
        for (l=1;l<=h-1;l++){
            for (m=1;m<=l;m++){
                System.out.print(" ");
            }
            for (n=1;n<=2*((h-1)-l)+1;n++){
                if(n==1||n==2*((h-1)-l)+1){
                    System.out.print("*");
                }else{System.out.print(" ");}
            }
            System.out.println("");
        }
    }
    
}
