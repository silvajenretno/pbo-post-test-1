package com.posttest1;
import java.util.ArrayList;
/**
 *
 * @author Silva_Jen_Retno
 */
public class Posttest1 {
    public static void main(String[] args) {
        ArrayList<Kucing> kucingList = new ArrayList<>();
        kucingList.add(new Kucing("Momo", "Persia", 2));
        kucingList.add(new Kucing("Dumak", "Anggora", 3));
        kucingList.add(new Kucing("Luna", "Domestik", 1));
        kucingList.add(new Kucing("Agus", "British Shorthair", 4));
        kucingList.add(new Kucing("Rani", "Bengal", 2));
        for (Kucing kucing : kucingList) {
            System.out.println("Nama kucing adalah " + kucing.getNama() +
                    ", dengan ras " + kucing.getRas() +
                    ". Dia sudah berumur " + kucing.getUmur() + " tahun");
        }
    }
}
