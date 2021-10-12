class ContractorRunner{
	public static void main(String[] args){
		
		
		Contractor ref = new Contractor();
		
		ref.setName();
		ref.setCompany();
		ref.setSalary();
		ref.setConstruction();
		ref.setCountry();
		
		System.out.println(ref.getName());
		System.out.println(ref.getCompany());
		System.out.println(ref.getCountry());
		System.out.println(ref.getConstruction());
		System.out.println(ref.getSalary());
	}
}