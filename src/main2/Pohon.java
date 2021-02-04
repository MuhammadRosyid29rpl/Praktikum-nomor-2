/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;

import java.util.Scanner;

/**
 *
 * @author ASUS TUF A15
 */
public class Pohon {
 String nama;
 int tinggi;

 void setNama(){
     Scanner input=new Scanner (System.in); 
     System.out.println("Masukkan nama pohon : ");
     nama=input.nextLine();
 }  
void setTinggi(){
    Scanner input=new Scanner (System.in);
    System.out.println("Masukkan nilai tinggi pohon (CM) : ");
    tinggi=input.nextInt();
 
    System.out.println("Nama Pohon : "+nama);
    System.out.println("Tinggi Pohon : "+tinggi);

}
 }

