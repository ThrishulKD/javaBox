package com.xworkz.core.subClass;

import com.xworkz.core.subClass.parentClass.NewsPapaer;

public class NewsPaperStarter {
	
	public static void main(String[] args) {
		

	
	NewsPapaer news= new NewsPapaer("mysor mitra", "kannada");
	NewsPapaer news1=new NewsPapaer("mysor mitra", "kannada");
	news.equals(news1);
	}
}
