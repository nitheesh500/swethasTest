package railways;

import static org.testng.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.testng.annotations.Test;

public class TicketDetailsTest {
	TrainDetails td= new TrainDetails("170", "NortheastRep", "NewYork", "Washington", "0", "394", LocalDate.parse("2024-05-15"), LocalTime.parse("11:30:00"));
	Passenger p=new Passenger("Swetha", "Kamineni", 123456789);
	CabinClass cc= new CoachClass();
	double d=13.5;
	String type="vegetarian";
	TicketDetails ttd= new TicketDetails(td, p, cc, d, type);

  @Test
  public void calculateAmountTest() {
	  assertEquals(ttd.calculateAmount(), 307.33375);
  }

  @Test
  public void calculateTaxTest() {
	  assertEquals(ttd.calculateTax(), 22.38375);
  }

  @Test
  public void getCabinClassTest() {
  // System.out.println(ttd.getCabinClass());
   assertEquals(ttd.getCabinClass(), cc);
  }

  @Test
  public void getDiscountTest() {
	  assertEquals(ttd.getDiscount(), 13.5);
  }

  @Test
  public void getPassengerTest() {
	  assertEquals(ttd.getPassenger(),p);
    //System.out.println(ttd.getPassenger());
  }

  @Test
  public void getTrainsTest() {
	  assertEquals(ttd.getTrains(), td);
  }
}
