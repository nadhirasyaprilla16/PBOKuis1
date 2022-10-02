/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class PegawaiMain {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
       System.out.println("==================================");
       System.out.println("Masukkan Jumlah Pegawai: ");
       int jumlahPegawai = sc.nextInt();
       System.out.println("==================================");
       for(int i= 0; i < jumlahPegawai; i++){
            System.out.println("Masukkan Nama : ");
            String Nama =sc.next();
            System.out.println("Masukkan NIP : ");
            String NIP = sc.next();
            System.out.println("Masukkan Jumlah Jam Kerja : ");
            int jumlahJamKerja = sc.nextInt();
            System.out.println("==================================");
            Pegawai pegawai1 = new Pegawai(NIP,Nama,jumlahJamKerja);
            
            pegawai1.gajiPokok();
            pegawai1.setLembur();
            pegawai1.uangMakan();
            pegawai1.uangTransport();
            
            pegawai1.cetakPenghasilan();
       }
    }
}
