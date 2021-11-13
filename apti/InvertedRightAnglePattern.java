public class InvertedRightAnglePattern{
/*
* * * * *
* * * *
* * *
* *
*
*/
public static void main(String[] args) {
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		InvertedRightAnglePattern pd=new InvertedRightAnglePattern();
		pd.printPyramid(row,col);
	}
	void printPyramid(int r,int c){
		for(int row=0; row<=r; row++) //outer loop "ROWS"  
		{   
			for(int col=r-row; col>0; col--) //inner loop "COL"  
			{   
				System.out.print("* ");   
			}   
			System.out.println(); 
		}   
	}
}