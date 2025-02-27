import java.util.Scanner;
public class MataKuliahDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah09[] arrayOfMatakuliah = new MataKuliah09[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i<3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i+1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("Sks         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");

            arrayOfMatakuliah[i] = new MataKuliah09(kode, nama, sks, jumlahJam);
        }
    }
}
