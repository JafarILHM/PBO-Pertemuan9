/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan9;

/**
 *
 * @author Entrihestia
 */

public class Mahasiswa {
    private String NIM, Nama, Alamat, MataKuliah;
    private double nilaiAkhir;

    public Mahasiswa(String NIM, String Nama, String Alamat, String MataKuliah) {
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.MataKuliah = MataKuliah;
    }

    public String getNIM() { return NIM; }
    public String getNama() { return Nama; }
    public String getAlamat() { return Alamat; }
    public String getMataKuliah() { return MataKuliah; }
    public double getNilaiAkhir() { return nilaiAkhir; }
    
    public void setNilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }
}

