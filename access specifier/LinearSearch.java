class LinearSearch{
	
	public static void main(String[] arg){
		
		String[] name={"lion","tiger","cat","dog"};
		String key="tig";
		int flag=0;
		
		for(int i=0;i<name.length;i++){
			
			if(name[i]==key){
			System.out.println("found");
			flag=1;
			}
			
		}
		if(flag==0){
		System.out.println("not found");
		}
	}
}