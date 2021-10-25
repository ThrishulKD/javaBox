package com.xworkz.DP;

import com.xworkz.DP.Constant.Genre;
import com.xworkz.DP.DAO.WebSeriesDAO;
import com.xworkz.DP.DTO.WebSeriesDTO;

public class WebSeriesStarter {

	public static void main(String[] args) {
		// String name, String mainCharater, float ratings, Genre genre)

		WebSeriesDTO webSeries = new WebSeriesDTO();
		WebSeriesDTO ref = new WebSeriesDTO("GOT", "emily clark", 9.5f, webSeries.getGenre());
		WebSeriesDTO ref1 = new WebSeriesDTO("sacred games", "saif ali khan", 8f, webSeries.getGenre());
		WebSeriesDTO ref2 = new WebSeriesDTO("obx", "madison", 8.5f, webSeries.getGenre());

		WebSeriesDAO val = new WebSeriesDAO();
		val.saveWebSeries(ref);
		val.saveWebSeries(ref);
		val.delete(0);
		val.update(0, ref1);

		WebSeriesDTO[] term = new WebSeriesDAO().getdto();
		for (int i = 0; i < term.length; i++) {

			WebSeriesDTO gig = ref;
			System.out.println("......................................");

			if (gig != null) {
				System.out.println(gig.getMainCharater());
				System.out.println(gig.getName());
				System.out.println(gig.getRatings());
				System.out.println(gig.getGenre());
			}
			WebSeriesDTO gig1 = ref1;
			System.out.println("......................................");

			if (gig != null) {
				System.out.println(gig1.getMainCharater());
				System.out.println(gig1.getName());
				System.out.println(gig1.getRatings());
				System.out.println(gig1.getGenre());
			}
			WebSeriesDTO gig2 = ref2;
			System.out.println("......................................");

			if (gig != null) {
				System.out.println(gig2.getMainCharater());
				System.out.println(gig2.getName());
				System.out.println(gig2.getRatings());
				System.out.println(gig2.getGenre());
			}


		}

	}

}
