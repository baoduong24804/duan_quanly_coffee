/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g5.entity;

import java.util.Date;

/**
 *
 * @author Asus
 */
public class KhuyenMai {
    private int maKM;
    private Date TGBatDau;
    private Date TGKetThuc;
    private String TenKM;
    private float PhanTramKM;
    private int MaNV;

    public KhuyenMai() {
    }

    public KhuyenMai(Date TGBatDau, Date TGKetThuc, String TenKM, float PhanTramKM, int MaNV) {
        this.TGBatDau = TGBatDau;
        this.TGKetThuc = TGKetThuc;
        this.TenKM = TenKM;
        this.PhanTramKM = PhanTramKM;
        this.MaNV = MaNV;
    }

    public int getMaKM() {
        return maKM;
    }

    public void setMaKM(int maKM) {
        this.maKM = maKM;
    }

    public Date getTGBatDau() {
        return TGBatDau;
    }

    public void setTGBatDau(Date TGBatDau) {
        this.TGBatDau = TGBatDau;
    }

    public Date getTGKetThuc() {
        return TGKetThuc;
    }

    public void setTGKetThuc(Date TGKetThuc) {
        this.TGKetThuc = TGKetThuc;
    }

    public String getTenKM() {
        return TenKM;
    }

    public void setTenKM(String TenKM) {
        this.TenKM = TenKM;
    }

    public float getPhanTramKM() {
        return PhanTramKM;
    }

    public void setPhanTramKM(float PhanTramKM) {
        this.PhanTramKM = PhanTramKM;
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int MaNV) {
        this.MaNV = MaNV;
    }

    

    
    
}
