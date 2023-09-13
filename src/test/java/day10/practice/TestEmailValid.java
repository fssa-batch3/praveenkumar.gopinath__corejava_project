package day10.practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmailValid {

	@Test
	void testEmail() {

		String email = "praveenkumar@gmail.com";

		try {
			assertTrue(new EmailValidator().isValidEmail(email));
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}
	}

}