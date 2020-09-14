


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;


public class EgetTest {
	//A annotation is like a "note" that you assign to a block of code, you do that by declaring what type of "note" you want to use for the code block.
	//@Test is a type of annotation it's used to run the method which it's attached to just by it self to see if there will be any exceptions.
	//It checks if the method works or not, if no exceptions appears it means that the method works otherwise it means the method
	//doesn't work.
	@Test
	public void isListEmpty() {
	//Assertions are methods that "verify assumptions", there are a variety of assertions used for a block of code to check if the code execute as
	//it's meant to do. If it doesn't execute as it should, an AssertionError without a message is thrown. 
	//assertEquals method is used to check if two objects are equal, it calls equals method on each object to check equality.
	//assertTrue is a boolean method to check if the code is true or not.
	assertTrue( new ArrayList().isEmpty());
	}
	
}