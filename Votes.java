package hortari;
import java.util.*;

public class Votes {
	public static void countvotes(String votes[]){
			Map<String,Integer> maps= new TreeMap<>(Collections.reverseOrder());
			for(String count : votes) {
				if(maps.containsKey(count)) {
					//System.out.println("Step 1" + maps.put(count, maps.get(count)+1));
					maps.put(count, maps.get(count)+1);
			} else {
				
				//System.out.println("STEP 0" + maps.put(count,  1));
				maps.put(count,  1);
			}
	}
			System.out.println("Election winner is " + Collections.max(maps.entrySet(), Map.Entry.comparingByValue())
	                .getKey());
			
	}

  public static void main(String[] args) {
	  String[] votes = {"raj","ram","raj","lalith","hortari","ram"};
	countvotes(votes);
  }
}