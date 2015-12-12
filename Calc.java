public class Calc{
	
	Calc(){
		System.out.println("Instantianting an Object .. No Args");
	}
	
	public int add (int x, int y){
		return x + y;
	}
	
	public int sub (int x, int y){
		if( x < y)
			return x - y;
		else
			return 0;
	}
	
	public static void main (String... argv){
		Calc calculator = new Calc();		
		System.out.println(calculator.add(10, 5));
		
		int result = calculator.sub(5, 15);
		if(result > 0)
			System.out.println(result);
		else
			System.out.println("Your subtraction (first - Second) >> first must be greater than Second");
	}
}