/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fuckfuck.fuck.bussbokning;

import java.util.Scanner;

/**
 *
 * @author kasper.heijmahn
 */
public class Bussbokning {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] bokningar = new int[21];
        int y = 1;
        
        while(y==1) {
            System.out.println("MENU:");
            System.out.println("1.\033[0;1m] Boka plats");
            System.out.println("2.\033[0;1m] Visa Lediga Platser");
            System.out.println("3.\033[0;1m] Beräkna vinst (300 per bokad plats)");
            int val = sc.nextInt();
            sc.nextLine();
            
            switch(val) {
                case 1:
                    for(int i=0;i<bokningar.length;i++){
                        if(bokningar[i]==0){
                            System.out.print("Skriv in ditt personnummer eller skriv 0 om du e klar med bokningarna: ");
                            int prsnmr = sc.nextInt();
                            sc.nextLine();
                            if(prsnmr == 0) {
                                break;
                        }
                        bokningar[i] = prsnmr;
                            }
                            System.out.println("Plats"+(i+1)+" = "+bokningar[i]);
                        }
            }
                        
            
            
            // if för visa lediga platser
            
            // if för beräkna vinst

        }    
    }
}
