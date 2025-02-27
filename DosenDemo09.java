import java.util.Scanner;

public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = Integer.parseInt(sc.nextLine());

        Dosen09[] daftarDosen = new Dosen09[jumlahDosen];

        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode           : ");
            String kode = sc.nextLine();

            System.out.print("Nama           : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (L/P) : ");
            char gender = sc.nextLine().charAt(0);
            Boolean jenisKelamin = (gender == 'L' || gender == 'l'); 

            System.out.print("Usia           : ");
            int usia = Integer.parseInt(sc.nextLine());

            daftarDosen[i] = new Dosen09(kode, nama, jenisKelamin, usia);
        }

        
        System.out.println("\nData Dosen yang Telah Dimasukkan:");
        for (Dosen09 dosen : daftarDosen) {
            dosen.cetakInfo();
        }
    }
}
