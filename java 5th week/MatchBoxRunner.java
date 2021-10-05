class MatchBoxRunner{
	public static void main(String[] arg){
		
		String brand="agni";
		int noOfSticks=78;
		boolean empty = true;
		
		MatchBox box = new MatchBox(brand,noOfSticks,empty);
		
		System.out.println("brand: "+box.brand);
		System.out.println("noOfSticks: "+box.noOfSticks);
		System.out.println("empty: "+box.empty);
		
		box.size=SizeInMilimeter.SMALL;
		System.out.println("size: "+box.size);
	}
}