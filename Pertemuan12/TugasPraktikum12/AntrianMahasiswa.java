package TugasPraktikum12;
public class AntrianMahasiswa {
    Node front, rear;
    int size;
    int kapasitas;

    public AntrianMahasiswa(int kapasitas) {
        this.kapasitas = kapasitas;
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == kapasitas;
    }

    public void enqueue(Mahasiswa data) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak dapat menambahkan.");
            return;
        }
        Node baru = new Node(data);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong. Tidak ada yang bisa dipanggil.");
            return;
        }
        System.out.print("Memanggil: ");
        front.data.tampil();
        front = front.next;
        size--;
        if (front == null) rear = null;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        Node temp = front;
        while (temp != null) {
            temp.data.tampil();
            temp = temp.next;
        }
    }

    public void tampilDepanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.print("Antrian Terdepan: ");
        front.data.tampil();
        System.out.print("Antrian Terakhir: ");
        rear.data.tampil();
    }

    public int jumlahAntrian() {
        return size;
    }
}
