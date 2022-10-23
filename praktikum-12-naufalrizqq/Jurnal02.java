/**Algoritma
 * 1.Meminta masukkan bilangan bulat
 * 2.Membuat variabel i,j,akhir
 * 3.Membuat variabel  cekBaris1, cekBaris2, cekKolom1, cekKolom2, cekHorizon1, cekHorizon2, cekVertikal1, cekVertikal2 untuk mengecek inputan matriks
 * 4.Membuat variabel simpanBaris1, simpanBaris2, simpanKolom1, simpanKolom2, simpanHorizon1,
    simpanHorizon2, simpanVertikal1, simpanVertikal2 untuk menyimpan inputan matriks
 * 5.Membuat variabel hasil
 * 6.Membuat array 2D matriks papan
 * 7.Membuat perulangan for untuk inputan ke dalam matriks
 * 8.Membuat perulangan bersarang yang isinya terdiri dari deklarasi variabel, pengecekan baris,kolom,horizontal dan vertikal 1 dan 2. Variabel akhir decrement
 *   Jika, inputan bilBul = 1 maka cetak 0 dan jika inputan bilBul = 2 maka cetak x, setelah itu akan diproses ke variabel simpan baris,kolom,horizontal dan vertikal 1 dan 2. Variabel akhir decrement
 * 9.Jika simpan baris,kolom,horizontal dan vertikal 1 dan 2 tidak sama dengan bilBul, lalu membuat perulangan lagi jika matriks papan sama dengan 0 maka cetak "?" yang artinya tidak ada pemenangnya dan jika matriks papan tidak sama dengan 0 makan cetak "-" yang artinya seri.
 * 10.Cetak hasil.
 */
import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int bilBul = s.nextInt();
        int i, j, akhir;
        int cekBaris1, cekBaris2, cekKolom1, cekKolom2, cekHorizon1, cekHorizon2, cekVertikal1, cekVertikal2;
        int simpanBaris1 = 0, simpanBaris2 = 0, simpanKolom1 = 0, simpanKolom2 = 0, simpanHorizon1 = 0,
            simpanHorizon2 = 0, simpanVertikal1 = 0, simpanVertikal2 = 0;
        String hasil = "";
        Integer[][] papan = new Integer[bilBul][bilBul];

        for (i = 0; i < bilBul; i++) {
            for (j = 0; j < bilBul; j++) {
                papan[i][j] = s.nextInt();
            }
        }

        for (i = 0; i < bilBul; i++) {
            // deklarasi variabel
            cekBaris1 = 0;
            cekKolom1 = 0;
            cekBaris2 = 0;
            cekKolom2 = 0;
            cekHorizon1 = 0;
            cekHorizon2 = 0;
            cekVertikal1 = 0;
            cekVertikal2 = 0;
            akhir = bilBul - 1;

            // cek i, j, vertikal, horizontal 1
            for (j = 0; j < bilBul; j++) {
                if (papan[i][j] == 1) {
                    cekBaris1++;
                    simpanBaris1 = cekBaris1;
                    if (cekBaris1 == bilBul) {
                        hasil = "O";
                    }
                }
                if (papan[j][i] == 1) {
                    cekKolom1++;
                    simpanKolom1 = cekKolom1;
                    if (cekKolom1 == bilBul) {
                        hasil = "O";
                    }
                }
                if (papan[j][j] == 1) {
                    cekHorizon1++;
                    simpanHorizon1 = cekHorizon1;
                    if (cekHorizon1 == bilBul) {
                        hasil = "O";
                    }
                }
                if (papan[j][akhir] == 1) {
                    cekVertikal1++;
                    simpanVertikal1 = cekVertikal1;
                    if (simpanVertikal1 == bilBul) {
                        hasil = "O";
                    }
                    akhir--;
                }
            }

            akhir = bilBul - 1;
            // cek i, j, vertikal, horizontal 2
            for (j = 0; j < bilBul; j++) {
                if (papan[i][j] == 2) {
                    cekBaris2++;
                    simpanBaris2 = cekBaris2;
                    if (cekBaris2 == bilBul) {
                        hasil = "X";
                    }
                }
                if (papan[j][i] == 2) {
                    cekKolom2++;
                    simpanKolom2 = cekKolom2;
                    if (cekKolom2 == bilBul) {
                        hasil = "X";
                    }
                }
                if (papan[j][j] == 2) {
                    cekHorizon2++;
                    simpanHorizon2 = cekHorizon2;
                    if (cekHorizon2 == bilBul) {
                        hasil = "X";
                    }
                }
                if (papan[j][akhir] == 2) {
                    cekVertikal2++;
                    simpanVertikal2 = cekVertikal2;
                    if (simpanVertikal2 == bilBul) {
                        hasil = "X";
                    }
                    akhir--;
                }
            }
        }
        if (simpanBaris1 != bilBul && simpanBaris2 != bilBul && simpanKolom1 != bilBul && simpanKolom2 != bilBul && simpanHorizon1 != bilBul
                && simpanHorizon2 != bilBul && simpanVertikal1 != bilBul && simpanVertikal2 != bilBul) {
            for (i = 0; i < bilBul; i++) {
                for (j = 0; j < bilBul; j++) {
                    if (papan[i][j] == 0) {
                        hasil = "?";
                        break;
                    } else if (papan[i][j] != 0) {
                        hasil = "-";
                    }
                }
            }
        }
        System.out.println(hasil);
    }
}
