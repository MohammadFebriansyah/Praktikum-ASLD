package TugasJobsheet10;
public class AntrianKRS {
    Mahasiswa[] data;
    int front, rear, size, max;
    int jumlahProses;

    public AntrianKRS(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
        jumlahProses = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }
            data[rear] = mhs;
            size++;
        }
    }

    public Mahasiswa dequeue() {
        Mahasiswa mhs = null;
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            mhs = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                front = (front + 1) % max;
            }
        }
        return mhs;
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        jumlahProses = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            int i = front;
            while (i != rear) {
                data[i].tampilkanData();
                i = (i + 1) % max;
            }
            data[i].tampilkanData();
            System.out.println("Jumlah antrian: " + size);
        }
    }

    public void tampilkan2Terdepan() {
        if (size >= 1) {
            System.out.println("Antrian terdepan:");
            data[front].tampilkanData();
        }
        if (size >= 2) {
            int kedua = (front + 1) % max;
            System.out.println("Antrian ke-2:");
            data[kedua].tampilkanData();
        }
        if (size < 1) {
            System.out.println("Antrian kosong!");
        }
    }

    public void tampilkanBelakang() {
        if (!isEmpty()) {
            System.out.println("Antrian paling belakang:");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong!");
        }
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, proses dibatalkan.");
        } else {
            System.out.println("Mahasiswa yang dipanggil untuk proses KRS:");
            Mahasiswa mhs1 = dequeue();
            Mahasiswa mhs2 = dequeue();
            mhs1.tampilkanData();
            mhs2.tampilkanData();
            jumlahProses += 2;
        }
    }

    public void getJumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }

    public void getJumlahProses() {
        System.out.println("Jumlah mahasiswa yang sudah melakukan proses KRS: " + jumlahProses);
    }

    public void getBelumProses() {
        int sisa = 30 - jumlahProses;
        System.out.println("Jumlah mahasiswa yang belum melakukan proses KRS: " + sisa);
    }
}
