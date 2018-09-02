
public class IfElse {

	public static void main(String[] args) {
		int int1 = 5;
		int int2 = 6;
		
		if (int1 < int2) 
		{
			System.out.println("int1 ist kleiner als int2");
		}
		
		boolean bool = true;
		
		if(bool == true) 
		{
			System.out.println("bool ist true");
		}
		if(bool) 
		{
			System.out.println("bool ist true");
		}
		
		bool = 7 >= 8;
		
		if(!bool) 
		{
			System.out.println("bool ist false");
		}else 
		{
			System.out.println("bool ist true");
		}

	}

}
