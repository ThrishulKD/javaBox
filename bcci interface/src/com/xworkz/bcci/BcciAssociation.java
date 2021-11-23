package com.xworkz.bcci;

public class BcciAssociation {

	Bcci dao;

	public BcciAssociation(Bcci dao) {

		super();
		this.dao = dao;
	}

	public void saveBcci(BcciDTO bcci) {
		if (bcci != null)

		{
			System.out.println("invoked save bcci method");
		} else {
			System.out.println("not saved");
		}

	}

	public void findBcciName(BcciDTO bcci) {
		if (bcci != null) {
			BcciDTO ref = dao.StadiumRules(7);
			if (ref != null) {
				System.out.println(ref.getNoOfStatium());
				System.out.println(ref.getPresidentName());
				System.out.println(ref.getNetWorth());
			} else {
				System.err.println("ref is null");
			}

		} else {
			System.out.println("bcci is null");
		}
	}
}
