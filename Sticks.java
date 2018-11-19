package hortari;

import java.util.*; 
 public class Sticks {

	public static void main(String[] args) {

	    ArrayList<Integer> al=new ArrayList<>();
	    al.add(1);
	    al.add(1);
	    al.add(2);
	    al.add(3);
           Collections.sort(al);
	   
	    for(int i=0; i<al.size(); i++){
	        if(al.get(0)==0){al.remove(0); i=-1; continue;}
	        System.out.println(al.size());
	        int min=al.get(0);
	        for(int j=0; j<al.size(); j++){       
	            al.set(j, al.get(j)-min);
	        }
	    }
	}
	}

