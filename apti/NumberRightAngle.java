import java.util.*;
public class NumberRightAngle 
{                 
public static void main(String args[])   
{ 
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		
		NumberRightAngle pd=new NumberRightAngle();
		pd.getdetails(row,col); 
		
} 
void getdetails(int r,int c) {
int row, col, rows;  
Scanner sc = new Scanner(System.in);    
System.out.print("Enter the number of rows you want to print: ");      
 rows = sc.nextInt();           
for (row = 1; row <= rows; row++)   
{  
for (col = 1; col <= row; col++)  
{  
System.out.print(row+" ");  
}  
System.out.println();  
}           
}  
} 