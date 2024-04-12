package railways;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.CompactNumberFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import fruitspackage.IceCream;

public class Driver {
public static void main(String[] args) throws FileNotFoundException {
		
		Scanner scan=new Scanner(new File("input.txt"));
		ArrayList<TicketDetails> ttd=new ArrayList<TicketDetails>();
		TrainsAvailable ta= new TrainsAvailable();
		TicketDetails ticketdetails= new TicketDetails();
		System.out.println("              Train Ticket Booking");
		System.out.println("-------------------------------------------\r\n-------------------------------------------");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your First Name:");
		String fs=sc.nextLine();
		System.out.println("Enter your Last Name:");
		String ls=sc.nextLine();
		System.out.println("Enter your Phone Number:");
		long ph=sc.nextLong();
		Passenger p=new Passenger(fs, ls, ph);
		p.detailsOfPassenger();
		ticketdetails.setPassenger(p);
		while(scan.hasNext()) {
			String trains=scan.nextLine();
			String trainnos=scan.nextLine();
			String line = scan.nextLine();
   		 String[] arrOfStr = line.split(" ");
   		 String fr=arrOfStr[0];
   		 String to=arrOfStr[2];
   		String line2 = scan.nextLine();
  		 String[] arrOfStr2 = line2.split(" ");
  		 String ns=arrOfStr2[0];
  		String date = scan.nextLine();
  		LocalDate ld=LocalDate.parse(date);
  		String time = scan.nextLine();
  		LocalTime lt= LocalTime.parse(time);
  		String line3 = scan.nextLine();
 		 String[] arrOfStr3 = line3.split(" ");
  		String min = arrOfStr3[0];
  		TrainDetails td= new TrainDetails(trainnos, trains, fr, to, ns, min, ld, lt);
  				ta.addTrains(td);
  		
  		
  		}
		for(int i=0;i<ta.getTrains().size();i++) {
			for(int j=i+1;j<ta.getTrains().size();j++) {
				if(Integer.parseInt(ta.getTrains().get(i).getTrainNumber())==Integer.parseInt(ta.getTrains().get(j).getTrainNumber())) {
					//System.out.println(Integer.parseInt(ta.getTrains().get(i).getTrainNumber())+" "+Integer.parseInt(ta.getTrains().get(j).getTrainNumber()));
					ta.getTrains().remove(i);
					
				}
					
			}
			
		}
			
		//ta.viewAvailableTrains();
		/*for(int i=0;i<ta.getTrains().size()-1;i++) {
			//System.out.println(ta.getTrains().get(i).getTrainNumber());
			//System.out.println("v"+ta.getTrains().get(i+1).getTrainNumber());
			if(ta.getTrains().get(i).getTrainNumber()==ta.getTrains().get(i+1).getTrainNumber()) {
				System.out.println(ta.getTrains().get(i).getTrainNumber());
				ta.getTrains().remove(ta.getTrains().get(i));}
		}*/
		String ch4;
		do {
		System.out.println("1.Check Train Status  2.Available Trains");
		int ch=sc.nextInt();
		Scanner scan1=new Scanner(new File("sentences.txt"));
		
		
		if(ch==1) {
			System.out.println("Enter From and To places:");
			sc.nextLine();
			String ff=sc.nextLine();
			//sc.nextLine();
			String tt=sc.nextLine();
			//System.out.println(ff+" "+tt);
			while(scan1.hasNext()) {
				String li=scan1.nextLine();
				
				if(li.equals("@@@")) {
					String ft=scan1.nextLine();
					String spl[]=ft.split("-");
					//System.out.println(spl[0]+" "+spl[1]);
					if(ff.equalsIgnoreCase(spl[0]) && tt.equalsIgnoreCase(spl[1])) {
						//System.out.println("ok");
						while(scan1.hasNext()) {
							//System.out.println("yed");
							String read=scan1.nextLine();
							//System.out.println(read);
							if(read.equals("@@@")) {
								//System.out.println(read);
								li="@@@";
								break;
							}
							System.out.print("|"+read+"|----|");	
						}
						
					}
					else
						continue;
					//System.out.println(li);
				}
			}
		}
		else if(ch==2) { //ta.getTrains().sort(null);
		Collections.sort(ta.getTrains());
			ta.viewAvailableTrains();}
		else {
			System.out.println("Invalid Option"); System.exit(1);}
		System.out.println();
		System.out.println("Choose the date would like to travel: ");
		String d=sc.next();
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
		LocalDate date = LocalDate.parse(d);  
		//LocalDate ld1=LocalDate.parse(d);
		System.out.println("Enter From and To place: ");
		sc.nextLine();
		String f1 = sc.nextLine();
		//System.out.println("OK");
		String t1 = sc.nextLine();
		System.out.println("Do you wish to filter the train details by time  (Y/N): ");
		String ch1=  sc.next();
		TrainsAvailable ta1= new TrainsAvailable();
		if(ch1.equalsIgnoreCase("Y")) {
			
			for(TrainDetails td:ta.getTrains()) {
				
				
				if(f1.equalsIgnoreCase(td.getFrom()) && t1.equalsIgnoreCase(td.getTo()) && date.equals(td.getDate())) {
					//int flag=0;
					
					try {
						//seat:
					if(Integer.parseInt(td.getSeatsAvailable())>0) {
						
						ta1.addTrains(td);
						//continue;
						
					}
					else {
						//System.out.println("No Seats Available");
						//System.out.println
						throw new NoSeatsAvailableException("No Seats Available");
						
						//System.exit(1);
					}
					}
					catch(NoSeatsAvailableException e) {
						//System.out.println(ta1.getTrains().get(0).getSeatsAvailable());
						//ta1.getTrains().remove(0);
						//System.out.println(ta1.getTrains().get(0).getSeatsAvailable());
						System.out.println(e.getMessage());
						System.exit(1);
						//flag=1;
						
					}
					//if(flag==1)
						
					
				}
			}
			//ta1.viewAvailableTrains();
			
				//ticketdetails.setTrains(ta1.getTrains().get(0));
				
			
		}
		else if(ch1.equalsIgnoreCase("N")) {
			for(TrainDetails td:ta.getTrains()) {
				if(f1.equalsIgnoreCase(td.getFrom()) && t1.equalsIgnoreCase(td.getTo()) && date.equals(td.getDate())) {
					ta1.addTrains(td);
				}
			}
			ta1.viewAvailableTrains();
			try {
			if(Integer.parseInt(ta1.getTrains().get(0).getSeatsAvailable())>0) {
				ticketdetails.setTrains(ta1.getTrains().get(0));
				System.out.println(ta1.getTrains().get(0).getSeatsAvailable());
			}
			
			else {
				System.out.println(ta1.getTrains().get(0).getSeatsAvailable());
				throw new NoSeatsAvailableException("No Seats Available");
				//System.out.println("No Seats Available");
				
			}
			}
			catch( NoSeatsAvailableException e)
			{
				System.out.println(e.getMessage());
				ta1.getTrains().remove(0);
				System.exit(1);
			}
			
			
		}
		else {
			System.out.println("Invalid Option"); System.exit(1);}
		String ct="";
		sc.nextLine();
		int f=0;
		while(f==0) {
	try {
		if(ch1.equalsIgnoreCase("Y")) {
			ta1.viewAvailableTrains();
		System.out.println("Choose the train you would like to travel:");
	//	sc.nextLine();
		ct=sc.nextLine();
		}
		else if(ch1.equalsIgnoreCase("N"))
			ct=ta1.getTrains().get(0).getTrains();
		else
			System.out.println();
		//System.out.print(ta1.getTrains().);
		for(TrainDetails td: ta1.getTrains()) {
			int ind=0;
			TrainDetails td1;
			System.out.println(td.getTrains());
			System.out.println("ct "+ct);
			if(ct.equalsIgnoreCase(td.getTrains())) {
				//System.out.print(td.getTrains());
				System.out.println("Thank you for choosing "+td.getTrains());
				ticketdetails.setTrains(td);
				ind=ta1.getTrains().indexOf(td);
				td1=td;
				td1.setSeatsAvailable(String.valueOf(Integer.parseInt(td1.getSeatsAvailable())-1));
				ta1.getTrains().set(ind, td1);
				f=1;
				break;
			}
			//else {
				//System.out.println(ct);
				
		}
		if(f==0)
			throw new TrainNotFoundException("Enter valid Train Name");
	}
	catch(TrainNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
				//System.out.println("Invalid option");
		System.out.println("Would you like to book this train (Yes/No):");
		//sc.nextLine();
		String conform=sc.nextLine();
			
		System.out.println("Choose the type of business class");
		System.out.println("1.Business Class   2.Coach Class");
		int ch2=sc.nextInt();
		if(ch2==1)
			ticketdetails.setCabinClass(new BusinessClass());
		else if(ch2==2)
			ticketdetails.setCabinClass(new CoachClass());
		else
			System.out.print("Invalid option");
		System.out.println("Choose the type of meals you like to have");
		System.out.println("1.vegetarian   2.Non Vegetarian");
		int ch3=sc.nextInt();
		if(ch3==1)
			ticketdetails.setFoodType("Vegetarian");
		else if(ch3==2)
			ticketdetails.setFoodType("Non Vegetarian");
		else
			System.out.print("Invalid option");
		System.out.println("Enter the discount type");
		System.out.println("STUDENTS , HALLOWEEN , CHRISTMAS , COUPONS , NONE" );
		sc.nextLine();
		String inamer = sc.nextLine();
		Discount dis=Discount.valueOf(inamer.toUpperCase());
    	double iprice=dis.getValue();
    	ticketdetails.setDiscount(iprice);
    	ttd.add(ticketdetails);
    	//ticketdetails.displayTicket();
    	//ticketdetails.getCabinClass().viewComplimentaries();
    	//ta.viewAvailableTrains();
    	System.out.println("Would you like to continue (Y/N)");
    	 ch4=sc.nextLine();
		}while(ch4.equalsIgnoreCase("Y"));
    	
    	
    	int l=1;
    	for(TicketDetails t12:ttd) {
    		System.out.println("TicketNo: "+l);
    		l++;
    		t12.displayTicket();
    		t12.getCabinClass().viewComplimentaries();
    		
    		
    	}
    	
	}

}
