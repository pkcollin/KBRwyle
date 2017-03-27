
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;



//import java.util.*;
public class Collections {

	public static void main(String[] args){
		
//PHASE ONE
		//Create 2 collections. ArrayList was chosen honestly for it's ease of use and familiarity. 
		//I have used ArrayList for most of my projects as it's iterable and simple to use
		//
		ArrayList<Integer> one = new ArrayList<Integer>();
		one.add(2);
		one.add(9);
		one.add(6);
		one.add(10);
		one.add(3);
		one.add(5);
		one.add(4);
		one.add(1);
		one.add(7);
		one.add(8);
			
		ArrayList<Integer> two = new ArrayList<Integer>();
		two.add(15);
		two.add(7);
		two.add(12);
		two.add(11);
		two.add(13);
		two.add(10);
		two.add(8);
		two.add(6);
		two.add(14);
		two.add(9);

		
		//Print them
		for(int i = 0; i<one.size(); i++){
			if(i == one.size() - 1){System.out.println(one.get(i));}
			else System.out.print(one.get(i) + ", ");
			
		}
		for(int i = 0; i<two.size(); i++){
			if(i == two.size() - 1){System.out.println(two.get(i));}
			else System.out.print(two.get(i) + ", ");
		}
		
		//Print sizes
		System.out.println("Size one: "+ one.size());
		System.out.println("Size two: "+ two.size());
		
//PHASE TWO
		//Third collection, no duplicates. Same as before, ArrayLists are very easy to manipulate as they can be ordered, 
		//but ordering doesn't matter, as opposed to like a queue or stack
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int a: one){list.add(a);}
		for(int a: two){if(!list.contains(a)){list.add(a);}}
		
		//Sort it
		for(int i =0; i <list.size() - 1; i++){
			for(int j = 1; j< list.size(); j++){
				if(list.get(j) < list.get(i)){
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
				}
			}
		
		//Remove Middle Element
		list.remove(list.size()/2);
		
		//Print it reversed
		for(int i = list.size() - 1; i >= 1; i--){
			
			System.out.print(list.get(i) + ", ");
			if(i == 1){System.out.println(list.get(i-1));}
		}
		//Print size
		System.out.println("Size: " + list.size());
		
//PHASE THREE	
		//Key Value Collection. Hashmap was used because they have a key and a value. They also cannot have duplicates
		//Although I check anyways, and am using this as opposed to something like a treemap because ease of retrievability 
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(0, "snake");
		hmap.put(2, "human");
		hmap.put(4, "dog");
		hmap.put(6, "ant");
		hmap.put(8, "spider");
		
		
		hmap.put(2, "human");
		
		//make an array of the values and search through it. If there is a duplicate remove it
		Collection<String> values = hmap.values();
		int h = 0;
		for(String s: values){
			if(s.equals("human")){h++;}
		}
		if(h>1){
			System.out.println("2 + " + hmap.get(2));
			hmap.remove(2);}
		
		System.out.println(hmap.size());
		
		}//end main
	}//end class
	
	

	
