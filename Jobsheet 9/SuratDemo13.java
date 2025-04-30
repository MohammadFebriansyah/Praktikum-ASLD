import java.util.Scanner;

public class SuratDemo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat13 stack = new StackSurat13(5); 
        int pilih;

        do {
            System.out.println("\n=== Menu Pengelolaan Surat Izin ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.next().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = sc.nextInt();

                    Surat13 surat = new Surat13(id, nama, kelas, jenis, durasi);
                    stack.push(surat);
                    break;

                case 2:
                    Surat13 suratDiproses = stack.pop();
                    if (suratDiproses != null) {
                        System.out.println("Surat yang diproses:");
                        suratDiproses.tampilSurat();
                    }
                    break;

                case 3:
                    Surat13 suratTeratas = stack.peek();
                    if (suratTeratas != null) {
                        System.out.println("Surat di posisi teratas:");
                        suratTeratas.tampilSurat();
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Keluar program.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilih != 5);
    }
}
