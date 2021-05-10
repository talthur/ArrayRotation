package arrayrotation;

import java.util.ArrayList;
import java.util.List;

public class Rotation {
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		System.out.println(rotLeft(numbers, 3));
		
	}
	
	public static List<Integer> rotLeft(List<Integer> a, int d) {
		
		for (int i = 0; i < d; i++) {
				a.add(a.get(0));
				a.remove(0);
		}
		
		return a;

	    }

}
