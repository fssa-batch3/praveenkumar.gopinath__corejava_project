package day10.practice;

import 
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class EmailValidator {
    public static boolean isValidEmail(String emailId) throws InvalidEmailException {
        // TODO Write your logic to validate email. If email is valid, return true. Otherwise, throw InvalidEmailException
        
        if () {
            return true;
        } else {
            throw new InvalidEmailException("Invalid Email");
        }
    }
}
