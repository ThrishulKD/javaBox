package com.xworkz.DP.DAO;

import com.xworkz.DP.DTO.DoctorDTO;

public class DoctorDAO {

	private DoctorDTO[] doctorDto = new DoctorDTO[10];
	private int count = 0;

	public void addDetails(DoctorDTO name) {

		System.out.println("invoked add method");
		if (count < doctorDto.length && name != null) {
			doctorDto[count++] = name;
			System.out.println("name added ");
		} else {
			System.out.println("invalid index or the index is null");
		}

	}

	public void addDetails(int digit, DoctorDTO add) {
		System.out.println("invoked overloading add method");
		if (count < doctorDto.length && add != null) {
			doctorDto[digit] = add;
			System.out.println("overload method is added");
			count++;
		} else {
			System.out.println("invalid index");
		}

	}

	public void occupiedIndex() {
		System.out.println(count);

	}

	public boolean search(String name) {

		System.out.println("invoked search method");

		for (int i = 0; i < doctorDto.length; i++) {
			DoctorDTO ref = doctorDto[i];
			if (ref != null) {
				String doctorname = ref.getName();
				if (doctorname.equals(name)) {
					System.out.println("doctor name is "+name+ " is found");
					return true;
				}

			} else {
				System.out.println("not found");
			}
		}

		return false;
	}

	public DoctorDTO[] getDetails() {
		return doctorDto;
	}

}
