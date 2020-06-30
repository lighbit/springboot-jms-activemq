package com.zulkarnaen.jms.model;
/**
 * 
 * @author zulkarnaen
 *
 */
public class JmsModel {

	private String nama;
	private String kelas;
	private String alamat;

	public JmsModel(String nama, String kelas, String alamat) {
		this.nama = nama;
		this.kelas = kelas;
		this.alamat = alamat;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getKelas() {
		return kelas;
	}

	public void setKelas(String kelas) {
		this.kelas = kelas;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

}
