package com.xworkz.array;

public class StringArray {

	public static void main(String[] args) {

		System.out.println("1: Pancard Number");
		String[] panCardNumber= {"GDPPD6413J","JJJSU5641R",
				"KFHG6584O","HHDYS4684O","HDTW5742U","UBDIW8745W",
				"JDHE5489L","TWFDH4684E","DUCBS8943G","UFYT6842F"};
		
		for(int i=0;i<panCardNumber.length;i++) {
		System.out.println("panCardNumber: "+panCardNumber[i]);
		}
		System.out.println("****************************************************");
		System.out.println("2: vehicle Number");
		
		String[] vehicleNumber=new String[10];
		
		vehicleNumber[0]="KA 12 P 412";
		vehicleNumber[9]="KA 12 E 2164";
		vehicleNumber[1]="KA 21 D 4664";
		vehicleNumber[2]="KA 3 T 7456";
		vehicleNumber[3]="KA 12 Y 486";
		vehicleNumber[4]="KA 17 ED 7895";
		vehicleNumber[5]="KA 18 L 478";
		vehicleNumber[6]="KA 7 D 111";
		vehicleNumber[7]="KA 1 Q 8055";
		vehicleNumber[8]="KA T 1 0001";
		
		for(int i=0;i<vehicleNumber.length;i++) {
		System.out.println("vehicle Number : "+vehicleNumber[i]);
		}
		System.out.println("****************************************************");
		System.out.println("3:password");
		
		String[] password = {"hjf545@cd","ef446#","442edl$re","f6534r$","64cdf444>","scf643#5","4df44$",
				"df5ds_)(","565ddgs%&$"};
		
		
		for(int i=0;i<password.length;i++) {
		System.out.println("password : "+password[i]);
		}
		
		System.out.println("****************************************************");
		System.out.println("4: home address");
		
		String[] homeAddress= {"#62 parane village and post ,Madikeri taluk,kodagu district,karnataka-571212",
				"#63 parane village and post ,Madikeri taluk,kodagu district,karnataka-571212",
				"#64 parane village and post ,Madikeri taluk,kodagu district,karnataka-571212",
				"#65 parane village and post ,Madikeri taluk,kodagu district,karnataka-571212",
				"#66 parane village and post ,Madikeri taluk,kodagu district,karnataka-571212",
				"#67 parane village and post ,Madikeri taluk,kodagu district,karnataka-571212",
				"#68 parane village and post ,Madikeri taluk,kodagu district,karnataka-571212",
				"#69 parane village and post ,Madikeri taluk,kodagu district,karnataka-571212",
				"#60 parane village and post ,Madikeri taluk,kodagu district,karnataka-571212",
				"#61 parane village and post ,Madikeri taluk,kodagu district,karnataka-571212",};		
		
		for(int i=0;i<homeAddress.length;i++) {
		System.out.println("Home Address : "+homeAddress[i]);
		}
		System.out.println("****************************************************");
		System.out.println("5: App version");
		
		String[] appVersion= {"v.12.6","h.555.66,y","e4.88.1","jdk1.8","python 2.3.4","html 5.410","n.54.5","v.12.6","h.555.66,y","e4.88.1"};
		
		
		for(int i=0;i<appVersion.length;i++) {
		System.out.println("app Version : "+appVersion[i]);
		}
		System.out.println("****************************************************");
		System.out.println("6: Specs Model");
		
		String[] specsModel= {"d5","5d","e8","w78","2021","q45","eyecare1.1.1","k2","y89"};
		
		
		
		for(int i=0;i<specsModel.length;i++) {
		System.out.println("specs Model : "+specsModel[i]);
		}
		System.out.println("****************************************************");
		System.out.println("7: GST");	
		
		String[] gst= {"kdk5","rs500","0.21rs","2%","0.25%","565rs","5.23rs","1%","23%"};
		for(int i=0;i<gst.length;i++) {
		System.out.println("GST : "+gst[i]);
		}
		System.out.println("****************************************************");
		System.out.println("8: IFSC code");
		
		String[] ifscCode= {"CORP00035","CANARA4556","UN00046","DDFD88","HDFC8","D856","D544D","45ASD"};
		
		
		for(int i=0;i<ifscCode.length;i++) {
		System.out.println("IFSC code : "+ifscCode[i]);
		}
		System.out.println("****************************************************");
		System.out.println("9: passport Number");
		
		String[] passportNumber= {"463454D","74DCD54","5454584SC","5413463C","85141CD","4716551C","845161K","796469CW","4854661W"};
		for(int i=0;i<passportNumber.length;i++) {
		System.out.println("passport Number :" +passportNumber[i]);
		}
		System.out.println("****************************************************");
		System.out.println("10: instaId id");	
		
		String[] instaId= {"thrishul_kd3","virat.kohli","neymajr","taylorswift","mahi7781",
				"emilyclark","postmalon","bellthorn","danbilzerian"};
		
		
		for(int i=0;i<instaId.length;i++) {
		System.out.println("instaId : "+instaId[i]);
		}

	}

}
