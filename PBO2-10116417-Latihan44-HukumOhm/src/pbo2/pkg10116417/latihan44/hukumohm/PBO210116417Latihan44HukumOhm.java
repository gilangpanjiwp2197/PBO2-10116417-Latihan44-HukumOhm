/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116417.latihan44.hukumohm;

/**
 *
 * @author  
 *  NAMA        : GILANG PANJI WANENG PATI
 *  KELAS       : PBO2
 *  NIM         : 10116417
 *  DESKRIPSI   : BERISI TENTANG PROGRAM MENAMPILKAN HUKUM OHM
 */
public class PBO210116417Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai objB = new Baterai();
        System.out.println("=====Hukum Ohm=====");
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar"
                + "akan berbanding lurus dengan beda potensial pada ujung ujung"
                + "kawat penghantar tersebut asalkan suhu kawat dijaga konstan."
                + "");

        objB.getKuatArus();
        objB.getHambatan();
        System.out.println("Hasil Tegangan : " + objB.hitungTegangan() +
                " volt ");
    }
    
}
