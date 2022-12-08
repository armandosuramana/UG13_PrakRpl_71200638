package com.ug13.sakitrumah;

public class Jadwal {
    private int idPengunjung;
    private Pemeriksa pemeriksa;
    private Perawat perawat;
    private Pendaftaran pendaftaran;
    private Boolean statusDaftar;
    private Boolean statusSceening;

    public int getIdPengunjung() {
        return idPengunjung;
    }
    public void setIdPengunjung(int idPengunjung){
        this.idPengunjung =idPengunjung;
    }
    public Pemeriksa getPemeriksa(){
        return pemeriksa;

    }
    public void setPemeriksa(Pemeriksa pemeriksa){
        this.pemeriksa = pemeriksa;

    }

    public Perawat getPerawat() {
        return perawat;
    }
    public void setPerawat(Perawat perawat){
        this.perawat = perawat;
    }

    public Pendaftaran getPendaftaran() {
        return pendaftaran;
    }
    public void setPendaftaran(Pendaftaran pendaftaran){
        this.pendaftaran = pendaftaran;
    }
    public Boolean getStatusDaftar(){
        return statusDaftar;
    }
    public void setStatusDaftar(Boolean statusDaftar){
        this.statusDaftar =statusDaftar;
    }

    public Boolean getStatusSceening() {
        return statusSceening;
    }
    public void setStatusSceening(Boolean statusSceening){
        this.statusSceening = statusSceening;
    }

    public boolean getStatusScreening() {
        return statusSceening;
    }

    public void setPengunjung(Pengunjung pengunjung) {
        this.idPengunjung =idPengunjung;
    }

    public int getIdPemeriksaan() {
        return pemeriksa.getIdPemeriksa();

    }

    public void setStatusScreening(boolean b) {
        this.statusSceening =statusSceening;
    }



    }

