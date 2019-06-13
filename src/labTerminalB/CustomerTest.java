package labTerminalB;

import org.junit.Test;

public class CustomerTest {
	Movie m1 = new Movie("Spancer", 0);
	Movie m2 = new Movie("Speed", 1);
	Movie m3 = new Movie("Jeet", 2);
	
	Customer me = new Customer("Nadir");
	Customer me2 = new Customer("Allah Ditta");
	Customer me3 = new Customer("Aayat Khan");
	Rental r1 = new Rental(m1, 23);
	Rental r2 = new Rental(m2,4);
	Rental r3 = new Rental(m3,30);
	
	/**
	 * Test 1 Customer rented two movies one REGULAR and one NEW_RELEASE
	 */
	@Test
	public void testStatement1() {
		me.addRental(r1);
		me.addRental(r2);
		me.addRental(r3);
		//fail("Not yet implemented");
		String output1 = "Rental Record for Nadir\r\n" + 
				"	Spancer	33.5\r\n" + 
				"	Speed	12.0";
		if(output1.equals(me.statement()))
		{
			assert true;
		}
		String output2 = "Rental Record for Aayat Khan\r\n" + 
				"	Jeet	33.5\r\n" + 
				"	Speed	12.0";
		if(output2.equals(me2.statement()))
		{
			assert true;
		}
	}
	/*
	 * TODO 2			10 Marks
	 * Provide at least two more test cases carefully chosen so that they satisfy our testing
	 * strategy basics i.e. input partition etc
	 */
	

}
