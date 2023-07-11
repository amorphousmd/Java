package com.java.day4;

public class NhanVien extends LaoDong implements NghiepVu {
	
	private String truongPhongQuanLy;
	
	public NhanVien(String hoTen, String maSo, String soDienThoai, int soNgayLamViec) {
		super(hoTen, maSo, soDienThoai, soNgayLamViec);
		// TODO Auto-generated constructor stub
		super.setLuongMotNgay(100);
	}
	
	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		
	}
	public String getTruongPhongQuanLy() {
		return truongPhongQuanLy;
	}
	public void setTruongPhongQuanLy(String truongPhongQuanLy) {
		this.truongPhongQuanLy = truongPhongQuanLy;
	}

}
