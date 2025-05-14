import java.util.Scanner;
public class SLLMain13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SingleLinkedList13 sll = new SingleLinkedList13();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();
        scanner.nextLine(); 
       
        for (int i = 1; i <= jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + i + ":");
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Kelas: ");
            String kelas = scanner.nextLine();
            System.out.print("IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); 
            Mahasiswa13 mhs = new Mahasiswa13(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }
        System.out.println("\nData Mahasiswa:");
        sll.print();
        scanner.close();
    }
}
