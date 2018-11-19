package hortari;
import java.util.*;


public class RemoveDuplicates {
	public static void main(String[] args) {
	int[] num = {1,9,3,4,5,6,7,8,9,0,1,2,1,2,4,3,8, 0};
	Duplicate(num);
	}
	
	public static void Duplicate(int num[]) {
		Set<Integer> set=new LinkedHashSet<Integer>();
		//Set<Integer> set=new HashSet<Integer>();
		int[] numbers = num;
		for(int i=0; i<numbers.length;i++) {
			if(!set.contains(numbers[i]))
				set.add(numbers[i]);
			
		}
		System.out.println(set);
		
		
	}
}
