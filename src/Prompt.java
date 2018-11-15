
public class Prompt {
	
		private double x;
		private double y;
		private double sum;
		private double product;
		private double division;
		private double difference;
		
		public Prompt(){
			x=0;
			y=0;
		}
		
		//******************************************************************************
		public double getX(){
			return x;
		}
		
		public double getY(){
			return y;
		}
		
		//******************************************************************************
		public double setX(double a){
			x=a;
			return x;
		}
		
		public double setY(double b){
			y=b;
			return y;
		}
		
		
		//******************************************************************************
		public double add(){
			
			sum=x+y;
			return sum;
		}
		
		public double subtraction(){
			
			difference=x-y;
			return difference;
		}
		
		public double multiplication(){
			
			product=x*y;
			return product;
		}
		
		public double division(){
			
			division=x/y;
			return division;
		}
}

