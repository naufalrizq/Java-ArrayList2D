
/**Algoritma
 * 1.Meminta masukkan bilangan bulat antara 2 - 10 
 * 2.Membuat perulangan yang berfungsi untuk input ke dalam matriks
 * 3.Membuat perulangan lagi untuk mencetak matriks secara terbalik berdasarkan sumbu vertikal
 * 4.Jika kolom kurang dari matriks1 cetak matriks1[i][j]
 * 5.Jika tidak cetak matriks1[i][j] tambah spasi
 */

import java.util.Scanner;

public class TP01 {

	public static void main(final String[] args) {
		int i, j, bilBul;

		Scanner s = new Scanner(System.in);

		bilBul = s.nextInt();
		int matriks1[][] = new int[bilBul][bilBul];
		int cerminan[][] = new int[bilBul][bilBul];

		for (i = 0; i < bilBul; i++) {
			for (j = 0; j < bilBul; j++) {
				matriks1[i][j] = s.nextInt();
			}
		}
		for ( j = 0; j < bilBul; j++) {
            for ( i = 0; i < bilBul; i++) {
                cerminan[i][bilBul - 1 - j] = matriks1[i][j]; 
            }
        }
		
		for (i = 0; i < bilBul; i++) {
			for (j = 0; j < bilBul; j++) {
				 if (cerminan[i][bilBul- 1 ]== cerminan[i][j]  ) {
				 	System.out.print(cerminan[i][j]);
				 } else {
				 	System.out.print(cerminan[i][j] + " ");
				 }

			}
			System.out.println();
		}
	}
}
