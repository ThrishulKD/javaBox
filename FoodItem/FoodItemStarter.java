class FoodItemStarter{
	
	
	public static void main(String[] args){
		
		FoodItem ref1=new FoodItem("pizza",199f,4,Type.VEG,OrderType.SWIGGY);
		ref1.ratings=4.5f;
		ref1.getDetails();
		FoodItem ref2=new FoodItem("berger",99f,4,Type.NONVEG,OrderType.PARCEL);
		ref2.ratings=4f;
		ref2.getDetails();
	}
}