package com.java.day4;

public abstract class LaoDong {
	private String maSo;
	private String hoTen;
	private String soDienThoai;
	private int soNgayLamViec;
	private int luongMotNgay;
	
	public LaoDong(String hoTen, String maSo, String soDienThoai, int soNgayLamViec) {
		// TODO Auto-generated constructor stub
		this.hoTen = hoTen;
		this.maSo = maSo;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
	}
	
	public abstract int tinhLuong();
	
	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public String getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) {
		this.maSo = maSo;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public int getSoNgayLamViec() {
		return soNgayLamViec;
	}

	public void setSoNgayLamViec(int soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}

	public int getLuongMotNgay() {
		return luongMotNgay;
	}

	public void setLuongMotNgay(int luongMotNgay) {
		this.luongMotNgay = luongMotNgay;
	}
	
	
	
}
