package myfirstproject;

public class ReverseInteger {
	public static void main(String[] args) {
		String num = "123";
		String total = "";
		for(int i=0; i<num.length(); i++) {
			total+=num.charAt(i);
		}
		System.out.print(total);
	}
}
