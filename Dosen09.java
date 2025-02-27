import java.util.Scanner;

class Dosen09 {
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
}

class DataDosen {
    
    public static void dataSemuaDosen(Dosen09[] arrayOfDosen) {
        for (Dosen09 d : arrayOfDosen) {
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + (d.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia          : " + d.usia);
            System.out.println("-----------------------------");
        }
    }

    
    public static void jumlahDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen09 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen09[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen09 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                countPria++;
            } else {
                totalWanita += d.usia;
                countWanita++;
            }
        }
        System.out.println("Rata-rata Usia Dosen Pria   : " + (countPria == 0 ? 0 : (double) totalPria / countPria));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (countWanita == 0 ? 0 : (double) totalWanita / countWanita));
    }

   
    public static void infoDosenPalingTua(Dosen09[] arrayOfDosen) {
        Dosen09 tertua = arrayOfDosen[0];
        for (Dosen09 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("Dosen Paling Tua:");
        System.out.println("Nama  : " + tertua.nama);
        System.out.println("Usia  : " + tertua.usia);
    }

    
    public static void infoDosenPalingMuda(Dosen09[] arrayOfDosen) {
        Dosen09 termuda = arrayOfDosen[0];
        for (Dosen09 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("Dosen Paling Muda:");
        System.out.println("Nama  : " + termuda.nama);
        System.out.println("Usia  : " + termuda.usia);
    }
}