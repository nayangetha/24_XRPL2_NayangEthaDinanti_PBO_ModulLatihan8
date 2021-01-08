/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_8;
import java.util.Scanner;
/**
 *
 * @author MOKLET1
 */
public class Latihan_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner masukan = new Scanner(System.in);
        
        //Input data oleh user pada variabel lokal
        System.out.print("Masukkan nilai TPA : ");
        int TPA = masukan.nextInt();
        System.out.print("Masukkan nilai NBahasa Inggris : ");
        int BahasaInggris = masukan.nextInt();
        //Pernyataan if else
        if ((TPA>85)&&(BahasaInggris > 80))
            System.out.println("Siswa dapat beasiswa");
        else 
            System.out.println("Siswa tidak dapat beasiswa");
    }
    
}
