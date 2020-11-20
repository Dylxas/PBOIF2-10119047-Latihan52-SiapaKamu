/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM UBTUK MENCARI TAU
 *                     APAKAH DOSEN ATAU MAHASISWA
 */

public class Dosen extends Manusia {
        
    private String nip;
    private String mataKuliah;
    
    public String getNip(){
        return nip;
    }
    
    public void setNip(String nip){
        this.nip = nip;
    }
    
    public String getMataKuliah(){
        return mataKuliah;
    }
    
    public void setMataKuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya " + nama + " umur " + umur + " tahun sedang mengajar"
                                                             + "mata kuliah " + 
                                                               getMataKuliah());
    }
    
    @Override
    public void siapaKamu(){
        System.out.println("Saya Dosen");
    }
}
