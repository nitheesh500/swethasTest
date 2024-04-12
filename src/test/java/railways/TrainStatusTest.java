package railways;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

public class TrainStatusTest {
	TrainStatus ts=new TrainStatus("NY","DC");


  @Test
  public void getFromTest() {
   
  }

  @Test
  public void getToTest() {
	  assertEquals(ts.getTo(), "DC");
  }

  @Test
  public void setFromTest() {
	  ts.setFrom("KC");
	  assertEquals(ts.getFrom(), "KC");
	 

  }

  @Test
  public void setToTest() {
	  ts.setTo("DAL");
	  assertEquals(ts.getTo(), "DAL");
  }
}
