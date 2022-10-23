/**Algoritma
 * 1.Meminta masukkan bilangan bulat 2 - 10 untuk dijadikan jumlah elemen masing masing matriks
 * 2.Membuat 2 buah matriks2d dengan nama matriks1 dan matriks2
 * 3.Membuat array2d dengan nama hasil
 * 4.Membuat perulangan untuk mengisi matriks1
 * 5.Membuat perulangan untuk mengisi matriks2
 * 6.Membuat perulangan untuk mengkalikan matriks 1[i][k] dengan matriks 2[k][j] dan menyimpan hasilnya pada array hasil
 * 7.Membuat perulangan untuk mencetak array hasil.
 * 
 */


import java.util.Scanner;

public class TP03 {

	public static void main(final String[] args) {
		int i, j, k, n, jumlah = 0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int matriks1[][] = new int[n][n];
		int matriks2[][] = new int[n][n];
		int hasil[][] = new int[n][n];

		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				matriks1[i][j] = s.nextInt();
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				matriks2[i][j] = s.nextInt();
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				for (k = 0; k < n; k++) {
					jumlah = jumlah + matriks1[i][k] * matriks2[k][j];
				}
				hasil[i][j] = jumlah;
				jumlah = 0;
			}
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (hasil[i][j] == hasil[i][n-1]) {
					System.out.print(hasil[i][j]);
					
				} else {
					
				System.out.print(hasil[i][j] + " ");
				}
				//System.out.print(hasil[i][j] + " ");
			}
			System.out.println();
		}
	}
}
