/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.g5.entityDAO;

import com.g5.entity.HoaDon;
import com.g5.entity.HoaDonChiTiet;
import com.g5.util.JDBCHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Asus
 */
public class HoaDonChiTietDAO {

    String selectByID = "select * from HoaDonChiTiet where MaHD = ?";
    String selectALL = "select * from HoaDonChiTiet";
    String insert = "insert into HoaDonChiTiet (MaHD, MaSP, SoLuong, Gia, Size, PTKhuyenMai) "
            + "values (?,?,?,?,?,?)";
    String update = "Update HoaDonChiTiet set SoLuong=?, Gia=?, Size=?, PTKhuyenMai=? where MaSP = ? and MaHD =?  ";
    String updateSoLuong = "Update HoaDonChiTiet set SoLuong=? where mahdct = ?  ";
    String update2 = "Update HoaDonChiTiet set  Size=? where MaHD =? and mahdct = ?";
    String update3 = "Update HoaDonChiTiet set SoLuong=? where MaSP = ? and MaHD =? ";
    String selectByIDHD = "select * from HoaDonChiTiet where MaSP = ? and MaHD = ?";
    String delete = "Delete from HoaDonChiTiet where MaSP= ? and MaHD= ? and size = ?";
    String deleteHDCT = "Delete from HoaDonChiTiet where mahdct = ?";
    String delete2 = "Delete from HoaDonChiTiet where MaSP= ? and mahd = ?";
    String spTrung = "SELECT CASE WHEN COUNT(*) > 0 THEN 1 ELSE 0 END AS TimThay FROM HoaDonChiTiet hdct join hoadon hd on hdct.mahd = hd.mahd WHERE hdct.mahd = ? and hdct.MaSP = ? AND hdct.Size = ? and hd.trangthai = 'false'";

    String xnThem = "SELECT * FROM hoadonchitiet WHERE masp NOT IN (?) and mahd = ?";

    public List<HoaDonChiTiet> getHDCTkhongco(int masp, int mahd) {
        return select(xnThem, masp, mahd);
    }

    public int getSPbiTrungKhacSize(int mahd, int masp, String size) {
        ResultSet rs = null;
        try {
            rs = JDBCHelper.executeQuery(spTrung, mahd, masp, size.trim());
            rs.next();
            return rs.getInt("TimThay");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int getSPbiTrung(int mahd, int masp, String size) {
        ResultSet rs = null;
        try {
            rs = JDBCHelper.executeQuery(spTrung, mahd, masp, size.trim());
            rs.next();
            return rs.getInt("TimThay");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<HoaDonChiTiet> getByID(int MaHD) {
        return select(selectByID, MaHD);

    }

    public HoaDonChiTiet getByIDHD(Integer id) {
        List<HoaDonChiTiet> list = select(selectByID, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    public HoaDonChiTiet getByIDSP(Integer id, int mahd) {
        List<HoaDonChiTiet> list = select(selectByIDHD, id, mahd);
        return list.size() > 0 ? list.get(0) : null;
    }

    public Integer create(HoaDonChiTiet hd) {

        try {
            JDBCHelper.executeUpdate(insert,
                    hd.getMaHD(),
                    hd.getMaSP(),
                    hd.getSoluong(),
                    hd.getGia(),
                    hd.getSize(),
                    hd.getPTkhuyenmai()
            );
            return hd.getMaHDCT();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void updateSoLuong(int sl ,int mahdct) {

        try {
            JDBCHelper.executeUpdate(updateSoLuong,
                    sl,
                    mahdct
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(HoaDonChiTiet hd) {

        try {
            JDBCHelper.executeUpdate(update,
                    hd.getMaHD(),
                    hd.getMaSP(),
                    hd.getSoluong(),
                    hd.getGia(),
                    hd.getSize(),
                    hd.getPTkhuyenmai(),
                    hd.getMaSP()
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deteleByID(Integer masp, int mahd, String size) {
        JDBCHelper.executeUpdate(delete, masp, mahd, size);
    }
    String selectSoluongSP = "select soluong from hoadonchitiet where masp = ? and size = ? and mahd = ?";

    public int getSL(int masp, String size, int mahd) {
        ResultSet rs = null;
        try {
            rs = JDBCHelper.executeQuery(selectSoluongSP, masp, size.trim(), mahd);
            rs.next();
            return rs.getInt("soluong");
        } catch (Exception e) {
            //    e.printStackTrace();
        }
        return 0;
    }

    public void update3(HoaDonChiTiet hd, int mahd, int mahdct) {

        try {
            JDBCHelper.executeUpdate(deleteHDCT,
                    mahdct
            );
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int sl = 0;
            sl = getSL(hd.getMaSP(), hd.getSize(), mahd) + hd.getSoluong();
            JDBCHelper.executeUpdate(update3,
                    sl,
                    hd.getMaSP(),
                    mahd
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update2(String  size, int mahd, int mahdct) {

        try {
            JDBCHelper.executeUpdate(update2,
                    size,
                    mahd,
                    mahdct
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deteleByID2(int mahd) {
        JDBCHelper.executeUpdate(delete, mahd);
    }

    public List<HoaDonChiTiet> getALL() {
        return select(selectALL);
    }

    private List<HoaDonChiTiet> select(String sql, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JDBCHelper.executeQuery(sql, args);
                while (rs.next()) {
                    HoaDonChiTiet model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                //   rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

    private HoaDonChiTiet readFromResultSet(ResultSet rs) throws SQLException {
        HoaDonChiTiet model = new HoaDonChiTiet();
        model.setMaHDCT(rs.getInt("MaHDCT"));
        model.setMaHD(rs.getInt("MaHD"));
        model.setMaSP(rs.getInt("MaSP"));
        model.setSoluong(rs.getInt("SoLuong"));
        model.setGia(rs.getFloat("Gia"));
        model.setSize(rs.getString("Size"));
        model.setPTkhuyenmai(rs.getFloat("PTKhuyenMai"));
        return model;
    }
}
