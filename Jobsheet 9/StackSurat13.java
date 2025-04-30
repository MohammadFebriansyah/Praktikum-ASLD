public class StackSurat13 {
    int size;
    int top;
    Surat13[] data;

    public StackSurat13(int size) {
        this.size = size;
        data = new Surat13[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat13 s) {
        if (isFull()) {
            System.out.println("Stack penuh!");
        } else {
            top++;
            data[top] = s;
        }
    }

    public Surat13 pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return null;
        } else {
            Surat13 s = data[top];
            top--;
            return s;
        }
    }

    public Surat13 peek() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return null;
        } else {
            return data[top];
        }
    }

    public void cariSurat(String nama) {
        boolean ketemu = false;
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                data[i].tampilSurat();
                ketemu = true;
                break;
            }
        }
        if (!ketemu) {
            System.out.println("Surat izin atas nama " + nama + " tidak ditemukan.");
        }
    }
}
