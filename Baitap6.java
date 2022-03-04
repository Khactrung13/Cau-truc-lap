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
public class Baitap6 {
    public static void main (String[] args)
            
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n= sc.nextInt();
        System.out.println("Nhap i:");
        int i = sc.nextInt();
        int num =0;
     
        String  primeNumbers = "";
        for (; i <= n; i++)
        {
            int counter=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter ==2)
            {
            
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Các số nguyên tố là:");
        System.out.println(primeNumbers);
    }
}
