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
	Country count1=new Country("India",91);
	Country count2=new Country("USA",001);
	Country count3=new Country("Russia",007);
	Country count4=new Country("netherland",031);
	Country count5=new Country("japan",81);
	
	Country[] arr ={count1,count2,count3,count4,count5};
	
	for(int i =0;i<arr.length;i++){

		System.out.println(arr[i].name+" :"+arr[i].code);
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