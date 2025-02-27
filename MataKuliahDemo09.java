import java.util.Scanner;

public class MataKuliahDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlahMatkul = Integer.parseInt(sc.nextLine()); 

        MataKuliah09[] arrayOfMatakuliah = new MataKuliah09[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new MataKuliah09(); 
            arrayOfMatakuliah[i].tambahData(sc); 
        }

        System.out.println("Data Matakuliah yang telah dimasukkan:");
        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
