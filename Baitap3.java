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
public class Baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int sum=0;
        for(int i = 1; i <= n; ++i)
        {
           
            sum += i;
        }
        System.out.println("Tong = " + sum);
    }
}
