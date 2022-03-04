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
public class Baitap2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.printf("Nhap n: ");
    n = sc.nextInt();
    for (int i = n; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
 
  }
}