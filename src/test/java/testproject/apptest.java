package testproject;

import org.testng.annotations.Test;

import mymavenproject.compare;

public class apptest extends compare {

	
	
	@Test
	public void test1() {		
			apptest obj=new apptest();
		if((obj.getData("vaibhav", "Pass"))==true) {
			System.out.println("Test case passed");		
		}
	}
	
	
	@Test
	public void test2() {
		apptest obj1=new apptest();
		if((obj1.getData("vaihav","Pss"))==true) {
			
		}
		else System.out.println("Test case failed"); 
		
	}
	
}
