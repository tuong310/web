package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="camBien")
public class camBien {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="stt")
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="nhietdo", length=50)
	private int nhietDo;
	
	@Column(name="doam", length=50)
	private int doAm;
	
	@Column(name="dieukhien", length=50)
	private String dieuKhien;
	public camBien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public camBien(int nhietDo, int doAm, String dieuKhien) {
		super();
		this.nhietDo = nhietDo;
		this.doAm = doAm;
		this.dieuKhien = dieuKhien;
	}
	public int getNhietDo() {
		return nhietDo;
	}
	public void setNhietDo(int nhietDo) {
		this.nhietDo = nhietDo;
	}
	public int getDoAm() {
		return doAm;
	}
	public void setDoAm(int doAm) {
		this.doAm = doAm;
	}
	public String getDieuKhien() {
		return dieuKhien;
	}
	public void setDieuKhien(String dieuKhien) {
		this.dieuKhien = dieuKhien;
	}
	
}
