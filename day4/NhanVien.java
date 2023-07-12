package com.java.day4;

public class NhanVien extends LaoDong implements NghiepVu {
	
	private String truongPhongQuanLy = null;
	
	public NhanVien(String hoTen, String maSo, String soDienThoai, int soNgayLamViec) {
		super(hoTen, maSo, soDienThoai, soNgayLamViec);
		// TODO Auto-generated constructor stub
		super.setLuongMotNgay(100);
	}
	
	@Override
	public int tinhLuong() {
		// TODO Auto-generated method stub
		return this.getSoNgayLamViec() * this.getLuongMotNgay();
	}
	public String getTruongPhongQuanLy() {
		return truongPhongQuanLy;
	}
	public void setTruongPhongQuanLy(String truongPhongQuanLy) {
		this.truongPhongQuanLy = truongPhongQuanLy;
	}

}
