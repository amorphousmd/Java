package com.java.day4;

public class GiamDoc extends LaoDong implements NghiepVu{
	
	private double coPhan;
	
	public GiamDoc(String hoTen, String maSo, String soDienThoai, int soNgayLamViec, double coPhan) {
		super(hoTen, maSo, soDienThoai, soNgayLamViec);
		super.setLuongMotNgay(300);
		this.coPhan = coPhan;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int tinhLuong() {
		// TODO Auto-generated method stub
		return this.getSoNgayLamViec() * this.getLuongMotNgay();
		
	}
	public double getCoPhan() {
		return coPhan;
	}
	public void setCoPhan(double coPhan) {
		this.coPhan = coPhan;
	}
}
