/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cautruclap;

import com.sun.tools.javac.Main;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Tinhtongcacsochan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n= ");
        int n = sc.nextInt();
        int tong=0;
        for (int i=0; i<=n ; i++){
            if (i%2==0){
            tong= tong +i;
               
        }
        }
        
         System.out.println("Tong la: "+ tong);  
    }   
    
}
