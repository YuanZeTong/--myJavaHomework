package homework07_01;

public class NumberFormatException extends Exception {
	private String bin;
	public NumberFormatException(String bin){
		super("Invalid binary string " + bin);
		this.bin = new String(bin);
	}
	
	public String getBin() {
		return this.bin;
	}
}
