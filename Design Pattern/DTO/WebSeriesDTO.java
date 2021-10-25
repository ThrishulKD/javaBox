package com.xworkz.DP.DTO;

import com.xworkz.DP.Constant.Genre;

public class WebSeriesDTO {

	private String name;
	private String mainCharater;
	private float ratings;
	private Genre genre;

	public WebSeriesDTO() {
		System.out.println("Invoked no argument Constructor");
	}

	public WebSeriesDTO(String name, String mainCharater, float ratings, Genre genre) {
		super();
		this.name = name;
		this.mainCharater = mainCharater;
		this.ratings = ratings;
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMainCharater() {
		return mainCharater;
	}

	public void setMainCharater(String mainCharater) {
		this.mainCharater = mainCharater;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

}
