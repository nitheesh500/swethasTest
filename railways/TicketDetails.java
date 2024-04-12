package railways;

public class TicketDetails {
	
    private TrainDetails trains;
    private Passenger passenger;
    private CabinClass cabinClass;
    private double discount;
    private String foodType;

    public TicketDetails() {
        // No-arg constructor
    }

    public TicketDetails(TrainDetails trains, Passenger passenger, CabinClass cabinClass, double discount, String foodType) {
        this.trains = trains;
        this.passenger = passenger;
        this.cabinClass = cabinClass;
        this.discount = discount;
        this.foodType = foodType;
    }

	public TrainDetails getTrains() {
		return trains;
	}

	public void setTrains(TrainDetails trains) {
		this.trains = trains;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public CabinClass getCabinClass() {
		return cabinClass;
	}

	public void setCabinClass(CabinClass cabinClass) {
		this.cabinClass = cabinClass;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int generatePlatformNumber() {
       
        return (int) (Math.random() * 9 + 1);
    }

    public String generateSeatNumber() {
      
        int seatNumber = (int) (Math.random() * 36 + 1);


        char seatRow = (char) (Math.random() * ('F' - 'A' + 1) + 'A');

        return seatNumber + "" + seatRow;
    }

    public double calculateTax() {
        double price = cabinClass.getPrice();
        return price * 0.075; // 7.5% tax
    }

    public double calculateAmount() {
        double price = cabinClass.getPrice();
        double tax = calculateTax();
        return (price + tax)- discount;
    }

    public void displayTicket() {
        System.out.println(trains.getTrains()+"**************Ticket Details*************");
        System.out.println("  Passenger Name: " + passenger.nameOfPerson());
        System.out.println("  Train Number: " + trains.getTrainNumber());
        System.out.println("  Class: " + cabinClass.getCabinClass());
        System.out.println("  Date: " + trains.getDate());
        System.out.println("  Time: " + trains.getTime());
        System.out.println("  From: " + trains.getFrom());
        System.out.println("  To: " + trains.getTo());
       
        System.out.println("  Seat: " + generateSeatNumber());
        System.out.println("  Gate: " + generatePlatformNumber());
        System.out.println("  Meals Type: " + foodType);
        System.out.println("  Price: $" + cabinClass.getPrice());
        System.out.println("  Discount: $" + discount);
        System.out.println("  Tax: $" + calculateTax());
        System.out.println("  Total Amount: $" + calculateAmount());
    }

}
