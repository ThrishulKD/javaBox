package com.xworkz.groups;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;
import com.xworkz.groups.dto.PoliceStationDTO;

public class PolicStationStarter {

	public static void main(String[] args) {

		PoliceStationDTO policeStationDTO1 = new PoliceStationDTO("Mico layout", "mico layout", "civil", 56);
		PoliceStationDTO policeStationDTO2 = new PoliceStationDTO("hosa road", "mico layout", "crime", 26);
		PoliceStationDTO policeStationDTO3 = new PoliceStationDTO("silk board", "mico layout", "cool", 89);
		PoliceStationDTO policeStationDTO4 = new PoliceStationDTO("kormangala", "kormangala", "traffic", 12);
		PoliceStationDTO policeStationDTO5 = new PoliceStationDTO("malur", "kolar", "civil", 63);
		PoliceStationDTO policeStationDTO6 = new PoliceStationDTO("malur", "kolar", "civil", 63);

		Set<PoliceStationDTO> ref = new HashSet<PoliceStationDTO>();
		ref.add(policeStationDTO2);
		ref.add(policeStationDTO4);
		ref.add(policeStationDTO3);
		ref.add(policeStationDTO5);
		ref.add(policeStationDTO1);
		ref.add(policeStationDTO6);

		System.out.println(ref.size());
		Iterator<PoliceStationDTO> val = ref.iterator();

		while (val.hasNext()) {
			System.out.println(val.next());
		}
	}

}
