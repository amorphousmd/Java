package com.java.day4;

public class TruongPhong extends LaoDong implements NghiepVu {
	
	private int luongNVQuanLy;
	
	public TruongPhong(String hoTen, String maSo, String soDienThoai, int soNgayLamViec) {
		super(hoTen, maSo, soDienThoai, soNgayLamViec);
		super.setLuongMotNgay(200);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void tinhLuong() {
		// TODO Auto-generated method stub
		
	}
	public int getLuongNVQuanLy() {
		return luongNVQuanLy;
	}
	public void setLuongNVQuanLy(int luongNVQuanLy) {
		this.luongNVQuanLy = luongNVQuanLy;
	}

}
