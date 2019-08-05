package com.hokumus.hib.project.dao.util;

import java.util.List;

public interface IDBService<T> {

	public Boolean kaydet(T temp); 
	public Boolean guncelle(T temp);
	public Boolean sil(T temp);
	public List<T> getir(T temp);
	public T bul(Long id, T temp);
	public T bul(T temp);
	public List<T> getir(String kolonAdi, String deger, T temp);
	public List<T> ara(T temp);
}
