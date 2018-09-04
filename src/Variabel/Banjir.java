/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author Ardhipc
 */
public class Banjir {
    private static double banjir;
    
    //baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
    private static double titik1=0;
    private static double titik2=50;
    private static double titik3=70;
    
    
    //buat method untuk mengakses nilai pada variabel Ketinggiandaerah
    public static double getBanjir() {
        return banjir;
    }

    //buat method untuk memberikan nilai pada variabel ketinggian daerah
    public static void setBanjir(double banjir) {
         Banjir.banjir = banjir;
    }
    
    //method fungsi tidakbanjir
    public static double tidakbanjir(){
        if (banjir>titik2 && banjir<titik3) return (titik3-banjir)/(titik3-titik2);
        else if (banjir<=titik2) return 1;
        else return 0;
    }
      
     //method fungsi banjir
    public static double banjir(){
        if (banjir>titik2 && banjir<titik3) return (banjir-titik2)/(titik3-titik2);
        else if (banjir>=titik3) return 1;
        else return 0;
    }
    public static double tidakbanjir(double in){
        return (titik3-(in*(titik3-titik2)));
    }    
    public static double banjir(double in){
        return (titik2+(in*(titik3-titik2)));
    }
}
