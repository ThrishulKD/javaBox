package com.xworkz.core.subClass.parentClass;

public class NewsPapaer {
	
	private String name;
	private String language;
	
	public NewsPapaer(String name, String language) {
		super();
		this.name = name;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	@Override
	public boolean equals(java.lang.Object obj) {

		System.out.println("invoked equals method");
		
		if(obj!=null) {
		
			if(obj instanceof NewsPapaer) {
				NewsPapaer newspaper= (NewsPapaer)obj;
				String lang=newspaper.getLanguage();
				String name=newspaper.getName();
				
				if(lang.equals(getLanguage())&&name.equals(getName())) {
					System.out.println(" both matches");
					return true;
				}
				else {
					System.out.println("any one doesnt match or both doesnt match");
				}
		}
		else {
			System.err.println("the object is not a instance of Newspaper");
		}
		}
		else {
			System.err.println("object u r passing is null");
		}
		return false;

}
	
	

}
