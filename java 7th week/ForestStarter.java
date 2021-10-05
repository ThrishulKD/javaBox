class ForestStarter{
	
	
	public static void main(String[] args){
		
		Forest ref= new Forest("chamrajnagar");
		State ref1=new State("Basavaraj Bommai");
		CapitalCity ref2=new CapitalCity(12000000l);
		
		
		
		System.out.println(ref.name);
		System.out.println(ref.location);
		System.out.println(ref1.name);
		System.out.println(ref1.NoOfDistrict);
		System.out.println(ref1.chiefMinester);
		System.out.println(ref2.name);
		System.out.println(ref2.population);
		
		Famous famous=ref2.famous;
		System.out.println(ref2.famous.LANGUAGE);
	}
}