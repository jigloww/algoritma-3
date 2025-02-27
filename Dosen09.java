import java.util.Scanner;

public class Dosen09 {
    String kode;
    String nama;
    Boolean jenisKelamin; 
    int usia;

    
    public Dosen09(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    
    public void cetakInfo() {
        System.out.println("Kode           : " + this.kode);
        System.out.println("Nama           : " + this.nama);
        System.out.println("Jenis Kelamin  : " + (this.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + this.usia);
        System.out.println("=================================");
    }
}

