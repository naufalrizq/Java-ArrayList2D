/**Algoritma
 * 1.Meminta masukkan bilangan bulat 2 - 10 untuk dijadikan jumlah elemen masing masing matriks
 * 2.Membuat 2 buah matriks2d dengan nama matriks1 dan matriks2
 * 3.Membuat array2d dengan nama hasil
 * 4.Membuat perulangan untuk mengisi matriks1
 * 5.Membuat perulangan untuk mengisi matriks2
 * 6.Membuat perulangan untuk menjumlahkan matriks 1 dengan matriks 2 sekaligus mencetak hasilnya
 * 
 * 
 */
import java.util.Scanner;

public class TP02 {

	public static void main(final String[] args) {
		int i, j, bilBul;
		Scanner s = new Scanner(System.in);

		bilBul = s.nextInt();
		int matriks1[][] = new int[bilBul][bilBul];
		int matriks2[][] = new int[bilBul][bilBul];
		int hasil[][] = new int[bilBul][bilBul];

		for (i = 0; i < bilBul; i++) {
			for (j = 0; j < bilBul; j++) {
				matriks1[i][j] = s.nextInt();
			}
		}

		for (i = 0; i < bilBul; i++) {
			for (j = 0; j < bilBul; j++) {
				matriks2[i][j] = s.nextInt();
			}
		}

		for (i = 0; i < bilBul; i++) {
			for (j = 0; j < bilBul; j++) {
				hasil[i][j] = matriks1[i][j] + matriks2[i][j];
				if (hasil[i][j] == hasil[i][bilBul-1]) {
					System.out.print(hasil[i][j]);
					
				} else {
					
				System.out.print(hasil[i][j] + " ");
				}
				
			}
			System.out.println();
		}
	}
}
