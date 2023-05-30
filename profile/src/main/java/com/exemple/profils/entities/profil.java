package com.exemple.profils.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class profil {	
	@Id
    private Long numtel;
    private String nomprofil;
    private String prenomprofil;
    private String email;
    private String photo;

//    @Lob
//	private byte[] data;
//    @OneToOne
//    @JoinColumn(name = "fileDb_FK", referencedColumnName = "id")
//    private FileDb filedb;
//   @Lob
//   @Column( columnDefinition = "LONGBLOB")
//    private byte[] photo;
  
   
   
	

public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
public profil() {
	 
	}
	public profil( String nomprofil, String prenomprofil, String email, Long numtel, String photo) {
	super();
	this.nomprofil = nomprofil;
	this.prenomprofil = prenomprofil;
	this.email = email;
	this.numtel = numtel;
	this.photo = photo;
}








	public String getNomprofil() {
		return nomprofil;
	}



	public void setNomprofil(String nomprofil) {
		this.nomprofil = nomprofil;
	}



	public String getPrenomprofil() {
		return prenomprofil;
	}



	public void setPrenomprofil(String prenomprofil) {
		this.prenomprofil = prenomprofil;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Long getNumtel() {
		return numtel;
	}



	public void setNumtel(Long numtel) {
		this.numtel = numtel;
	}



//	public byte[] getPhoto() {
//		return photo;
//	}
//
//
//
//	public void setPhoto(byte[] photo) {
//		this.photo = photo;
//	}
	
//	   public FileDb getFiledb() {
//			return filedb;
//		}
//		public void setFiledb(FileDb filedb) {
//			this.filedb = filedb;
//		}
	
	



	@Override
	public String toString() {
		return "profil [nomprofil=" + nomprofil + ", prenomprofil=" + prenomprofil
				+ ", email=" + email + ", numtel=" + numtel + "]";
	}
//	public byte[] getData() {
//		return data;
//	}
//	public void setData(byte[] data) {
//		this.data = data;
//	}


	



}
