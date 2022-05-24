package com.ty.keyStore.Controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.keyStore.Service.Key_StoreService;
import com.ty.keyStore.dao.Key_StoreDao;
import com.ty.keyStore.dto.Key_Store;



public class TestKeyStore {
	public static void main(String[] args) {
		List<Key_Store> list = new ArrayList();
		Key_Store k = new Key_Store();
//		k.setUid(1);
//		k.setComment("do not forgetten");
//		k.setDescription("GiT Hub");
//		k.setKey("prashi@gmail.com");
//		k.setValue("prashi974386");
		
		Key_StoreService store= new Key_StoreService();
		
//		int res = store.saveAddress(k);
//		if(res > 0) {
//			System.out.println("Data is inserted successfully");
//		}
//		else
//			System.out.println("No data is Exist");
		
		list=store.getKey_StoreByIdService(k, 1);
		System.out.println(list);
	}
}
