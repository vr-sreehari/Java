package OOP;

public class InsufficientFundsException extends Exception {

	double amount;

	InsufficientFundsException(double amt) {
		amount = amt;
	}
}
