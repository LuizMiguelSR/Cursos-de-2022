package application;

public class Program {

	public static void main(String[] args) {

		int x = 20;
		
		//Object obj = x;
		
		Integer obj = x; //usando wrapper classes � poss�vel fazer boxing e unboxing de forma mais simples
		
		System.out.println(obj);
		
		//int y = (int) obj;
		
		int y = obj * 2; //com wrapper classes � poss�vel fazer opera��es sem converter
		
		System.out.println(y);

	}

}
