class Searcher{
	
	public static void getnames(String name){
		String[] names ={"prajwal","komal","deepak","arun"};
		
		System.out.println("the name is : "+ name);
		for (int i=0;i<names.length;i++){
		
		if(name.equals(names[i])){
		System.out.println("the name is found");
		int e = i+1;
		System.out.println("the name is found in "+ e +"th position");
		break;
		}
		}
		}		
		
		public static void main(String[] arg){
			
			String ref = arg[0];
			getnames(ref);
		}
		
	}