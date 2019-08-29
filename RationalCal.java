package Vjezbe;

public class RationalCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length != 3){
			System.out.println("Usage: RationalCal operand1 operator operand2");
			System.exit(0);
		}
		
		System.out.println(args.toString());
		
		String operand1 = args[0];
		//String operator = args[1];
		//String operand2 = args[3];
		
		String[] arrOp1 = operand1.split("/", 2);
		for(String s: arrOp1)
			System.out.println(s);
	}

}
