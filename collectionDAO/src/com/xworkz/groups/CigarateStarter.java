	
	package com.xworkz.groups;

	import com.xworkz.groups.dao.CigarateDAO;
import com.xworkz.groups.dao.EqualsBeerSearch;
	import com.xworkz.groups.dao.EqualsIgnoreCaseBeerSearch;
	import com.xworkz.groups.dao.TotalSearch;

public class CigarateStarter {


		public static void main(String[] args) {

			CigarateDAO cigarateDAO = new CigarateDAO();

			TotalSearch Search = new EqualsBeerSearch();
			boolean result = cigarateDAO.find(Search, "mond");
			System.out.println(result);

			TotalSearch Search1 = new EqualsIgnoreCaseBeerSearch();
			boolean result1 = cigarateDAO.find(Search1, "black");
			System.out.println(result1);

		}

	}

