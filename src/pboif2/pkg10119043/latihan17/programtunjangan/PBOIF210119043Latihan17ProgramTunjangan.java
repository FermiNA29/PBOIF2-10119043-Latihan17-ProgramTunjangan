/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan17.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * Kelas     : IF2
 * Deskripsi : Program hitung gaji karyawam
 */
public class PBOIF210119043Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    
    public static int inputGaji() {
        System.out.println("======== Program Tunjangan ========");
        Scanner scanner = new Scanner(System.in);
        
        //input gaji
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. ");
        int gaji = scanner.nextInt();
        return gaji;
    }
    
    
    public static String inputStatus() {
        //input status
        Scanner scanner = new Scanner(System.in);
        System.out.print("Status Anda? (Menikah/Belum)\t : ");
        String status = scanner.nextLine();
        status = status.toLowerCase();
        return status;
    }
    
    public static void hitungGaji(int gaji, String status) {
        double tunjangan;
        System.out.println();
        System.out.println("===== Hasil Perhitungan Gaji Anda =====");
        System.out.println("Gaji Pokok\t : " + gaji);
        if (status.equals("menikah")) {
            tunjangan = gaji * 0.35;
        } else {
            tunjangan = 0;
        }
        System.out.println("Tunjangan\t : " + tunjangan);
        System.out.println("Total gaji\t : " + (gaji+tunjangan));
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        hitungGaji(inputGaji(), inputStatus());
    }
    
}
