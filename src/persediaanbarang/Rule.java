/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package persediaanbarang;
import Variabel.*;
/**
 *
 * @author Ardhipc
 */
public class Rule {
    private static double [] u_Produksi = new double[27];
    private static double [] z_Produksi = new double[27];
    private static double bobot;
    
    //rule fuzzy fikasi
    public static void hitung_u(){
        u_Produksi[0]=Math.min(Math.min(Curahhujan.tinggi(), Ketinggiandaerah.tinggi()), Suhu.rendah());
        u_Produksi[1]=Math.min(Math.min(Curahhujan.tinggi(), Ketinggiandaerah.sedang()), Suhu.rendah());
        u_Produksi[2]=Math.min(Math.min(Curahhujan.tinggi(), Ketinggiandaerah.rendah()), Suhu.rendah());
        u_Produksi[3]=Math.min(Math.min(Curahhujan.tinggi(), Ketinggiandaerah.tinggi()), Suhu.sedang());
        u_Produksi[4]=Math.min(Math.min(Curahhujan.tinggi(), Ketinggiandaerah.sedang()), Suhu.sedang());
        u_Produksi[5]=Math.min(Math.min(Curahhujan.tinggi(), Ketinggiandaerah.rendah()), Suhu.sedang());
        u_Produksi[6]=Math.min(Math.min(Curahhujan.tinggi(), Ketinggiandaerah.tinggi()), Suhu.tinggi());
        u_Produksi[7]=Math.min(Math.min(Curahhujan.tinggi(), Ketinggiandaerah.sedang()), Suhu.tinggi());
        u_Produksi[8]=Math.min(Math.min(Curahhujan.tinggi(), Ketinggiandaerah.rendah()), Suhu.tinggi());
        u_Produksi[9]=Math.min(Math.min(Curahhujan.sedang(), Ketinggiandaerah.tinggi()), Suhu.rendah()); 
        u_Produksi[10]=Math.min(Math.min(Curahhujan.sedang(), Ketinggiandaerah.sedang()), Suhu.rendah());
        u_Produksi[11]=Math.min(Math.min(Curahhujan.sedang(), Ketinggiandaerah.rendah()), Suhu.rendah());
        u_Produksi[12]=Math.min(Math.min(Curahhujan.sedang(), Ketinggiandaerah.tinggi()), Suhu.sedang());
        u_Produksi[13]=Math.min(Math.min(Curahhujan.sedang(), Ketinggiandaerah.sedang()), Suhu.sedang());
        u_Produksi[14]=Math.min(Math.min(Curahhujan.sedang(), Ketinggiandaerah.rendah()), Suhu.sedang());
        u_Produksi[15]=Math.min(Math.min(Curahhujan.sedang(), Ketinggiandaerah.tinggi()), Suhu.tinggi());
        u_Produksi[16]=Math.min(Math.min(Curahhujan.sedang(), Ketinggiandaerah.sedang()), Suhu.tinggi());
        u_Produksi[17]=Math.min(Math.min(Curahhujan.sedang(), Ketinggiandaerah.rendah()), Suhu.tinggi());
        u_Produksi[18]=Math.min(Math.min(Curahhujan.rendah(), Ketinggiandaerah.tinggi()), Suhu.rendah());
        u_Produksi[19]=Math.min(Math.min(Curahhujan.rendah(), Ketinggiandaerah.sedang()), Suhu.rendah());
        u_Produksi[20]=Math.min(Math.min(Curahhujan.rendah(), Ketinggiandaerah.rendah()), Suhu.rendah());
        u_Produksi[21]=Math.min(Math.min(Curahhujan.rendah(), Ketinggiandaerah.tinggi()), Suhu.sedang());
        u_Produksi[22]=Math.min(Math.min(Curahhujan.rendah(), Ketinggiandaerah.sedang()), Suhu.sedang());
        u_Produksi[23]=Math.min(Math.min(Curahhujan.rendah(), Ketinggiandaerah.rendah()), Suhu.sedang());
        u_Produksi[24]=Math.min(Math.min(Curahhujan.rendah(), Ketinggiandaerah.tinggi()), Suhu.tinggi());
        u_Produksi[25]=Math.min(Math.min(Curahhujan.rendah(), Ketinggiandaerah.sedang()), Suhu.tinggi());
        u_Produksi[26]=Math.min(Math.min(Curahhujan.rendah(), Ketinggiandaerah.rendah()), Suhu.tinggi());
             

    }
    
    public static void hitung_z(){
        z_Produksi[0]=Banjir.tidakbanjir(u_Produksi[0]);
        z_Produksi[1]=Banjir.banjir(u_Produksi[1]);
        z_Produksi[2]=Banjir.banjir(u_Produksi[2]);
        z_Produksi[3]=Banjir.tidakbanjir(u_Produksi[3]);
        z_Produksi[4]=Banjir.banjir(u_Produksi[4]);
        z_Produksi[5]=Banjir.banjir(u_Produksi[5]);
        z_Produksi[6]=Banjir.tidakbanjir(u_Produksi[6]);
        z_Produksi[7]=Banjir.banjir(u_Produksi[7]);
        z_Produksi[8]=Banjir.banjir(u_Produksi[8]);
        z_Produksi[9]=Banjir.tidakbanjir(u_Produksi[9]);
        z_Produksi[10]=Banjir.tidakbanjir(u_Produksi[10]);
        z_Produksi[11]=Banjir.banjir(u_Produksi[11]);
        z_Produksi[12]=Banjir.tidakbanjir(u_Produksi[12]);
        z_Produksi[13]=Banjir.tidakbanjir(u_Produksi[13]);
        z_Produksi[14]=Banjir.banjir(u_Produksi[14]);
        z_Produksi[15]=Banjir.tidakbanjir(u_Produksi[15]);
        z_Produksi[16]=Banjir.tidakbanjir(u_Produksi[16]);
        z_Produksi[17]=Banjir.banjir(u_Produksi[17]);
        z_Produksi[18]=Banjir.tidakbanjir(u_Produksi[18]);
        z_Produksi[19]=Banjir.tidakbanjir(u_Produksi[19]);
        z_Produksi[20]=Banjir.tidakbanjir(u_Produksi[20]);
        z_Produksi[21]=Banjir.tidakbanjir(u_Produksi[21]);
        z_Produksi[22]=Banjir.tidakbanjir(u_Produksi[22]);
        z_Produksi[23]=Banjir.tidakbanjir(u_Produksi[23]);
        z_Produksi[24]=Banjir.tidakbanjir(u_Produksi[24]);
        z_Produksi[25]=Banjir.tidakbanjir(u_Produksi[25]);
        z_Produksi[26]=Banjir.tidakbanjir(u_Produksi[26]);

    }
    //eend of rule
    
    //cari nilai bobot (tsukamoto)
    public static double bobot(){
        double atas=0,bawah=0;
        for(int i=0;i<27;i++){
            System.out.println("z_ke-"+i+ " : " +z_Produksi[i]);
            System.out.println("u_ke-"+i+ " : " +u_Produksi[i]);
            atas+=(u_Produksi[i]*z_Produksi[i]);
            bawah+=u_Produksi[i];
        }
        System.out.println(atas/bawah);
        return (atas/bawah);
    }
}
