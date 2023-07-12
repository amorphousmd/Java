package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class DataCenter {
	private List<LaoDong> listLaoDong;
	private List<NhanVien> listNhanVien;
	private List<TruongPhong> listTruongPhong;
	private List<GiamDoc> listGiamDoc;
	
	public DataCenter() {
		// TODO Auto-generated constructor stub
		this.listLaoDong = new ArrayList<>();
		this.listNhanVien = new ArrayList<>();
		this.listTruongPhong = new ArrayList<>();
		this.listGiamDoc = new ArrayList<>();
	}

	public List<LaoDong> getListLaoDong() {
		return listLaoDong;
	}

	public void setListLaoDong(List<LaoDong> listLaoDong) {
		this.listLaoDong = listLaoDong;
	}

	public List<NhanVien> getListNhanVien() {
		return listNhanVien;
	}

	public void setListNhanVien(List<NhanVien> listNhanVien) {
		this.listNhanVien = listNhanVien;
	}

	public List<TruongPhong> getListTruongPhong() {
		return listTruongPhong;
	}

	public void setListTruongPhong(List<TruongPhong> listTruongPhong) {
		this.listTruongPhong = listTruongPhong;
	}

	public List<GiamDoc> getListGiamDoc() {
		return listGiamDoc;
	}

	public void setListGiamDoc(List<GiamDoc> listGiamDoc) {
		this.listGiamDoc = listGiamDoc;
	}
	
	
}
