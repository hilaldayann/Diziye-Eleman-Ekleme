/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication74;

import java.util.Scanner;

/**
 *
 * @author Hilal
 */
public class JavaApplication74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner deger = new Scanner(System.in);
        System.out.print("Lütfen dizi boyutunu giriniz : ");
        int boyut = deger.nextInt();
        int [] dizi = new int [boyut];
        for (int i = 0; i < dizi.length; i++) 
        {
            System.out.print("Lütfen dizinin " + (i+1) + ". değeri giriniz : ");
            int sayi = deger.nextInt();
            dizi[i] = sayi;
        }
        System.out.println("Girmiş olduğunuz dizinin elemanları : ");
        for (int i = 0; i < dizi.length; i++) 
        {
            System.out.println("dizi [" + (i+1) + "] : " + dizi[i]);
        }
        
        System.out.print("Diziye eklenecek değeri giriniz : ");
        int eklenecek = deger.nextInt();
        System.out.print("Bu değer dizinin hangi indisine eklensin : ");
        int index = deger.nextInt();
        
        int [] yenidizi = new int [dizi.length+1];
        for (int i = 0; i < dizi.length; i++) 
        {
            yenidizi[i] = dizi[i];
        }
        yenidizi[index] = eklenecek;
        
        for (int i = 0; i < yenidizi.length; i++) 
        {
            if(index >= dizi.length)
            {
                break;
            }
            yenidizi[index+1] = dizi[index];
            index++;
        }
        
        System.out.println("Eklemeden sonra dizinin elemanları : ");
        for (int i = 0; i < yenidizi.length; i++) 
        {
            System.out.println("dizi [" + (i+1) + "] : " + yenidizi[i]);
        }
    }
}
