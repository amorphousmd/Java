package com.java.day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class OOPApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CongTy congTy = new CongTy();
		List<LaoDong> listLaoDong = new ArrayList<>();
		congTy.getDoanhThuThang();
		option3(listLaoDong, scanner);
		option3(listLaoDong, scanner);
		option3(listLaoDong, scanner);
		for (LaoDong laoDong: listLaoDong) {
			String maSo = laoDong.getMaSo();
			String hoTen = laoDong.getHoTen();
			System.out.print("Ho Ten: " + hoTen + " ");
			System.out.println("Ma So: " + maSo);
		}
		scanner.close();
	}
	
	public static void option1(CongTy congTy, Scanner scanner) {
		System.out.print("Nhap ten cong ty: ");
		String tenCongTy = scanner.nextLine();
		System.out.print("Nhap ma so cong ty: ");
		String maSoThue = scanner.nextLine();
		System.out.print("Nhap doanh thu thang cong ty: ");
		int doanhThuThang = scanner.nextInt();
		scanner.nextLine();
		congTy.setTenCongTy(tenCongTy);
		congTy.setMaSoThue(maSoThue);
		congTy.setDoanhThuThang(doanhThuThang);
	}
	
	public static void option2() {
		
	}
	
	public static void option3(List<LaoDong> listLaoDong, Scanner scanner) {
		System.out.println("Chon 1 muc:");
		System.out.println("1: Them nhan vien");
		System.out.println("2: Xoa nhan vien");
		int option = scanner.nextInt();
		scanner.nextLine();
		if (option == 1) {
			option3Them(listLaoDong, scanner);
		}
		else if (option == 2) {
			option3Xoa(listLaoDong, scanner);
		}
		else {
			System.out.println("Lua chon khong hop le!");
		}
	}
	
	public static void option3Them(List<LaoDong> listLaoDong, Scanner scanner) {
		System.out.println("Chon 1 muc:");
		System.out.println("1: Nhan vien");
		System.out.println("2: Truong Phong");
		System.out.println("3: Giam doc");
		int option = scanner.nextInt();
		scanner.nextLine();
		if (option == 1) {
			System.out.println("Them nhan vien ->");
			System.out.print("Nhap ho ten: ");
			String hoTen = scanner.nextLine();
			System.out.print("Nhap ma so: ");
			String maSo = scanner.nextLine();
			System.out.print("Nhap so dien thoai: ");
			String soDienThoai = scanner.nextLine();
			System.out.print("Nhap so ngay lam viec: ");
			int soNgayLamViec = scanner.nextInt();
			scanner.nextLine();
			NhanVien nhanVien = new NhanVien(hoTen, maSo, soDienThoai, soNgayLamViec);
			listLaoDong.add(nhanVien);
			System.out.println("Chon phuong 2 de gan truong phong cho nhan vien nay");
		}
		else if (option == 2) {
			System.out.println("Them truong phong ->");
			System.out.print("Nhap ho ten: ");
			String hoTen = scanner.nextLine();
			System.out.print("Nhap ma so: ");
			String maSo = scanner.nextLine();
			System.out.print("Nhap so dien thoai: ");
			String soDienThoai = scanner.nextLine();
			System.out.print("Nhap so ngay lam viec: ");
			int soNgayLamViec = scanner.nextInt();
			scanner.nextLine();
			TruongPhong truongPhong = new TruongPhong(hoTen, maSo, soDienThoai, soNgayLamViec);
			listLaoDong.add(truongPhong);
			System.out.println("Chon phuong 2 de gan nhan vien cho nhan vien nay");
		}
		else if (option == 3) {
			System.out.println("Them giam doc ->");
			System.out.print("Nhap ho ten: ");
			String hoTen = scanner.nextLine();
			System.out.print("Nhap ma so: ");
			String maSo = scanner.nextLine();
			System.out.print("Nhap so dien thoai: ");
			String soDienThoai = scanner.nextLine();
			System.out.print("Nhap so ngay lam viec: ");
			int soNgayLamViec = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Nhap co phan: ");
			double coPhan = scanner.nextDouble();
			scanner.nextLine();
			GiamDoc giamDoc = new GiamDoc(hoTen, maSo, soDienThoai, soNgayLamViec, coPhan);
			listLaoDong.add(giamDoc);
		}
		else {
			System.out.println("Lua chon khong hop le!");
		}
	}
	
	public static void option3Xoa(List<LaoDong> listLaoDong, Scanner scanner) {
		boolean notDeleted = true;
		System.out.println("Danh sach cac nhan vien cua cong ty: ");
		for (LaoDong laoDong: listLaoDong) {
			String maSo = laoDong.getMaSo();
			String hoTen = laoDong.getHoTen();
			System.out.print("Ho Ten: " + hoTen + " ");
			System.out.println("Ma So: " + maSo);
		}
		System.out.print("Nhap ma so nhan vien muon xoa: ");
		String maSoInput = scanner.nextLine();
		Iterator<LaoDong> iterator = listLaoDong.iterator();
		while (iterator.hasNext()) {
		    LaoDong laoDong = iterator.next();
		    String maSo = laoDong.getMaSo();
		    if (maSo.equals(maSoInput)) {
		        iterator.remove();  // Safely remove the element using iterator
		        notDeleted = false;
		    }
		}
		if (notDeleted) {
			System.out.println("Khong co nhan vien nao co ma so nhu vay");
		}
	}
	
	public static void option4(List<LaoDong> listLaoDong) {
		for (LaoDong laoDong: listLaoDong) {
			String hoTen = laoDong.getHoTen();
			String maSo = laoDong.getMaSo();
			String soDienThoai = laoDong.getSoDienThoai();
			int soNgayLamViec = laoDong.getSoNgayLamViec();
			System.out.print("Ho Ten: " + hoTen + " ");
			System.out.print("Ma So: " + maSo + " ");
			System.out.print("So Dien Thoai: " + soDienThoai + " ");
			System.out.println("Ma So: " + soNgayLamViec + " ");
		}
	}
}
