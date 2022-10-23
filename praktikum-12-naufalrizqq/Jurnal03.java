/**Algoritma
 * 1.Meminta masukkan bilangan bulat (bilBul)
 * 2.Membuat variabel xKiri,xKanan,yAtas,yBawah,angka
 * 3.Mendefinisikan xKiri = 0, xKanan = bilBul - 1, yAtas = 0, yBawah = bilBul - 1, angka = 1.
 * 4.Membuat array 2D matriks dengan jumlah elemen ditentukan dari inputan (bilBul)
 * 5.Membuat perulangan while inputan bilBul dipangkatkan 2 untuk membuat persegi
 * 6.Membuat perulangan kiri ke bawah, yAtas kurang dari sama dengan yBawah maka matriks[i][xKiri] = angka++ lalu xKiri++ untuk membuat batasan
 * 7.Membuat perulangan bawah ke kanan ,xKiri kurang dari sama dengan xKanan maka matriks [yBawah][i] = angka++ lalu yBawah-- untuk membuat batasan
 * 8.Memmbuat perulangan kanan ke atas, yBawah lebih dari sama dengan yAtas maka matriks [i][xKanan] = angka++ lalu xKanan-- untuk membuat batasan
 * 9.Mmebuat perulangan atas ke kiri, xKanan lebih dari sama dengan xKiri maka matriks [yAtas][i] = angka ++ lalu yAtas++ untuk membuat batasan
 * 10.Membuat for each matriks cetak untuk cetak[j]
 */

import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        int bilBul = s.nextInt();
        int xKiri = 0, xKanan = bilBul - 1;
        int yAtas = 0, yBawah = bilBul - 1;
        int angka = 1;

        Integer[][] matriks = new Integer[bilBul][bilBul];

        while (angka <= Math.pow(bilBul, 2)) {

            // kiri ke bawah
            for (int i = yAtas; i <= yBawah; i++) {
                matriks[i][xKiri] = angka;
                angka++;
            }

            xKiri++;

            // bawah ke kanan
            for (int i = xKiri; i <= xKanan; i++) {
                matriks[yBawah][i] = angka;
                angka++;
            }

            yBawah--;

            // kanan ke atas
            for (int i = yBawah; i >= yAtas; i--) {
                matriks[i][xKanan] = angka;
                angka++;
            }

            xKanan--;

            // atas ke kiri
            for (int i = xKanan; i >= xKiri; i--) {
                matriks[yAtas][i] = angka;
                angka++;
            }

            yAtas++;
        }

        for (Integer[] cetak : matriks) {
            for (int j = 0; j < matriks.length; j++) {
                System.out.print(cetak[j]);
                if ( j!= matriks.length-1) {
                    System.out.print(" ");
                } 
            }
            System.out.println();

        }
    }
}
