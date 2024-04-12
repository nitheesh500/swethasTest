package railways;

public class CoachClass extends CabinClass {

    private final double PRICE = 298.45;

    public CoachClass() {
        // Default constructor
    }

    @Override
    public String getCabinClass() {
        return "CC";
    }

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public void viewComplimentaries() {
    	String s1="We offer you"+"\r\n"+"-----------"+"********Business Class********"+"\r\n"+"Passengers are offered with:";
    	System.out.println(s1);
        System.out.println("1. Multi-meal");
        System.out.println("2. Fruits, salad, crackers, cheese of your choice");
        System.out.println("3. Drinks like fruit juices, soft drinks, beers, wines");
        // Add other complimentary services based on the image (e.g., blanket, pillow)
    }
}

