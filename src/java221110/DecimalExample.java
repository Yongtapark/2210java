package java221110;

import java.text.DecimalFormat;

public class DecimalExample {

	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df= new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("0.0");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("000000000.00000");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("#########.#####");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("#.0");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("#,###.0");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("0.0e0");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("+#,###;-#,###");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("#.#%");
		System.out.println(df.format(num));
		
		df=new DecimalFormat("\u00a4 #,###");
		System.out.println(df.format(num));

	}

}
