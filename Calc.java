public class Calc{
	
	Calc(){
		System.out.println("Instantianting an Object .. No Args");
	}
	
	public int add (int x, int y){
		return x + y;
	}
	
	public static void main (String... argv){
		Calc calculator = new Calc();		
		System.out.println(calculator.add(10, 5));
	}
}