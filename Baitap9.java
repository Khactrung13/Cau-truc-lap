/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vonglap;

import java.util.Scanner;

/**
 *
 * @author Lab
 */
public class Baitap9 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
 
    int num1,num2, daonguoc = 0;
    System.out.println("NHap so can dao nguoc : ");
    num1 = sc.nextInt();
   
    num2 = num1;

    while(num1 != 0) {
      int chuso = num1 % 10;
      daonguoc = daonguoc * 10 + chuso;
      num1 /= 10;
    }

    System.out.printf("So sau khi dao nguoc la : " +daonguoc);
 
 
  }
}
