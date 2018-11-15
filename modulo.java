import java.util.Scanner;


public class modulo {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int x, y;
		System.out.print("Please enter key: ");
		x = s.nextInt();
		//System.out.print("Please enter modulo: ");
		//y = s.nextInt();
		y=7;
		
		System.out.print(x+" % "+y+" = "+x%y);
		
	}
}
