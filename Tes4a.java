package Pertemuan2;

public class Tes4a{
    public static void main(String[] args) {
    	
        // Membuat node sesuai urutan 5 → 7 → 9 → 8
        Node n1 = new Node(5);
        Node n2 = new Node(7);
        Node n3 = new Node(9);
        Node n4 = new Node(8);

        // Menghubungkan node secara berurutan
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        // Menampilkan isi
        Node p = n1;
        while (p != null) {
            System.out.print(p.getNilai() + " ");
            p = p.getNext();
        }
    }
}
