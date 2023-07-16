package com.java.day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class OOPApplication {
	public static void main(String[] args) {
        System.out.println("1. Nhập thông tin công ty");
        System.out.println("2. Phân bổ Nhân viên vào Trưởng phòng");
        System.out.println("3. Thêm, xóa thông tin một nhân sự");
        System.out.println("4. Xuất ra thông tin toàn bộ người trong công ty");
        System.out.println("5. Tính và xuất tổng lương cho toàn công ty");
        System.out.println("6. Tìm Nhân viên thường có lương cao nhất");
        System.out.println("7. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất");
        System.out.println("8. Sắp xếp nhân viên toàn công ty theo thứ tự abc");
        System.out.println("9. Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần");
        System.out.println("10. Tìm Giám Đốc có số lượng cổ phần nhiều nhất");
        System.out.println("11. Tính và Xuất tổng THU NHẬP của từng Giám Đốc");
		Scanner scanner = new Scanner(System.in);
		CongTy congTy = new CongTy();
		DataCenter dataCenter = new DataCenter();
		int choice;
		while (true) {
			System.out.println("------------------------------------------------------------------");
            System.out.print("Lua chon (1-11): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            switch (choice) {
            case 1:
                option1(congTy, scanner);
                break;
            case 2:
                option2(dataCenter, scanner);
                break;
            case 3:
                option3(dataCenter, scanner);
                break;
            case 4:
                option4(dataCenter);
                break;
            case 5:
                option5(dataCenter);
                break;
            case 6:
                option6(dataCenter);
                break;
            case 7:
                option7(dataCenter);
                break;
            case 8:
                option8(dataCenter);
                break;
            case 9:
                option9(dataCenter);
                break;
            case 10:
                option10(dataCenter);
                break;
            case 11:
                option11(dataCenter, congTy);
                break;
            case 12:
                System.out.println("Ket thuc chuong trinh");
                scanner.close();
                return;
            default:
                System.out.println("Invalid option!");
            }
        }
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
	
	public static void option2(DataCenter dataCenter, Scanner scanner) {
		System.out.println("------------------------------------------------------------------");
		// Nhan Vien
		System.out.println("Cac Nhan Vien Cua Cong Ty: ");
		for (NhanVien nhanVien: dataCenter.getListNhanVien()) {
			String hoTen = nhanVien.getHoTen();
			String maSo = nhanVien.getMaSo();
			String soDienThoai = nhanVien.getSoDienThoai();
			int soNgayLamViec = nhanVien.getSoNgayLamViec();
			String truongPhongQuanLy = nhanVien.getTruongPhongQuanLy();
			System.out.print("Ho Ten: " + hoTen + " ");
			System.out.print("Ma So: " + maSo + " ");
			System.out.print("So Dien Thoai: " + soDienThoai + " ");
			System.out.print("So ngay lam viec: " + soNgayLamViec + " ");
			System.out.println("Truong phong quan ly: " + truongPhongQuanLy + " ");
		}
		System.out.println("");
		
		// Truong Phong
		System.out.println("Cac Truong Phong Cua Cong Ty: ");
		for (TruongPhong truongPhong: dataCenter.getListTruongPhong()) {
			String hoTen = truongPhong.getHoTen();
			String maSo = truongPhong.getMaSo();
			String soDienThoai = truongPhong.getSoDienThoai();
			int soNgayLamViec = truongPhong.getSoNgayLamViec();
			int luongNVQuanLy = truongPhong.getLuongNVQuanLy();
			System.out.print("Ho Ten: " + hoTen + " ");
			System.out.print("Ma So: " + maSo + " ");
			System.out.print("So Dien Thoai: " + soDienThoai + " ");
			System.out.print("So ngay lam viec: " + soNgayLamViec + " ");
			System.out.println("So nhan vien quan ly: " + luongNVQuanLy + " ");
		}
		System.out.println("");
		System.out.println("------------------------------------------------------------------");
		
		// Xu Ly Logic
		boolean notFoundNV = true;
		System.out.print("Nhap ma so nhan vien muon them: ");
		String maSoInputNV = scanner.nextLine();
		Iterator<NhanVien> iteratorNV = dataCenter.getListNhanVien().iterator();
		while (iteratorNV.hasNext()) {
		    NhanVien nhanVien = iteratorNV.next();
		    String maSoNV = nhanVien.getMaSo();
		    if (maSoNV.equals(maSoInputNV)) {
		    	notFoundNV = false;
		    	// Them Truong Phong
		    	boolean notFoundTP = true;
		        System.out.print("Nhap ma so truong phong muon gan: ");
				String maSoInputTP = scanner.nextLine();
				Iterator<TruongPhong> iteratorTP = dataCenter.getListTruongPhong().iterator();
		        while (iteratorTP.hasNext()) {
		        	TruongPhong truongPhong = iteratorTP.next();
				    String maSoTP = truongPhong.getMaSo();
				    if (maSoTP.equals(maSoInputTP)) {
				    	nhanVien.setTruongPhongQuanLy(truongPhong.getHoTen());
				    	truongPhong.setNhanVienQuanLy(nhanVien);
				    	return;
				    }
		        }
		        if (notFoundTP) {
					System.out.println("Khong co truong phong nao co ma so nhu vay");
					return;
				}
		    }
		}
		if (notFoundNV) {
			System.out.println("Khong co nhan vien nao co ma so nhu vay");
		}
	}
	
	public static void option3(DataCenter dataCenter, Scanner scanner) {
		System.out.println("Chon 1 muc:");
		System.out.println("1: Them nhan vien");
		System.out.println("2: Xoa nhan vien");
		int option = scanner.nextInt();
		scanner.nextLine();
		if (option == 1) {
			option3Them(dataCenter, scanner);
		}
		else if (option == 2) {
			option3Xoa(dataCenter, scanner);
		}
		else {
			System.out.println("Lua chon khong hop le!");
		}
	}
	
	public static void option3Them(DataCenter dataCenter, Scanner scanner) {
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
			dataCenter.getListLaoDong().add(nhanVien);
			dataCenter.getListNhanVien().add(nhanVien);
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
			dataCenter.getListLaoDong().add(truongPhong);
			dataCenter.getListTruongPhong().add(truongPhong);
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
			if (coPhan > 100) {
				System.out.println("Co phan khong the lon hon 100");
				return;
			}
			GiamDoc giamDoc = new GiamDoc(hoTen, maSo, soDienThoai, soNgayLamViec, coPhan);
			dataCenter.getListLaoDong().add(giamDoc);
			dataCenter.getListGiamDoc().add(giamDoc);
		}
		else {
			System.out.println("Lua chon khong hop le!");
		}
	}
	
	public static void option3Xoa(DataCenter dataCenter, Scanner scanner) {
		boolean notDeleted = true;
		option4(dataCenter);
		System.out.print("Nhap ma so nhan vien muon xoa: ");
		String maSoInput = scanner.nextLine();
		Iterator<LaoDong> iterator = dataCenter.getListLaoDong().iterator();
		while (iterator.hasNext()) {
		    LaoDong laoDong = iterator.next();
		    String maSo = laoDong.getMaSo();
		    if (maSo.equals(maSoInput)) {
		        iterator.remove();  // Xoa nhan vien
		        if (laoDong instanceof NhanVien) {
		            dataCenter.getListNhanVien().remove(laoDong);
		        } else if (laoDong instanceof TruongPhong) {
		            dataCenter.getListTruongPhong().remove(laoDong);
		        } else if (laoDong instanceof GiamDoc) {
		            dataCenter.getListGiamDoc().remove(laoDong);
		        }
		        notDeleted = false;
		    }
		}
		if (notDeleted) {
			System.out.println("Khong co nhan vien nao co ma so nhu vay");
		}
		else {
			System.out.println("Da xoa nhan vien co ma so: " + maSoInput);
		}
	}
	
	public static void option4(DataCenter dataCenter) {
		System.out.println("------------------------------------------------------------------");
		// Nhan Vien
		System.out.println("Cac Nhan Vien Cua Cong Ty: ");
		for (NhanVien nhanVien: dataCenter.getListNhanVien()) {
			String hoTen = nhanVien.getHoTen();
			String maSo = nhanVien.getMaSo();
			String soDienThoai = nhanVien.getSoDienThoai();
			int soNgayLamViec = nhanVien.getSoNgayLamViec();
			String truongPhongQuanLy = nhanVien.getTruongPhongQuanLy();
			System.out.print("Ho Ten: " + hoTen + " ");
			System.out.print("Ma So: " + maSo + " ");
			System.out.print("So Dien Thoai: " + soDienThoai + " ");
			System.out.print("So ngay lam viec: " + soNgayLamViec + " ");
			System.out.println("Truong phong quan ly: " + truongPhongQuanLy + " ");
		}
		System.out.println("");
		
		// Truong Phong
		System.out.println("Cac Truong Phong Cua Cong Ty: ");
		for (TruongPhong truongPhong: dataCenter.getListTruongPhong()) {
			String hoTen = truongPhong.getHoTen();
			String maSo = truongPhong.getMaSo();
			String soDienThoai = truongPhong.getSoDienThoai();
			int soNgayLamViec = truongPhong.getSoNgayLamViec();
			int luongNVQuanLy = truongPhong.getLuongNVQuanLy();
			System.out.print("Ho Ten: " + hoTen + " ");
			System.out.print("Ma So: " + maSo + " ");
			System.out.print("So Dien Thoai: " + soDienThoai + " ");
			System.out.print("So ngay lam viec: " + soNgayLamViec + " ");
			System.out.println("So nhan vien quan ly: " + luongNVQuanLy + " ");
		}
		System.out.println("");
		
		// Giam Doc
		System.out.println("Cac Giam Doc Cua Cong Ty");
		for (GiamDoc giamDoc: dataCenter.getListGiamDoc()) {
			String hoTen = giamDoc.getHoTen();
			String maSo = giamDoc.getMaSo();
			String soDienThoai = giamDoc.getSoDienThoai();
			int soNgayLamViec = giamDoc.getSoNgayLamViec();
			double coPhan = giamDoc.getCoPhan();
			System.out.print("Ho Ten: " + hoTen + " ");
			System.out.print("Ma So: " + maSo + " ");
			System.out.print("So Dien Thoai: " + soDienThoai + " ");
			System.out.print("So ngay lam viec: " + soNgayLamViec + " ");
			System.out.println("Co phan: " + coPhan + " ");
		}
		System.out.println("");
		System.out.println("------------------------------------------------------------------");
	}
	public static void option5(DataCenter dataCenter) {
		int tongLuongCongTy = 0;
		for (int i = 0; i < dataCenter.getListLaoDong().size(); i++) {
			tongLuongCongTy += dataCenter.getListLaoDong().get(i).tinhLuong();
		}
		System.out.println("Tong Luong Cong Ty: " + tongLuongCongTy);
	}
	
	public static void option6(DataCenter dataCenter) {
		LaoDong nhanVienMaxLuong = dataCenter.getListNhanVien().get(0);
		for (int i = 0; i < dataCenter.getListNhanVien().size(); i++) {
			if (nhanVienMaxLuong.tinhLuong() < dataCenter.getListNhanVien().get(i).tinhLuong()) {
				nhanVienMaxLuong = dataCenter.getListNhanVien().get(i);
			}
		}
		System.out.println("Nhan vien luong cao nhat cong ty: ");
		System.out.print("Ho Ten: " + nhanVienMaxLuong.getHoTen() + " ");
		System.out.print("Ma So: " + nhanVienMaxLuong.getMaSo() + " ");
		System.out.print("So Dien Thoai: " + nhanVienMaxLuong.getSoDienThoai() + " ");
		System.out.print("So ngay lam viec: " + nhanVienMaxLuong.getSoNgayLamViec() + " ");
		System.out.print("Luong nhan vien: " + nhanVienMaxLuong.tinhLuong() + " ");
	}
	
	public static void option7(DataCenter dataCenter) {
		TruongPhong truongPhongMaxNV = dataCenter.getListTruongPhong().get(0);
		for (int i = 0; i < dataCenter.getListTruongPhong().size(); i++) {
			if (truongPhongMaxNV.getLuongNVQuanLy() < dataCenter.getListTruongPhong().get(i).getLuongNVQuanLy()) {
				truongPhongMaxNV = dataCenter.getListTruongPhong().get(i);
			}
		}
		System.out.println("Truong Phong Quan Ly Nhieu Nhan Vien Nhat: ");
		System.out.print("Ho Ten: " + truongPhongMaxNV.getHoTen() + " ");
		System.out.print("Ma So: " + truongPhongMaxNV.getMaSo() + " ");
		System.out.print("So Dien Thoai: " + truongPhongMaxNV.getSoDienThoai() + " ");
		System.out.print("So ngay lam viec: " + truongPhongMaxNV.getSoNgayLamViec() + " ");
		System.out.println("So luong nhan vien quan ly: " + truongPhongMaxNV.getLuongNVQuanLy() + " ");
	}
	
	public static void option8(DataCenter dataCenter) {
		List<LaoDong> listLaoDongSorterd = option8Sort((ArrayList<LaoDong>)dataCenter.getListLaoDong());
		for (int i = 0; i < listLaoDongSorterd.size(); i++) {
			LaoDong laoDong = listLaoDongSorterd.get(i);
			System.out.print("Ho Ten: " + laoDong.getHoTen() + " ");
			System.out.print("Ma So: " + laoDong.getMaSo() + " ");
			System.out.print("So Dien Thoai: " + laoDong.getSoDienThoai() + " ");
			System.out.println("So ngay lam viec: " + laoDong.getSoNgayLamViec() + " ");
		}
	}
	
	public static ArrayList<LaoDong> option8Sort(ArrayList<LaoDong> list) {
        ArrayList<LaoDong> sortedList = new ArrayList<>(list);

        // Overwrite the compare function for object sort
        Collections.sort(sortedList, new Comparator<LaoDong>() {
            @Override
            public int compare(LaoDong obj1, LaoDong obj2) {
                return obj1.getHoTen().compareTo(obj2.getHoTen());
            }
        });
        return sortedList;
    }
	
	public static void option9(DataCenter dataCenter) {
		List<LaoDong> listLaoDongSorterd = option9Sort((ArrayList<LaoDong>)dataCenter.getListLaoDong());
		
		for (int i = 0; i < listLaoDongSorterd.size(); i++) {
			LaoDong laoDong = listLaoDongSorterd.get(i);
			System.out.print("Ho Ten: " + laoDong.getHoTen() + " ");
			System.out.print("Ma So: " + laoDong.getMaSo() + " ");
			System.out.print("So Dien Thoai: " + laoDong.getSoDienThoai() + " ");
			System.out.print("So ngay lam viec: " + laoDong.getSoNgayLamViec() + " ");
			System.out.println("Luong: " + laoDong.tinhLuong() + " ");
		}
	}
	
	public static ArrayList<LaoDong> option9Sort(ArrayList<LaoDong> list) {
        ArrayList<LaoDong> sortedList = new ArrayList<>(list);
        
        // Overwrite the compare function for object sort
        Collections.sort(sortedList, new Comparator<LaoDong>() {
            @Override
            public int compare(LaoDong obj1, LaoDong obj2) {
                int luong1 = obj1.tinhLuong();
                int luong2 = obj2.tinhLuong();

                if (luong1 < luong2) {
                    return -1;
                } else if (luong1 > luong2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        Collections.reverse(sortedList);
        return sortedList;
    }
	
	public static void option10(DataCenter dataCenter) {
		GiamDoc giamDocMax = dataCenter.getListGiamDoc().get(0);
		
		for (int i = 0; i < dataCenter.getListGiamDoc().size(); i++) {
			if (giamDocMax.getCoPhan() < dataCenter.getListGiamDoc().get(i).getCoPhan()) {
				giamDocMax = dataCenter.getListGiamDoc().get(i);
			}
		}
		
		System.out.println("Giam Doc Nhieu Co Phan Nhat: ");
		System.out.print("Ho Ten: " + giamDocMax.getHoTen() + " ");
		System.out.print("Ma So: " + giamDocMax.getMaSo() + " ");
		System.out.print("So Dien Thoai: " + giamDocMax.getSoDienThoai() + " ");
		System.out.print("So ngay lam viec: " + giamDocMax.getSoNgayLamViec() + " ");
		System.out.println("Co phan: " + giamDocMax.getCoPhan());
	}
	
	public static void option11(DataCenter dataCenter, CongTy congTy) {
		int tongLuongCongTy = 0;
		for (int i = 0; i < dataCenter.getListLaoDong().size(); i++) {
			tongLuongCongTy += dataCenter.getListLaoDong().get(i).tinhLuong();
		}
		int loiNhuanCongTy = congTy.getDoanhThuThang() - tongLuongCongTy;
		for (int i = 0; i < dataCenter.getListGiamDoc().size(); i++) {
			System.out.println("Thu nhap cua tung giam doc: ");
			GiamDoc giamDoc = dataCenter.getListGiamDoc().get(i);
			System.out.print("Ho Ten: " + giamDoc.getHoTen() + " ");
			System.out.print("Ma So: " + giamDoc.getMaSo() + " ");
			System.out.print("So Dien Thoai: " + giamDoc.getSoDienThoai() + " ");
			System.out.print("So ngay lam viec: " + giamDoc.getSoNgayLamViec() + " ");
			System.out.println("Thu Nhap: " + (giamDoc.tinhLuong() + giamDoc.getCoPhan() / 100 * loiNhuanCongTy));
		}
	}
}
