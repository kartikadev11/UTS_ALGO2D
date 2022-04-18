//NAMA: KARTIKA DEVIANI
//KELAS : 2D
//NIM :21090097



import java.util.ArrayList;
import java.util.Scanner;

import model.Keranjang;

public class Tokopedia {
    
    public static void main(String[] args) {
        ArrayList<Keranjang> daftarProduk = new ArrayList<Keranjang>();
        for(int index =0;index<3;index++){
            Keranjang listproduk = new Keranjang();
            Scanner inputDetail = new Scanner(System.in);

           System.out.println("Masukkan foto produk : ");
           listproduk.fotoProduk =inputDetail.nextLine();

           System.out.println(" masukkan Nama Produk : ");
           listproduk.namaProduk =inputDetail.nextLine();

           System.out.println(" masukkan deskripsi : ");
           listproduk.deskripsi =inputDetail.nextLine();

           System.out.println(" masukkan Harga : ");
           listproduk.price =inputDetail.nextDouble();

           System.out.println(" masukkan asal barang : ");
           listproduk.asalProduk =inputDetail.nextLine();

        
           System.out.println(" status barang : ");
           listproduk.statusProduk =inputDetail.nextBoolean();

           daftarProduk.add(listproduk);
        }

        for(int i=0; i< daftarProduk.size();i++ ){
            String fotoBarang = daftarProduk.get(i).fotoProduk;
            String namaBarang = daftarProduk.get(i).namaProduk;
            String deskripsiBarang = daftarProduk.get(i).deskripsi;
            double hargaBarang = daftarProduk.get(i).price;
            String asalBarang = daftarProduk.get(i).asalProduk;
            Boolean statusBarang = daftarProduk.get(i).statusProduk;
            

            System.out.println("TOKOPEDIA");
            System.out.println("-------------------------------");
            
            System.out.println(fotoBarang);
            System.out.println(namaBarang);
            System.out.println("Deskripsi : "+deskripsiBarang);
            System.out.println("Harga : Rp.  "+hargaBarang);
            System.out.println("Asal Barang : "+asalBarang);
            System.out.println("Status :" + statusBarang);
        }
    }
}
