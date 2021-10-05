class GasCylinderRunner{
	public static void main(String[] arg){
		
		float price =853.5f;
		float weightInKg=14.2f;
		long cylinderNumber= 15451666431l;
		
		GasCylinder cylinder = new GasCylinder(price,weightInKg,cylinderNumber);
		
		System.out.println("cylinder price: "+cylinder.price);
		System.out.println("cylinder weight: "+cylinder.weight);
		System.out.println("cylinder Number: "+cylinder.cylinderNumber);
		
		cylinder.name=Company.HP;
		cylinder.size=CylinderSize.SMALL;
		System.out.println("Company Name :"+cylinder.name);
		System.out.println("Company size :"+cylinder.size);
	}
}