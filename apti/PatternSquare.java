class PatternSquare {
	/*done
        11              12              13              14              15
        21                                                              25
        31                                                              35
        41                                                              45
        51              52              53              54              55
		*/
	public static void main(String[] args) {
		String num1=args[0];
		int row=Integer.parseInt(num1);
		String num2=args[1];
		int col=Integer.parseInt(num2);
		PatternSquare pd=new PatternSquare();
		pd.printSquare(row,col);
	}
		void printSquare(int r,int c){
			
		for (int row = 1; row <= r; row++) 
		{
			System.out.print("\n");
			for (int col = 1; col <= c; col++) 
			{
				System.out.print("\t");
				if(row==1 || row==5 || col==1 || col==5)
				{
				System.out.print(row + "" + col + "\t");
				}
				else{
					System.out.print("\t");
				}

			}
		}
		}
	}