/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g5.entity;
/**
 *
 * @author Asus
 */
public class HoaDonChiTiet {

    int MaHDCT;
    int MaHD;
    int MaSP;
    int Soluong;
    float Gia;
    String Size;
    float PTkhuyenmai;

    public int getMaHDCT() {
        return MaHDCT;
    }

    public void setMaHDCT(int MaHDCT) {
        this.MaHDCT = MaHDCT;
    }

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int MaSP, int Soluong, float Gia, String Size, float PTkhuyenmai) {
        this.MaSP = MaSP;

        this.Soluong = Soluong;
        this.Gia = Gia;
        this.Size = Size;
        this.PTkhuyenmai = PTkhuyenmai;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public float getGia() {
        return Gia;
    }

    public void setGia(float Gia) {
        this.Gia = Gia;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public float getPTkhuyenmai() {
        return PTkhuyenmai;
    }

    public void setPTkhuyenmai(float PTkhuyenmai) {
        this.PTkhuyenmai = PTkhuyenmai;
    }

}
