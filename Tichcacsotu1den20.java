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
public class Tichcacsotu1den20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int tich= 0;
        for (int i=1 ;i<=20 ;i++){
            tich= n*i;
            System.out.println("tich cua" + n + "x" + i +"=" + tich );    
        }
    }
}
