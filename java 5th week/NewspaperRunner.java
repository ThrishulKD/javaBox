class NewspaperRunner{
	public static void main(String[] val){
		
		String name="prajavani";
		
		Newspaper news=new Newspaper(name,"the printers pvt lim",Language.KANNADA,"Shanth Kumar");
		
		System.out.println(news.name);
		System.out.println(news.ownerName);
		

		System.out.println(news.language);
		
		Price rupees=Price.PRAJAVANI;
		System.out.println(rupees.price);
		System.out.println(news.editor);
		
		}
		
		
	}