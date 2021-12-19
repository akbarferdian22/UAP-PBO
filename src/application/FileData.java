package application;

import javafx.beans.property.SimpleStringProperty;

public class FileData {
	   SimpleStringProperty NIM;
	   SimpleStringProperty Nama;
	   SimpleStringProperty Asal;
	   FileData(String NIM, String Nama, String asal) {
	      this.NIM = new SimpleStringProperty(NIM);
	      this.Nama = new SimpleStringProperty(Nama);
	      this.Asal = new SimpleStringProperty(asal);
	   }
	   public String getNIM(){
	      return NIM.get();
	   }
	   public void setNIM(String fname){
		   NIM.set(fname);
	   }
	   public String getNama(){
	      return Nama.get();
	   }
	   public void setNama(String fpath){
		   Nama.set(fpath);
	   }
	   public String getAsal(){
	      return Asal.get();
	   }
	   public void setAsal(String fsize){
		   Asal.set(fsize);
	   }
	   
	}
