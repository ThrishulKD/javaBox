class Application{

String name="pcloudy";
float version=5.5f;
Company company=new Company();



void getApplicationDeveloped()
{

System.out.println("application name :"+ name);
System.out.println("application version :"+ version);
System.out.println("company name :"+ company.name);
System.out.println("company country :"+ company.country);
System.out.println("company ceo :"+ company.ceo);
System.out.println("company cfo :"+ company.cfo);
}

}