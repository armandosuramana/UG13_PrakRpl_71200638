package com.ug13.sakitrumah;

public class Pengunjung {
    private String nama;
    private int usia;
    private String alamat;
    private String penyakit;
    private int levelPenyakit = 4;
    private String status ;


    public Pengunjung(String nama, int usia,String alamat){
        this.alamat =alamat;
        this.levelPenyakit =levelPenyakit;
        this.usia =usia;
        this.penyakit =penyakit;
        this.status = status;
    }

    public Pengunjung() {
    }

    public String getNama(){
        return nama;

    }
    public void setNama(String nama){
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }
    public void setUsia(int usia){
        this.usia =usia;
    }
    public String getAlamat(){
        return alamat;
    }
    public  void setAlamat(String alamat){
        this.alamat =alamat;
    }
    public String getPenyakit(){
        return penyakit;
    }
    public void setPenyakit(String penyakit){
        this.penyakit=penyakit;
    }
    public boolean getStatus(){
        return Boolean.parseBoolean(status);

    }
    public void setStatus(String status){
        this.status = status;
    }
    public int getLevelPenyakit(){
        return levelPenyakit;
    }
    public  void setLevelPenyakit(int levelPenyakit){
        this.levelPenyakit = levelPenyakit;
    }

    public void setStatus(boolean b) {
        this.status = status;
    }

    protected void inputPengunjung(Pengunjung pengunjung) {

    }
}
