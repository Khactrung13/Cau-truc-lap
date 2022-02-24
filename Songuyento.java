/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cautruclap;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Songuyento {
    
    public static void main(String[] args)
   {
    
      boolean soNguyenTo ;
      System.out.println("Nhập vào số nguyên:");
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();


  
      for (int i = 0; i <= n; i++)
      {  
       soNguyenTo = true; 
         for (int j = 2; j < i; j++)
         {
            if (i % j == 0)
               
               soNguyenTo = false;
         }
         if (soNguyenTo == true)
            System.out.print(i+ " " );
      }
   }
}