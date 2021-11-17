/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungluaslingkaran;

/**
 *
 * @author USER
 */
public class Lingkaran {
    // attribut
    private final double PHI = 3.14;
    private double r;
    
    public void setR(double jari){ // jari menangkap angka 7 yang telah dimasukkan di class Test
        r = jari; // r sekarang bernilai 7
        
        if (r < 1){ // jika r kurang dari 1 maka menampilkan pesan dibawah
            System.out.println("r tidak boleh kurang dari 1");
        }
        else{ // jika tidak maka menampilkan pesan dibawah
            System.out.println("r yang anda masukkan benar");
        }
    }
    
    private double getR(){
        double luas = PHI * r * r; // r tadi sudah bernilai 7 krn r diberi nilai dari jari dimana jari menangkap angka 7 yang dimasukkan di class Test
        
        return luas; // mengembalikan nilai dari luas
    }
    
    public void result(){ // menampilkan nilai dari getR dimana nilai dari getR merupakan nilai kembalian luas
        System.out.println("Luas lingkaran " + getR() + " cm2");
    }
}
