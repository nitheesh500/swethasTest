package railways;

import static org.testng.Assert.assertEquals;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class TrainsAvailableTest {
	
   TrainsAvailable ta=new TrainsAvailable();
   ArrayList<TrainDetails> tdl=new ArrayList<TrainDetails>();
 ArrayList<TrainDetails> arra;
  @Test
  public void getTrainsTest() {
	  tdl.add(new TrainDetails("125", "NortheastReg", "NewYork", "Washington", "0", "394", LocalDate.parse("2024-05-15"), LocalTime.parse("11:30:00")));
	  tdl.add(new TrainDetails("126", "NortheastReg", "NewYork", "Washington", "0", "394", LocalDate.parse("2024-05-15"), LocalTime.parse("11:30:00")));
	  ta.setTrains(tdl);
	   arra = ta.getTrains();
    assertEquals(arra, ta.getTrains());
  }
/*
  @Test
  public void viewAvailableTrainsTest() {
    //throw new RuntimeException("Test not implemented");
  }*/
}
