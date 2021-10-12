class DevelopersRunner{
	public static void main(String[] args){
		
		
		Developers ref = new Developers();
		
		ref.setName();
		ref.setCompany();
		ref.setSalary();
		ref.setType();
		ref.setCountry();
		
		System.out.println(ref.getName());
		System.out.println(ref.getCompany());
		System.out.println(ref.getCountry());
		System.out.println(ref.getType());
		System.out.println(ref.getSalary());
	}
}