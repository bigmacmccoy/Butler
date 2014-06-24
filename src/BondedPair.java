// Simple data structure of a String with a matched double
public class BondedPair {
	private String str;
	private double num;

	public BondedPair(String str, double num){
		this.str = str;
		this.num = num;
	}
	public void setString(String newStr){
		this.str = newStr;
	}
	public void setNumber(double newNum){
		this.num = newNum;
	}
	public String getString(){
		return this.str;
	}
	public double getNumber(){
		return this.num;
	}
}
