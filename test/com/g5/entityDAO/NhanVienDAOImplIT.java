/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g5.entityDAO;

import com.g5.entity.NhanVien;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anhba
 */
public class NhanVienDAOImplIT {

    public NhanVienDAOImplIT() {
    }

    /**
     * Test of getByIDNV method, of class NhanVienDAOImpl.
     */
    ////////////// passsssssssssssssssssss
    @Test
    public void testGetByIDNV() {

        Integer id = 1;
        NhanVienDAOImpl instance = new NhanVienDAOImpl();

        List<NhanVien> result = instance.getByIDNV(id);
        NhanVien nv = result.get(0);
        boolean check = false;
        NhanVien nv1 = instance.getByID(1);
        NhanVien nv2 = instance.getByID(1);
        if (nv.getMaNV() == nv1.getMaNV()
                && nv.getHoTen().equals(nv1.getHoTen())
                && nv.getDiachi().equals(nv1.getDiachi())
                && nv.getTrangthai() == nv1.getTrangthai()
                && nv.getEmail().equals(nv1.getEmail())
                && nv.getMatkhau().equals(nv1.getMatkhau())
                && nv.getNgaysinh().equals(nv1.getNgaysinh())
                && nv.getSDT().equals(nv1.getSDT())) {
            check = true;
        }
        System.out.println(nv1.getHoTen());
        System.out.println(nv2.getHoTen());
        assertTrue(check);
        
  //      assertEquals(nv1, nv1);
        //  assertEquals(kq1, kq2);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of deteleByID method, of class NhanVienDAOImpl.
     */
    @Test
    public void testDeteleByID() {
        // System.out.println("deteleByID");
        Integer id = 113;
        NhanVienDAOImpl instance = new NhanVienDAOImpl();
        instance.deteleByID(id);
        NhanVien nv = instance.getByID(id);

        assertNull(nv);
        // TODO review the generated test code and remove the default call to fail.
        //   fail("The test case is a prototype.");
    }

    /**
     * Test of selectByKeyword method, of class NhanVienDAOImpl.
     */
    @Test
    public void testSelectByName() {

        String keyword = "Nguyễn Thành Nhân";
        NhanVienDAOImpl instance = new NhanVienDAOImpl();
        boolean check = false;
        List<NhanVien> result = instance.selectByName(keyword);
        NhanVien nv = instance.getByID(3);
        if (nv.getMaNV() == result.get(0).getMaNV()
                && nv.getHoTen().equals(result.get(0).getHoTen())
                && nv.getDiachi().equals(result.get(0).getDiachi())
                && nv.getSDT().equals(result.get(0).getSDT())) {
            check = true;
        }
        assertTrue(check);
        //  assertEquals(check, result);
        // TODO review the generated test code and remove the default call to fail.
        //  fail("The test case is a prototype.");
    }

    /**
     * Test of getAll method, of class NhanVienDAOImpl.
     */
//    @Test
//    public void testGetAll() {
//
//        NhanVienDAOImpl instance = new NhanVienDAOImpl();
//        int kq = 5;
//        List<NhanVien> result = instance.getAll();
//        assertEquals(kq, 5);
//        // TODO review the generated test code and remove the default call to fail.
//        //   fail("The test case is a prototype.");
//    }
    /**
     * Test of create method, of class NhanVienDAOImpl.
     */
//    @Test
//    public void testCreate() {
//
//        NhanVien nhanVien = new NhanVien("12345", "Nhan vien test", 0, "nhanvientest@gmail.com", "0184843941", new Date(2004, 12, 2), true, null, "TP.HCM", true);
//        
//        NhanVienDAOImpl instance = new NhanVienDAOImpl();
//        
//        instance.create(nhanVien);
//        NhanVien nv = instance.getByID(1);
//   
//       List<NhanVien> list = instance.getAll();
//       int kq = 0;
//       if(list.size() >= 12){
//           kq = 1;
//       }
//        assertEquals(kq, 1);
//        // TODO review the generated test code and remove the default call to fail.
//        //     fail("The test case is a prototype.");
//    }
    /**
     * Test of update method, of class NhanVienDAOImpl.
     */
//    @Test
//    public void testUpdate() {
//
//        NhanVien nhanVien = new NhanVien("12345", "Nhan vien test", 0, "nhanvientest@gmail.com", "0184843941", null, true, null, "Bến tre", true);
//        nhanVien.setMaNV(19);
//        NhanVienDAOImpl instance = new NhanVienDAOImpl();
//       instance.update(nhanVien);
//        NhanVien result = instance.getByID(19);
//      //  NhanVien result2 = instance.getByID(5);
//        int kq  = 0;
//        if(nhanVien.getDiachi().equals(result.getDiachi())&&nhanVien.getHoTen().equalsIgnoreCase(result.getHoTen()) && nhanVien.getEmail().equals(result.getEmail())){
//            kq = 1;
//        }
//        assertEquals(kq, 1); // so sánh bằng 
//        // TODO review the generated test code and remove the default call to fail.
//        //  fail("The test case is a prototype.");
//    }
}
