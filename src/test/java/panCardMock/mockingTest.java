package panCardMock;

import org.mockito.Mockito;
import org.testng.annotations.Test;

class PANCard {
	
@Test
	public  String isValid(String panCard) {

		if (panCard.matches("[A-Z]{5}[0-9]{4}[A-Z]") == true) {
			return "is valid pan";
		} else {
			return "is in valid pan";
		}

	}
	
	@Test
	public static PANCard getMockObject() { // This is a stub method.
		
		PANCard mockObj = Mockito.mock(PANCard.class);
		                  Mockito.when(mockObj.isValid("ABCDE1234A")).thenReturn("valid PAN Card");
		                  Mockito.when(mockObj.isValid("ABCDE1234B")).thenReturn("valid PAN Card");
		                  Mockito.when(mockObj.isValid("ABCDE1234C")).thenReturn("in valid PAN Card");
		return mockObj;
		
	}
}

public class mockingTest {

	public static void main(String[] args) {

		PANCard obj = PANCard.getMockObject();
		System.out.println(obj.isValid("ABCDE1234A"));
		System.out.println(obj.isValid("ABCDE1234C"));
		
		System.out.println(obj.isValid("ABCDE1234D")); // it will fail becz we did not created stub/mock for this card number.
		
		

	}

}
