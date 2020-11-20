/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119047.latihan52.siapakamu;

import data.Dosen;
import data.Mahasiswa;
import data.Manusia;

/**
 *
 * @author 
 * NAMA     : Aldy Putra Hanggara
 * KELAS    : PBO2
 * NIM      : 10119047
 * DESKRIPSI PROGRAM : PROGRAM INI BERISI PROGRAM UBTUK MENCARI TAU
 *                     APAKAH DOSEN ATAU MAHASISWA
 */

public class PBOIF210119047Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dosen dosen = new Dosen();
        
        dosen.setNip("41227829930");
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setMataKuliah("PBO");
        dosen.setUmur(27);
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        System.out.println();
        

        Mahasiswa mahasiswa = new Mahasiswa();
        
        mahasiswa.setNim("10110269");
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.setNama("Nindi");
        mahasiswa.setKelas("PBO2");
        mahasiswa.setUmur(17);
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
        
    }
    
}
