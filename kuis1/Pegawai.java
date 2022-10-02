/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuis1;

/**
 *
 * @author user
 */
public class Pegawai {
    private String Nama,NIP;
    private double gajiPokok, lembur, uangMakan, transport, totalGajiPegawai;
    private int jumlahJamKerja;
    
    Pegawai (String Nama, String NIP, int jumlahJamKerja){
        this.Nama = Nama;
        this.NIP = NIP;
        this.jumlahJamKerja = jumlahJamKerja;
    }
    
    public void setJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja = jumlahJamKerja;
        this.NIP = NIP;  
        this.Nama = Nama;
    }
    
    public void gajiPokok(){
        gajiPokok = jumlahJamKerja * 2000;
    }
    
    public void setLembur(){
        if(jumlahJamKerja > 7){
            lembur = (jumlahJamKerja - 7) *  (gajiPokok * 1.5);
        } else {
            lembur = 0;
        }
    }
    
    public void uangMakan(){
        if (jumlahJamKerja >= 8){
            uangMakan = 3500; 
        } else {
            uangMakan = 0;
        }
    }
    
    public void uangTransport(){
        if (jumlahJamKerja >= 9){
            transport = 4000;
        } else {
            transport = 0;
        }
    }
    
    public void cetakPenghasilan(){
        totalGajiPegawai = gajiPokok + lembur + uangMakan + transport;
        System.out.println("Gaji Pokok : " +gajiPokok);
        System.out.println("Uang Lembur : " +lembur);
        System.out.println("Uang Makan : " +uangMakan);
        System.out.println("Uang Transport : " +transport);
        System.out.println("Total Gaji Pegawai : " +totalGajiPegawai);
    }
}
