package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;
        int password, pil, pilih;
        String kembali = "Y";
        System.out.println("=====================LOGIN========================");
        System.out.print("Masukkan Username : ");username = input.next("bismillah");
        System.out.print("Masukkan Password : ");password = input.nextInt();
        System.out.println("==================================================");
        if( password == 1) {
            while (kembali.equalsIgnoreCase("Y")) {
                System.out.println("==========================================");
                System.out.println("=     TUGAS PROYEK PBO IRFAN MAULANA     =");
                System.out.println("=          APLIKASI CONVERT TIME         =");
                System.out.println("==========================================");
                System.out.println("============== 1. Jam   ==================");
                System.out.println("============== 2. Menit ==================");
                System.out.println("============== 3. Detik ==================");
                System.out.print("Masukkan Pilihan Anda : ");
                pil = input.nextInt();
                if (pil == 1){
                    Jam jm= new Jam();
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                    System.out.print(">Masukan angka Jam: ");
                    jm.setJ(input.nextDouble());
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("1. Cari Jam Ke Menit");
                    System.out.println("2. Cari Jam ke Detik");
                    System.out.print("Masukan Pilihan : ");
                    pilih=input.nextInt();
                    if (pilih == 1){
                        System.out.print("Convert Jam Ke Menit Adalah : " +jm.JamkeMenit());
                        System.out.println(" Menit");
                    }
                    if(pilih == 2){
                        System.out.print("Convert Jam Ke Detik Adalah : " +jm.JamkeDetik());
                        System.out.println(" Detik");
                    }
                }
                else if (pil== 2){
                    Menit mn= new Menit();
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                    System.out.print(">Masukan angka Menit :");
                    mn.setM(input.nextDouble());
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("1. Cari Menit Ke Jam");
                    System.out.println("2. Cari Menit ke Detik");
                    System.out.print("Masukan Pilihan : ");
                    pilih=input.nextInt();
                    if (pilih == 1){
                        System.out.print("Convert Menit Ke Jam Adalah : " +mn.MenitkeJam());
                        System.out.println(" Jam");
                    }
                    if(pilih == 2) {
                        System.out.print("Convert Menit Ke Detik Adalah : " + mn.MenitkeDetik());
                        System.out.println(" Detik");
                    }
                }
                else if (pil== 3){
                    Detik dt= new Detik();
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                    System.out.print(">Masukan angka Detik : ");
                    dt.setD(input.nextDouble());
                    System.out.println("++++++++++++++++++++++++++++++++++++++++++");
                    System.out.println("1. Cari Detik Ke Jam");
                    System.out.println("2. Cari Detik ke Menit");
                    System.out.print("Masukan Pilihan : ");
                    pilih=input.nextInt();
                    if (pilih == 1){
                        System.out.print("Convert Detik Ke Jam Adalah : " +dt.DetikkeJam());
                        System.out.println(" Jam");
                    }
                    if(pilih == 2) {
                        System.out.print("Convert Detik Ke Menit Adalah : " + dt.DetikkeMenit());
                        System.out.println(" Menit");
                    }
                }
                System.out.println();
                System.out.print("Kembali ke Menu ? Y/T : ");
                kembali = input.next();
            }
        }
        else {
            System.out.println("MAAF ANDA SALAH PASSWORD!");
        }
    }
}