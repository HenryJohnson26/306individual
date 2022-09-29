import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class NegativeBalanceException extends Exception{
	private double negativeBalance = 0;
	private PrintWriter fileReader;
	
	public NegativeBalanceException() {
		
		super("Error: Negative Balance");
	}
	
	public NegativeBalanceException(double balance) {
		super("Amount exceeds balance by "+balance);
		try {
			fileReader = new PrintWriter("logfile.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		negativeBalance = balance;
		fileReader.write("Amount exceeds balance by "+balance);
		fileReader.close();
	}
	
	@Override
	public String toString() {
		String out = "Balance of "+negativeBalance+" not allowed";
		return out;
	}

}
