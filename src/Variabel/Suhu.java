/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author rizz
 */
public class Suhu {
     private static double suhu;
    
    //baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
    private static double titik1=0;
    private static double titik2=20;
    private static double titik3=25;
    private static double titik4=30;
    
    //buat method untuk mengakses nilai pada variabel Ketinggiandaerah
    public static double getSuhu() {
        return suhu;
    }

    //buat method untuk memberikan nilai pada variabel ketinggian daerah
    public static void setSuhu(double suhu) {
         Suhu.suhu = suhu;
    }
    
    //method fungsi rendah
    public static double rendah(){
        if (suhu>titik2 && suhu<titik3) return (titik3-suhu)/(titik3-titik2);
        else if(suhu<=titik2) return 1;
        else return 0;
    }
    
    //method fungsi sedang
    public static double sedang(){
        if (suhu>titik2 && suhu<titik3) return (suhu-titik2)/(titik3-titik2);
        else if (suhu>titik3 && suhu<titik4) return (titik4-suhu)/(titik4-titik3);
        else if (suhu == titik3) return 1;
        else return 0;
    }
     //method fungsi tinggi
    public static double tinggi(){
        if (suhu>titik3 && suhu<titik4) return (suhu-titik3)/(titik4-titik3);
        else if (suhu>=titik4) return 1;
        else return 0;
    }
}
