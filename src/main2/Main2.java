/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2;

/**
 *
 * @author ASUS TUF A15
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pohon Cemara");
        Pohon panggil = new Pohon();
        panggil.setNama();
        panggil.setTinggi();
        System.out.println("");
        System.out.println("");
        System.out.println("Pohon Kelapa");
        panggil.setNama();
        panggil.setTinggi();
    }
    
}
