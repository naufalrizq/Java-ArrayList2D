
/**Algoritma
 * 1.Meminta masukkan bilangan bulat antara 2 - 10 
 * 2.Membuat perulangan yang berfungsi untuk input ke dalam matriks
 * 3.Membuat perulangan lagi untuk mencetak matriks secara terbalik berdasarkan sumbu vertikal
 * 4.Jika kolom sama dengan matriks1 cetak matriks1[i][j]
 * 5.Jika tidak cetak matriks1[i][j] tambah spasi
 */

import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        int bilBul = s.nextInt();
        Integer[][] matriks = new Integer[bilBul][bilBul];

        for (int i = 0; i < bilBul; i++) {
            for (int j = 0; j < bilBul; j++) {
                matriks[i][j] = s.nextInt();
            }
        }

        for (int i = bilBul - 1; i >= 0; i--) {
            for (int j = 0; j < bilBul; j++) {
                if (matriks[i][bilBul - 1] == matriks[i][j]) {
                    System.out.print(matriks[i][j]);
                } else {
                    System.out.print(matriks[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
