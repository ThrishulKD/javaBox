package com.xworkz.groups;

import com.xworkz.groups.dao.BeerDAO;

import com.xworkz.groups.dao.EqualsBeerSearch;
import com.xworkz.groups.dao.EqualsIgnoreCaseBeerSearch;
import com.xworkz.groups.dao.TotalSearch;

public class BeerStarter {

	public static void main(String[] args) {

		BeerDAO beerDAO = new BeerDAO();

		TotalSearch beerSearch = new EqualsBeerSearch();
		boolean result = beerDAO.find(beerSearch, "Astol");
		System.out.println(result);

		TotalSearch beerSearch1 = new EqualsIgnoreCaseBeerSearch();
		boolean result1 = beerDAO.find(beerSearch1, "beer1");
		System.out.println(result1);

	}

}
