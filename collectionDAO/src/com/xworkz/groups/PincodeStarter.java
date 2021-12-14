	package com.xworkz.groups;

	import java.util.Iterator;

import com.xworkz.groups.dao.PincodeDAO;

public class PincodeStarter {



		public static void main(String[] args) {

			PincodeDAO dao = new PincodeDAO();
			dao.save(571212);
			dao.save(560100);
			dao.save(560068);
			dao.save(578846);
			dao.save(551164);

			boolean ref4 = dao.findMatch(560068);
			System.out.println(ref4);


		}

	}


