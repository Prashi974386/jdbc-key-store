package com.ty.keyStore.Service;

import java.util.List;

import com.ty.keyStore.dao.Key_StoreDao;
import com.ty.keyStore.dto.Key_Store;


public class Key_StoreService {
	
	Key_StoreDao dao = new Key_StoreDao();
	
	public int saveAddress(Key_Store key_Store) {
		return dao.saveKey_Store(key_Store);
	}
	public List<Key_Store> getKey_StoreByIdService(Key_Store key_Store,int id)
	{
		return dao.getKey_StoreById(key_Store, id);
	}
}
