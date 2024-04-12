package railways;

import java.util.ArrayList;

public class TrainsAvailable {

	 private ArrayList<TrainDetails> trains;

	public TrainsAvailable() {
		trains = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<TrainDetails> getTrains() {
		return trains;
	}

	public void setTrains(ArrayList<TrainDetails> trains) {
		this.trains = trains;
	}
	 public void addTrains(TrainDetails  tr) {
	        // Logic to add train details from a file, database, or user input (replace with your implementation)
	       trains.add(tr);
	    }
	 public void viewAvailableTrains() {
	        System.out.println("Available Trains:"+"\r\n"+"---------------------");
	        System.out.println("Trains    Train Number    Travel From     Travel To          Date    Time  Seats Available  Travel Time");
	        for (TrainDetails train : trains) {
	            System.out.format("%-12s  %-12s  %-12s  %-12s  %-10s  %-5s  %-15s  %-12s\n",train.getTrains(),
	                    train.getTrainNumber(), train.getFrom(), train.getTo(), train.getDate(), train.getTime(),
	                    train.getSeatsAvailable(), train.getHoursJourney());
	        }
	 }
}
