/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vonglap;

/**
 *
 * @author Lab
 */
public class Baitap7 {
    public static void main(String[] args) {
        int count = 10, num1 = 0, num2 = 1;
        System.out.print("chuoi la : ");
        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int Tong = num1 + num2;
            num1 = num2;
            num2 = Tong;
        }
        System.out.println();
      
    }
}
