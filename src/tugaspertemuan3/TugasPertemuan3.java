package tugaspertemuan3;
class keramik{
    int luas = 1000000, panjang, lebar, isi, harga;
    keramik (int p, int l, int i, int h) {
        panjang = p;
        lebar = l;
        isi = i;
        harga = h;
    }
    int hitungjumlahKeramik(){
        int jumlahKeramik = (luas / (panjang * lebar));
        return jumlahKeramik; 
    }
    int hitungtotalBox(){
        int totalBox = (luas / (panjang * lebar)) / isi;
        return totalBox;
    }
    int hitunghargaTotal(){
        int hargaTotal = ((luas / (panjang * lebar)) / isi) * harga;
        return hargaTotal;
    }
}
/**
 *
 * @author Christian Anelka
 */
public class TugasPertemuan3 {

    public static void main(String[] args) {
//        keramik kA, kB, kC;
        keramik kA = new keramik(30, 30, 10, 54000);
        keramik kB = new keramik(40, 40, 5, 65000);
        keramik kC = new keramik(30, 40, 8, 60000);

        /*Keramik A*/
        System.out.println ("Jumlah Keramik Yang Dibutuhkan = " + kA.hitungjumlahKeramik() + " Buah");
        System.out.println ("Jumlah Box Yang Dibutuhkan = " + kA.hitungtotalBox() + " Box");
        System.out.println ("Total Harga = Rp " + kA.hitunghargaTotal());

        /*Keramik B*/
        System.out.println ("Jumlah Keramik Yang Dibutuhkan = " + kB.hitungjumlahKeramik() + " Buah");
        System.out.println ("Jumlah Box Yang Dibutuhkan = " + kB.hitungtotalBox() + " Box");
        System.out.println ("Total Harga = Rp " + kB.hitunghargaTotal());
        
        /*Keramik C*/
        System.out.println ("Jumlah Keramik Yang Dibutuhkan = " + kC.hitungjumlahKeramik() + " Buah");
        System.out.println ("Jumlah Box Yang Dibutuhkan = " + kC.hitungtotalBox() + " Box");
        System.out.println ("Total Harga = Rp " + kC.hitunghargaTotal());
    }
    
}
    