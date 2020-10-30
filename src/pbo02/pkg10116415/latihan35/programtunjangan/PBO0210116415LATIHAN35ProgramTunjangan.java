/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo02.pkg10116415.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author Frda
 * NAMA: MIA AISYAH F
 * NIM: 10116415
 * Deskripsi Program: Program ini berisi program yang menampilkan data
 * Program Tunjangan
 */
public class PBO0210116415LATIHAN35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double gajiPokok;
        String status;
        
        Scanner scanner = new Scanner(System.in);
        
        tunjangan myTunjangan = new tunjangan();
        
        System.out.println("===Program Tunjangan===");
        System.out.print("Berapa Gaji Pokok Anda Sebulan? : Rp. ");  
        gajiPokok = scanner.nextDouble();

        System.out.print("Status Anda? (Menikah/Belum) ? : ");
        status = scanner.next();
        System.out.println("");
        
        myTunjangan.hitungTunjangan(gajiPokok, status);
        System.out.println("Developed by : Mia Aisyah Farida");
    }
    
}
