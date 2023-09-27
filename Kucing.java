package com.posttest1;
/**
 *
 * @author Silva_Jen_Retno
 */
class Kucing {
    private String nama;
    private String ras;
    private int umur;
    public Kucing(String nama, String ras, int umur) {
        this.nama = nama;
        this.ras = ras;
        this.umur = umur;
    }
    public String getNama() {
        return nama;
    }
    public String getRas() {
        return ras;
    }
    public int getUmur() {
        return umur;
    }
}
