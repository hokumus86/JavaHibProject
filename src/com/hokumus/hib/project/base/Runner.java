package com.hokumus.hib.project.base;

import java.lang.reflect.Field;
import java.util.List;

import com.hokumus.hib.project.dao.KullaniciDAO;
import com.hokumus.hib.project.model.Kullanici;

public class Runner {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

		Kullanici temp = new Kullanici();
		temp.setId(15L);
		temp.setName("Bilge");
		temp.setSurname("Okumuþ");
		temp.setUserName("biber");
		KullaniciDAO dao = new KullaniciDAO();
		dao.kaydet(temp);

		List<Kullanici> liste = dao.getir(new Kullanici());
		for (Kullanici k : liste) {
			System.out.println(k);
		}

		Kullanici t = dao.bul(15L, new Kullanici());
		System.out.println(t);

		System.out.println("*********************************************");
		liste = dao.getir("name", "Bil", new Kullanici());
		System.out.println(liste);

		Kullanici t1 = new Kullanici();
		System.out.println("********************-----------------**************************");
		t1.setId(15L);
		t1.setName("Bilge");
		t1.setSurname("okumuþ");
		liste = dao.ara(t1);

		System.out.println(liste);

	}

}
