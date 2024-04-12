package railways;

public class Passenger implements Person {

	private String firstName;
    private String lastName;
    private long phoneNumber;

    public Passenger(String firstName, String lastName, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    public String nameOfPerson() {
        return firstName + "," + lastName;
    }

    @Override
    public void detailsOfPassenger() {
    	System.out.println("Welcome to Railways Booking System!");
        System.out.println("               Passenger Details"+"\r\n"+"               -------------------");
        System.out.println(" Name: " + this.nameOfPerson());
  
        System.out.println(" Phone Number: " + phoneNumber);
    }
}
