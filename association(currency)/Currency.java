class Currency{
	
	String name;
	Country country;
	float value;
	
	Currency(String name,float value){
		
		this.name=name;
		this.value=value;
		
	}
	
	void getCurrencyDetails(){
		
		System.out.println("currency name: "+ name);
		System.out.println("value of the currency : "+ value);
		
		this.getCountryDetails();
		this.getApplicationDeveloped();
	}
	
	void getCountryDetails(){	
	
	String[] names={"India","USA","RUSSIA","NETHERLAND","JAPAN"};
	int[]  code={91,001,007,031,81};

	
	for(int i=0;i<names.length;i++){
		
	System.out.println("country name: "+ names[i]);
	}
	for(int j=0;j<code.length;j++){
	System.out.println("country code: "+ code[j]);	
	}
	}
	
	void getApplicationDeveloped()
{

	String name="pcloudy";
float version=5.5f;
Company company=new Company();



System.out.println("application name :"+ name);
System.out.println("application version :"+ version);
System.out.println("company name :"+ company.name);
System.out.println("company country :"+ company.country);
System.out.println("company ceo :"+ company.ceo);
System.out.println("company cfo :"+ company.cfo);
}
}