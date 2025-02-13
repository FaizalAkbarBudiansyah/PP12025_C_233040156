package Pertemuan2;

public class Node {
    private int nilai; // Menyimpan nilai integer
    private Node next; // Menunjuk ke node berikutnya

    // Konstruktor untuk inisialisasi Node
    public Node(int nilai) {
        this.nilai = nilai;
        this.next = null; // Secara default, node berikutnya adalah null
    }

    // Setter untuk nilai
    public void setNilai(int nilai) {
        this.nilai = nilai;
    }

    // Getter untuk nilai
    public int getNilai() {
        return nilai;
    }

    // Setter untuk next (menghubungkan ke node berikutnya)
    public void setNext(Node next) {
        this.next = next;
    }

    // Getter untuk next (mengambil referensi node berikutnya)
    public Node getNext() {
        return next;
    }
}
