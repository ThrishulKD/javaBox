package com.xworkz.groups;

import com.xworkz.groups.dao.BiscuitDAO;
import com.xworkz.groups.dao.EqualsBeerSearch;
import com.xworkz.groups.dao.EqualsIgnoreCaseBeerSearch;
import com.xworkz.groups.dao.TotalSearch;

public class BiscuitStarter {

	public static void main(String[] args) {

		BiscuitDAO biscuitDAO = new BiscuitDAO();

		TotalSearch Search = new EqualsBeerSearch();
		boolean result = biscuitDAO.find(Search, "borban");
		System.out.println(result);

		TotalSearch Search1 = new EqualsIgnoreCaseBeerSearch();
		boolean result1 = biscuitDAO.find(Search1, "BorBan");
		System.out.println(result1);

	}

}
