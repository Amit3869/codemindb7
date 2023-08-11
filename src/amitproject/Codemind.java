package amitproject;
import java.util.HashMap; 
public class Codemind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to Codemind Technologies";  
		//HashMap char as a key and occurrence as a value  
		HashMap <Character, Integer> C1 = new HashMap<>();  
		for (int i = str.length()- 1; i >= 0; i--)   
		{  
		if(C1.containsKey(str.charAt(i)))   
		{  
		int count = C1.get(str.charAt(i));  
		C1.put(str.charAt(i), ++count);  
		}   
		else   
		{  
		C1.put(str.charAt(i),1);  
		}  

		}
		
		System.out.println("The Character Count:"+C1);  
		  
	}

}