package com.xworkz.DP;

import com.xworkz.DP.DAO.DoctorDAO;
import com.xworkz.DP.DTO.DoctorDTO;

public class DoctorStarter {

	public static void main(String[] args) {

		// (String name, String specilization, String hospitalName, String gender, float
		// salary)
		DoctorDTO ref1 = new DoctorDTO("prakash", "eye specilist", "netra hospital", "male", 656634f);
		DoctorDTO ref2 = new DoctorDTO("pramod", "ear specilist", "kivi hospital", "male", 465654f);

		DoctorDAO ref = new DoctorDAO();

		ref.addDetails(ref2);
		ref.addDetails(8, ref1);

		// ref.addDetails(new DoctorDTO(5,("prathiksha","heart
		// specilist","rudayalaya","female",65561344f)));

		ref.occupiedIndex();
		ref.search("pramod");
		DoctorDTO[] val = ref.getDetails();
		for (int i = 0; i < val.length; i++) {

			DoctorDTO fig = val[i];
			if (fig != null) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

				System.out.println("name".concat(fig.getName()));
				System.out.println("specalist".concat(fig.getSpecilization()));
				System.out.println("hospital".concat(fig.getHospitalName()));
				System.out.println("gender".concat(fig.getGender()));
				System.out.println("salary".concat(String.valueOf(fig.getSalary())));

			}
		}
	}

}
