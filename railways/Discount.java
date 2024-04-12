package railways;

public enum Discount {

	STUDENTS(13.5),
    COUPONS(7.0),
    HALLOWEEN(9.3),
    CHRISTMAS(6.7),
    NONE(0);

    private final double value;

    Discount(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
    
}
