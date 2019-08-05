package com.hokumus.hib.project.base;

import com.hokumus.hib.project.kullanici.dao.KullaniciDAO;
import com.hokumus.hib.project.model.Kullanici;

public class Runner {

	public static void main(String[] args) {
		
		Kullanici temp = new Kullanici();
		temp.setId(15L);
		temp.setName("Bilge");
		temp.setSurname("Okumuþ");
		temp.setUserName("biber");
		KullaniciDAO dao = new KullaniciDAO();
		dao.kaydet(temp);
		
	}

}
