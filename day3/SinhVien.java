package com.java.day3;

import java.util.Scanner;

public class SinhVien {
	private String hoten;
	private String chuyenNganh;
	private double diemGiuaKy;
	private double diemCuoiKy;
	private double diemTrungBinh;
	private double diemHanhKiem = 50;
	
	public SinhVien() {
		// TODO Auto-generated constructor stub
	}
	
	public SinhVien(String hoten, String chuyenNganh, double diemGiuaKy, double diemCuoiKy) {
		// TODO Auto-generated constructor stub
		this.hoten = hoten;
		this.chuyenNganh = chuyenNganh;
		this.diemGiuaKy = diemGiuaKy;
		this.diemCuoiKy = diemCuoiKy;
	}
	
	public void khoiTao() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		this.hoten = scanner.nextLine();
		System.out.print("Nhap chuyen nganh: ");
		this.chuyenNganh = scanner.nextLine();
		System.out.print("Nhap diem giua ky: ");
		this.diemGiuaKy = scanner.nextDouble();
		scanner.nextLine();
		System.out.print("Nhap diem cuoi ky: ");
		this.diemGiuaKy = scanner.nextDouble();
		scanner.nextLine();
		scanner.close();
	}
	
	public void xuatThongTin() {
		System.out.println("Ho ten: " + this.hoten);
		System.out.println("Chuyen nganh: " + this.chuyenNganh);
		System.out.println("Diem giua ky: " + this.diemGiuaKy);
		System.out.println("Diem cuoi ky: " + this.diemCuoiKy);
		System.out.println("Diem trung binh: " + tinhDiemTrungBinh());
		System.out.println("Diem hanh kiem: " + this.diemHanhKiem);
		System.out.println("Hanh kiem : " + tinhHanhKiem());
	}
	
	public double tinhDiemTrungBinh() {
		return this.diemGiuaKy * 0.3 + this.diemCuoiKy * 0.7;
	}
	
	// Đánh nhau trừ 10 hạnh kiểm, học được thêm 5 hạnh kiểm, xét hạnh kiểm bằng điểm này
	public void danhNhau() {
		this.diemHanhKiem -= 10;
	}
	
	public void hocHanh() {
		this.diemHanhKiem += 5;
	}
	
	public String tinhHanhKiem() {
		if (this.diemHanhKiem >= 60) {
			return "Giỏi";
		}
		else {
			return "Yếu";
		}
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public double getDiemGiuaKy() {
		return diemGiuaKy;
	}

	public void setDiemGiuaKy(double diemGiuaKy) {
		this.diemGiuaKy = diemGiuaKy;
	}

	public double getDiemCuoiKy() {
		return diemCuoiKy;
	}

	public void setDiemCuoiKy(double diemCuoiKy) {
		this.diemCuoiKy = diemCuoiKy;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public double getDiemHanhKiem() {
		return diemHanhKiem;
	}

	public void setDiemHanhKiem(double diemHanhKiem) {
		this.diemHanhKiem = diemHanhKiem;
	}
	
	
}
