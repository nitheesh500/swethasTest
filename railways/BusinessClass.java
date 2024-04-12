package railways;


public class BusinessClass extends CabinClass {
	
	private  double PRICE = 482.76;
	
	 public BusinessClass() {
	        // Default constructor
	    }
	 @Override
	 public String getCabinClass() {
		// TODO Auto-generated method stub
		 return "BS";
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return this.PRICE;
	}

	@Override
	public void viewComplimentaries() {
		// TODO Auto-generated method stub
		
		  String s1="We offer you"+"\r\n"+"-----------"+"********Business Class********"+"\r\n"+"Passengers are offered with:"+"\r\n";
		    String s2="1. Warm Towel, Welcome Drink"+"\r\n"+"2. Bowl of nuts, Complimentary Champagne"+"\r\n+"+"3. Wide Selection of Cocktails and Many more...";
		System.out.println(s1+s2);
	}

}

