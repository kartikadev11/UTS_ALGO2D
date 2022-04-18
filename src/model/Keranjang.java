package model;
public class Keranjang{
    public String fotoProduk;
    public String namaProduk;
    public String deskripsi;
    public double price;
    public String asalProduk;
    public boolean statusProduk;
    
    public Keranjang(String foto, String nama, String desk, double harga, String asal, Boolean status){
        this.fotoProduk = foto;
        this.namaProduk = nama;
        this.deskripsi = desk;
        this.price = harga;
        this.asalProduk= asal;
        this.statusProduk = status;
    }

    public Keranjang(){

    }

    public void cekstatusBarang (){
        if(this.statusProduk == true){
            System.out.println("Tersedia");
            
        }
        else{
            System.out.println("Stock Habis");
        }
    }


   
    
}