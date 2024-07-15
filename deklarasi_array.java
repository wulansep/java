/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deklarasi_array;

/*PACKAGE: java.util
CLASS: Arrays

*/

import java.util.Arrays;

/**
 *
 * @author bucin
 */
public class Deklarasi_array {

    /**
     * @param args the command line arguments
     */
    
 /*
        3 Jenis Array
          a) Array 1 dimensi
          b) Array 2 Dimensi
          c) Array 3 Dimensi
        
        Struktur Assigmen Array
          tipedata[] namaArray = {, ,};
          contoh: int[]ArrayAngka ={90, 79, 36};
                                     |   |   |
        Posisi index dari elemen     0   1   2
        ----------------------------------------------------------------------------------------------------
        int a;
        int b;
        int c;
        a = 2;
        b = 3;
        
        Struktur Deklarasi Array
          namaArray = new tipeData[jumlahElemen];
          contoh: arrayAngka = new int [3]
        
        Contoh beberapa tipe data:
        kalimat = new char[100];
        double = new double[10];
        float = new float [15];
        
        */
    public static void main(String[] args) {
        System.out.println("A.DEKLARASI DAN ASSIGMEN ARRAY MENGGUNAKAN TIPE DATA 'INTEGER'");
        
        //DEKLARASI (mendefinisikan variabel sebelum dilakukan assigmen)
        System.out.println("  DEKLARASI ARRAY MENGGUNAKAN TIPE DATA INTEGER");
        int[] arrayAngka = new int[3]; //JUMLAH INDEKS PADA ARRAY ADALAH 3
        arrayAngka[0] = 9; //INDEX 0 (INDEX DIMULAI DARI ANGKA 0)
        arrayAngka[1] = 7; //INDEX 1
        arrayAngka[2] = 5; //INDEX 2
        
        // Menampilkan data dari Deklarasi Array
        System.out.println("   Array Angka index ke-0 = " + arrayAngka[0]);
        System.out.println("   Array Angka index ke-1 = " + arrayAngka[1]);
        System.out.println("   Array Angka index ke-2 = " + arrayAngka[2]);
        System.out.println(""); // Line baru
        
        //ASSIGMEN (variabel yang telah ditetapkan nilainya dan sudah dideklarasikan dengan tipe data *new int[3]*)
        System.out.println("  ASSIGMEN ARRAY MENGGUNAKAN TIPE DATA INTEGER");
        int[] arrayNilai = {100, 200, 300}; //Pastikan nama variabel berbeda dengan variabel deklarasi

        // Menampilkan data dari Assigmen Array Nilai (variabel kedua)
        System.out.println("   Array Angka Nilai ke-0 = " + arrayNilai[0]);
        System.out.println("   Array Angka Nilai ke-1 = " + arrayNilai[1]);
        System.out.println("   Array Angka Nilai ke-2 = " + arrayNilai[2]);
        System.out.println("========================================================"); // Pembatas Baris"
//------------------------------------------------------------------------------------------------------------------------------------    
        System.out.println("B.DEKLARASI DAN ASSIGMEN ARRAY MENGGUNAKAN TIPE DATA 'STRING'");
        System.out.println("  DEKLARASI ARRAY MENGGUNAKAN TIPE DATA 'STRING'");
        String[] arrayString = new String[4]; //Penggunaan tipe data 'String' pada Array
        arrayString[0] = "Miming"; //Saat menggunakan tipe data 'String', wajib diawali dengan petik dua (")
        arrayString[1] = "Sekay";
        arrayString[2] = "Moppi";
        arrayString[3] = "Miu";
        
        //Menampilkan data dari Deklarasi Array String
        System.out.println("   Nama kucing ke-1 adalah " + arrayString[0]);
        System.out.println("   Nama kucing ke-2 adalah " + arrayString[1]);
        System.out.println("   Nama kucing ke-3 adalah " + arrayString[2]);
        System.out.println("   Nama kucing ke-4 adalah " + arrayString[3]);
        System.out.println("");
        
        System.out.println("  ASSIGMEN ARRAY MENGGUNAKAN TIPE DATA 'STRING'");
        String[] arrayKucing = {"MimingCat", "SekayCat", "MoppiCat", "MiuCat"};
        
        //Menampilkan data dari Assigmen Array Kucing (variabel kedua)
        System.out.println("   Nama kucing ke-1 adalah " + arrayKucing[0]);
        System.out.println("   Nama kucing ke-2 adalah " + arrayKucing[1]);
        System.out.println("   Nama kucing ke-3 adalah " + arrayKucing[2]);
        System.out.println("   Nama kucing ke-4 adalah " + arrayKucing[3]);       
        System.out.println("========================================================");
//------------------------------------------------------------------------------------------------------------------------------------       
        // Menampilkan data Array tanpa memanggil index
        System.out.println("C.MENAMPILKAN DATA DARI ARRAY TANPA MEMANGGIL INDEX");        
        System.out.println("  MEMANGGIL ARRAY TANPA MENGGUNAKAN INDEX (INTEGER)");
        System.out.println("   Data ArrayAngka ->" + Arrays.toString(arrayAngka));
        System.out.println("   Data ArrayNilai ->" + Arrays.toString(arrayNilai));
        System.out.println("");
        System.out.println("  MEMANGGIL ARRAY TANPA MENGGUNAKAN INDEX (STRING)");
        System.out.println("   Data ArrayString ->" + Arrays.toString(arrayString));
        System.out.println("   Data ArrayKucing ->" + Arrays.toString(arrayKucing));
        System.out.println("========================================================");        
//------------------------------------------------------------------------------------------------------------------------------------
        System.out.println("D.MELAKUKAN PERULANGAN (LOOPING) PADA ARRAY");
        System.out.println("  1) LOOPING 'for'");  //melakukan perulangan secara tidak spesifik
        System.out.println("   LOOPING 'for' PADA ArrayAngka");
        for (int i = 0; i < 3 ; i++) { // [i = 0] karena index dimulai dari 0
                                       // [< 3] jumlah index ArrayAngka hanya sampai 2
                                       // [i++] Post-Increment
            System.out.println("    Array Angka indeks ke-" + i +" = "+ arrayAngka[i]);
        }
        System.out.println("");
        System.out.println("   LOOPING 'for' PADA ArrayKucing");
        for (int i = 0; i < 4 ; i++) {
            System.out.println("    Array Kucing indeks ke-" + i +" = "+ arrayKucing[i]);
        }
        System.out.println("");
        System.out.println("  2) LOOPING 'for' MENGGUNAKAN FUNGSI length");
        System.out.println("   LOOPING 'for' + length PADA ArrayNilai"); //melakukan perulangan secara spesifik dengan memanggil nama array
        for (int i = 0; i < arrayNilai.length ; i++) { 
            System.out.println("    Array Nilai indeks ke-" + i +" = "+ arrayNilai[i]);
        }
        System.out.println("");
        System.out.println("   LOOPING 'for' + length PADA ArrayString");
        for (int i = 0; i < arrayString.length ; i++) { 
            System.out.println("    Array String indeks ke-" + i +" = "+ arrayString[i]);
        }
        System.out.println("");
        System.out.println("  3) LOOPING 'foreach'"); //foreach merupakan perulangan yang simple tanpa harus menentukan indeks saat akan mengambil data array
        System.out.println("   LOOPING 'foreach' PADA ArrayNilai");
        for (int nilai : arrayNilai){
            System.out.println("     "+nilai);
        }
        System.out.println("");
        System.out.println("   LOOPING 'foreach' PADA ArrayString");
        for (String string : arrayString){
            System.out.println("     "+string);
        }
        System.out.println("========================================================");
}
}
