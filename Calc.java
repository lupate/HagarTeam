public class Calc{
	
	Calc(){
		System.out.println("Instantianting an Object .. No Args");
	}
	
	public int add (int x, int y){
		return x + y;
	}
	
	public int sub (int x, int y){
		int res =  (x < y) ? x - y : 0;
		return res;
	}
	
	public static void main (String... argv){
		Calc calculator = new Calc();		
		System.out.println(calculator.add(10, 5));
		
		int result = calculator.sub(5, 15);
		if(result > 0)
			System.out.println(result);
		else
			System.out.println("Invalid subtraction attributes");
	}
}