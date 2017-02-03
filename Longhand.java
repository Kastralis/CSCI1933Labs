public class Longhand {

	public String Number2Text(arg) {
		sdfhsajdkfhsafh
		return textString;
		}
		
	public static void main(String[] args){
		double monies = Double.parseDouble(args.substring(1));			
				
		//millions
		int millions = monies / 1000000;
		monies = monies - (1000000 * millions);
		if(millions > 0)
			System.out.print(Number2Text(millions) + " million ");
	
		//thousands
		int thousands = monies / 1000;
		monies = monies - (1000 * thousands);
		if(thousands > 0)
			System.out.print(Number2Text(thousands) + " thousand ");
	
		//tens
		int tens = monies;
		monies = monies - tens;
		if(tens > 0)
			System.out.print(Number2Text(tens));
		System.out.print(" dollars");
	
		//cents
		int cents = monies * 100;
		if(cents > 0)
			System.out.print(" and "+ Number2Text(cents) + " cents");
	}
}

//.substring(1)
