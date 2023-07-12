package com.java.day4;

public class TruongPhong extends LaoDong implements NghiepVu {
	
	private int luongNVQuanLy = 0;
	
	public TruongPhong(String hoTen, String maSo, String soDienThoai, int soNgayLamViec) {
		super(hoTen, maSo, soDienThoai, soNgayLamViec);
		super.setLuongMotNgay(200);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int tinhLuong() {
		// TODO Auto-generated method stub
		return this.getSoNgayLamViec() * this.getLuongMotNgay() + this.luongNVQuanLy * 100;
		
	}
	public int getLuongNVQuanLy() {
		return luongNVQuanLy;
	}
	public void setLuongNVQuanLy(int luongNVQuanLy) {
		this.luongNVQuanLy = luongNVQuanLy;
	}

}
