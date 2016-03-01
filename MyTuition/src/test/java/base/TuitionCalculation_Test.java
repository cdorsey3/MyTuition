package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TuitionCalculation_Test {

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
	public void testcalculations(){
		System.out.println("Test Tuition Calculation");
		//TuitionCalculation instance = new TuitionCalculation();
		double Expectedresult = 597.34;
		double result = TuitionCalculation.tuitCalc(.05,20.0,20000.0,.05);
		assertEquals(Expectedresult, result);
	}
	@Test
	public void testcalculations2(){
		System.out.println("Test Tuition Calculation");
		//TuitionCalculation instance = new TuitionCalculation();
		double Expectedresult = 6073.64;
		double result = TuitionCalculation.tuitCalc(.05,30.0,250000.0,.05);
		assertEquals(Expectedresult, result);
	}
	@Test
	public void testcalculations3(){
		System.out.println("Test Tuition Calculation");
		//TuitionCalculation instance = new TuitionCalculation();
		double Expectedresult = 1717.08;
		double result = TuitionCalculation.tuitCalc(.02,20.0,75000.0,.05);
		assertEquals(Expectedresult, result);
	}
	@Test
	public void testcalculations4(){
		System.out.println("Test Tuition Calculation");
		//TuitionCalculation instance = new TuitionCalculation();
		double Expectedresult = 5229.67;
		double result = TuitionCalculation.tuitCalc(.1,15.0,100000.0,.08);
		assertEquals(Expectedresult, result);
	}
}

