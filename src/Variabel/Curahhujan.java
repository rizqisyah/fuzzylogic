/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author Ardhipc
 */
public class Curahhujan {
    //buat variabel persediaan yang nantinya menjadi nilai masukan
   private static double curahhujan;
    
    //baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
    private static double titik1=0;
    private static double titik2=100;
    private static double titik3=350;
    private static double titik4=400;
    //buat method untuk mengakses nilai pada variabel curahhujan
    public static double getCurahhujan() {
        return curahhujan;
    }

    //buat method untuk memberikan nilai pada variabel curahhujan
     public static void setCurahhujan(double curahhujan) {
         Curahhujan.curahhujan = curahhujan;
    }
    
    //method fungsi rendah
    public static double rendah(){
        if (curahhujan<=titik2) return 1;
        else if (curahhujan>titik2 && curahhujan<titik3) return (titik3-curahhujan)/(titik3-titik2);
        else return 0;
    }
    //method fungsi sedang
    public static double sedang(){
        if (curahhujan>titik2 && curahhujan<titik3) return (curahhujan-titik2)/(titik3-titik2);
        else if (curahhujan>titik3 && curahhujan <titik4) return (titik4-curahhujan)/(titik4-titik3);
        else if (curahhujan == titik3) return 1;
        else return 0;
    }
    //method fungsi tinggi
    public static double tinggi(){
        if (curahhujan>=titik4) return 1;
        else if (curahhujan>titik3 && curahhujan<titik4) return (curahhujan-titik3)/(titik4-titik3);
        else return 0;
    }

}
