
package id.blits.hitungluas;


public class MainMenu {

    
    public static void main(String[] args) {
    PersegiPanjang hitung = new PersegiPanjang();
    hitung.panjang = 4;
    hitung.lebar = 5;
    hitung.hitungPersegiPanjang();
    
    Segitiga hitung2 = new Segitiga();
    hitung2.alas = 8;
    hitung2.tinggi = 3;
    hitung2.hitungSegitiga();
    
    Lingkaran hitung3 = new Lingkaran();
    hitung3.jari2= 6;
    hitung3.hitungLingkaran();
    
    Persegi hitung4 = new Persegi();
    hitung4.sisi= 7;
    hitung4.hitungPersegi();
    
    Trapesium hitung5 = new Trapesium();
    hitung5.pnjgsisi= 4;
    hitung5.tinggi=2;
    hitung5.hitungTrapesium();
           
    
    }
    
}
