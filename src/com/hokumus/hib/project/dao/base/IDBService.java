package com.hokumus.hib.project.dao.base;

import java.util.List;

public interface IDBService<T> {

	public Boolean kaydet(T temp); 
	public Boolean guncelle(T temp);
	public Boolean sil(T temp);
	public List<T> getir(T temp);
}
