import java.util.Scanner;
public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine(); // Flush newline

        Dosen09[] arrayOfDosen = new Dosen09[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria = true, Wanita = false) : ");
            Boolean jenisKelamin = sc.nextBoolean();
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine(); // Flush newline

            arrayOfDosen[i] = new Dosen09(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n===== DATA SEMUA DOSEN =====");
        DataDosen.dataSemuaDosen(arrayOfDosen);

        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        DataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n===== RATA-RATA USIA DOSEN PER JENIS KELAMIN =====");
        DataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);

        System.out.println("\n===== DOSEN PALING TUA =====");
        DataDosen.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n===== DOSEN PALING MUDA =====");
        DataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}