package com.xworkz.DP.DAO;

import com.xworkz.DP.DTO.BucketDTO;

public class BucketDAO {
	private int count=0;
	
	BucketDTO[] buk= new BucketDTO[5];
	
	public void addBucketDetails(BucketDTO name) {
		if(name!=null && count<buk.length) {
		buk[count]=name;
		count++;
		System.out.println("parameter is added" .concat(String.valueOf(name)));
		}
	}
	
	public void delete(int digit) {
		
		if(digit<buk.length && digit>=0) {
			buk[digit]= null;
			System.out.println("deleted the user passed index".concat(String.valueOf(digit)));
		}
	}
	
	public void update(int digit, BucketDTO name) {
		if(digit<buk.length && digit>=0&& name!=null) {
			buk[digit]=name;
			System.out.println("updated the user passed index" .concat(String.valueOf(digit)) .concat(String.valueOf(name)));
		}
	}
	
	public BucketDTO[] getBucketDetails() {
		return buk;
		
	}
}
