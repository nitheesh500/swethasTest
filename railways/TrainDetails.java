package railways;

import java.time.LocalDate;
import java.time.LocalTime;

public class TrainDetails implements Comparable<TrainDetails> {

    private String trainNumber;
    private String trains;
    private String from;
    private String to;
    private String seatsAvailable;
    private String hoursJourney;
    private LocalDate date;
    private LocalTime time;

    // No-arg constructor
    public TrainDetails() {
    }

    // Parameterized constructor
    public TrainDetails(String trainNumber, String trains, String from, String to, String seatsAvailable,
                        String hoursJourney, LocalDate date, LocalTime time) {
        this.trainNumber = trainNumber;
        this.trains = trains;
        this.from = from;
        this.to = to;
        this.seatsAvailable = seatsAvailable;
        this.hoursJourney = hoursJourney;
        this.date = date;
        this.time = time;
    }

    // Getter and setter methods for all attributes (omitted for brevity)

    
    

    public void viewTrainDetails() {
        System.out.println("Train Details:");
        System.out.println("  Trains: " + trains);
        System.out.println("  Train Number: " + trainNumber);
        System.out.println("  Date: " + date);
        System.out.println("  Time: " + time);
        System.out.println("  From: " + from);
        System.out.println("  To: " + to);
        System.out.println("  Number of HoursJourney: " + hoursJourney+" minutes");
        System.out.println("  Number of Seats Available: " + seatsAvailable);
       
 
    }

    public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrains() {
		return trains;
	}

	public void setTrains(String trains) {
		this.trains = trains;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(String seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public String getHoursJourney() {
		return hoursJourney;
	}

	public void setHoursJourney(String hoursJourney) {
		this.hoursJourney = hoursJourney;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	@Override
    public int compareTo(TrainDetails otherTrain) {
        return this.time.compareTo(otherTrain.time);
    }
}

