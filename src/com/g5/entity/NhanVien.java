/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g5.entity;

import com.g5.util.XDate;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class NhanVien {

    private int maNV;
    private String matkhau;
    private String hoTen;
    private Integer vaitro;
    private String Email;
    private String SDT;
    private Date ngaysinh;
    private boolean gioitinh;
    private String Hinh;
    private String diachi;
    private boolean trangthai;

    public NhanVien(String matkhau, String hoTen, Integer vaitro, String Email, String SDT, Date ngaysinh, boolean gioitinh, String Hinh, String diachi, boolean trangthai) {
        this.matkhau = matkhau;
        this.hoTen = hoTen;
        this.vaitro = vaitro;
        this.Email = Email;
        this.SDT = SDT;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.Hinh = Hinh;
        this.diachi = diachi;
        this.trangthai = trangthai;
    }

    public NhanVien() {
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Integer getVaitro() {
        return vaitro;
    }

    public void setVaitro(Integer vaitro) {
        this.vaitro = vaitro;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getHinh() {
        return Hinh;
    }

    public void setHinh(String Hinh) {
        this.Hinh = Hinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public boolean getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }
    
    
    
}
