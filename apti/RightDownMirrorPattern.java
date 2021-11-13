public class RightDownMirrorPattern  
{  
public static void main(String args[])   
{ 
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		
		RightDownMirrorPattern pd=new RightDownMirrorPattern();
		pd.print(row,col); 
		
} 
void print(int r,int c){  
for (int row= r; row>= 1; row--)  
{  
for (int col=r; col>row;col--)  
{  
System.out.print(" ");  
}  
for (int k=1;k<=row;k++)  
{  
System.out.print("*");  
}  
System.out.println("");  
}  
}  
}  