import java.util.*;
public class TestCalculator {
	static double xx;
	static double yy;
	public static void main(String[] args) {
		
		Prompt myCalc= new Prompt();
		
		//Scanner Object
		Scanner s = new Scanner(System.in);
		
		//Read-In
		System.out.print("Please enter the first number: ");
		xx=s.nextDouble();	
		myCalc.setX(xx);
		
		
		
		System.out.print("Please enter the second number: ");
		yy=s.nextDouble();
		myCalc.setY(yy);
				
		System.out.println("(1) for Addition");
		System.out.println("(2) for Subtraction");
		System.out.println("(3) for Multiplication");
		System.out.println("(4) for Division ");
		System.out.print("Please enter operator choice: ");
		int operator=s.nextInt();
		
		
		
		//Addition
		if(operator==1){
			System.out.println(myCalc.getX()+" + "+myCalc.getY()+" = "+myCalc.add());
		}
		
		//Subtraction
		if(operator==2){
			System.out.println(myCalc.getX()+" - "+myCalc.getY()+" = "+myCalc.subtraction());
		}
		
		//Multiplication
		if(operator==3){
			System.out.println(myCalc.getX()+" * "+myCalc.getY()+" = "+myCalc.multiplication());
		}
		
		//Division
		if(operator==4){
			System.out.println(myCalc.getX()+" / "+myCalc.getY()+" = "+myCalc.division());
		}
		
	}
	
	

}
