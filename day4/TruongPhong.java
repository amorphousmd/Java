package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class TruongPhong extends LaoDong implements NghiepVu {
	
	List<NhanVien> listNhanVienQuanLy = new ArrayList<>();
	
	public TruongPhong(String hoTen, String maSo, String soDienThoai, int soNgayLamViec) {
		super(hoTen, maSo, soDienThoai, soNgayLamViec);
		super.setLuongMotNgay(200);
		// TODO Auto-generated constructor stub
	}
	public void setNhanVienQuanLy(NhanVien nhanVien) {
		if (!this.listNhanVienQuanLy.contains(nhanVien)) {
			listNhanVienQuanLy.add(nhanVien);
		}
	}
	
	@Override
	public int tinhLuong() {
		// TODO Auto-generated method stub
		return this.getSoNgayLamViec() * this.getLuongMotNgay() + this.listNhanVienQuanLy.size() * 100;
		
	}
	public int getLuongNVQuanLy() {
		return listNhanVienQuanLy.size();
	}
}
