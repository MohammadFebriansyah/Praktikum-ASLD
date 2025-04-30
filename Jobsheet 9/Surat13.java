public class Surat13 {
    String idSurat, namaMahasiswa, kelas;
    char jenisIzin;
    int durasi;

    public Surat13() {

    }

    public Surat13(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void tampilSurat() {
        System.out.println("ID Surat       : " + idSurat);
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("Kelas          : " + kelas);

        String jenisIzinFull = "";
        if (jenisIzin == 'S' || jenisIzin == 's') {
            jenisIzinFull = "Sakit";
        } else if (jenisIzin == 'I' || jenisIzin == 'i') {
            jenisIzinFull = "Izin";
        } else {
            jenisIzinFull = "Lainnya";
        }
        
        System.out.println("Jenis Izin     : " + jenisIzinFull);
        System.out.println("Durasi Izin    : " + durasi + " hari");
        System.out.println("-----------------------------");
    }
}
