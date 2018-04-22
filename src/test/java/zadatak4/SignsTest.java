package zadatak4;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import zadatak.Signs;

public class SignsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testNumberOfSigns() {
		
		long actual = Signs.NumberOfSigns("Primer", 'i');
		assertEquals(1, actual );
		
		actual = Signs.NumberOfSigns("PrImerI", 'I');
		assertEquals(2, actual );
		
		actual = Signs.NumberOfSigns("Primer", 'e');
		assertEquals(1, actual );
		
		actual = Signs.NumberOfSigns("PrimerI I I", 'I');
		assertEquals(3, actual );
		
		actual = Signs.NumberOfSigns("", 'I');
		assertEquals(0, actual );
		
		actual = Signs.NumberOfSigns("   ", ' ');
		assertEquals(3, actual );
		
		actual = Signs.NumberOfSigns("RIEWTUPIRUEWPITUPERIWUTPREIUWTPRITUREWITUREITU", 'I');
		assertEquals(8, actual);	
	}

}
