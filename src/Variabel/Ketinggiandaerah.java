/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author Ardhipc
 */
public class Ketinggiandaerah {
    //buat variabel permintaan yang nantinya menjadi nilai masukan 
   static double ketinggiandaerah;
    
    //baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
    private static double titik1=0;
    private static double titik2=50;
    private static double titik3=75;
    private static double titik4=100;
    
    //buat method untuk mengakses nilai pada variabel Ketinggiandaerah
    public static double getKetinggiandaerah() {
        return ketinggiandaerah;
    }

    //buat method untuk memberikan nilai pada variabel ketinggian daerah
    public static void setKetinggiandaerah(double ketinggiandaerah) {
         Ketinggiandaerah.ketinggiandaerah = ketinggiandaerah;
    }
    
    //method fungsi rendah
    public static double rendah(){
        if (ketinggiandaerah<=titik2) return 1;
        else if (ketinggiandaerah>titik2 && ketinggiandaerah<titik3) return (titik3-ketinggiandaerah)/(titik3-titik2);
        else return 0;
    }
    
    //method fungsi sedang
    public static double sedang(){
        if (ketinggiandaerah>titik2 && ketinggiandaerah<titik3) return (ketinggiandaerah-titik2)/(titik3-titik2);
        else if (ketinggiandaerah>titik3 && ketinggiandaerah<titik4) return (titik4-ketinggiandaerah)/(titik4-titik3);
        else if (titik3 == ketinggiandaerah) return 1;
        else return 0;
    }
     //method fungsi tinggi
    public static double tinggi(){
        if (ketinggiandaerah>titik3 && ketinggiandaerah<titik4) return (ketinggiandaerah-titik3)/(titik4-titik3);
        else if (ketinggiandaerah>=titik4) return 1;
        else return 0;
    }
}
