class CurtainRunner{
	
	public static void main(String[] args){
		
		Curtain ref=new Curtain();
		
		ref.setColour("blue");
		String colour=ref.getColour();
		System.out.println(colour);
	
	ref.setLength(23.4f);
	float length=ref.getLength();
	System.out.println(length);
	
	ref.setCost(499f);
	ref.setMaterial("cotton");
	ref.setUsedIn("door");
	
	System.out.println(ref.getCost());
	System.out.println(ref.getMaterial());
	System.out.println(ref.getUsedIn());
	
	}	
}