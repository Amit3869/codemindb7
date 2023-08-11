package amitproject;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.TreeSet;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> L1 = new LinkedList<>();
		L1.add(100);
		L1.add(200);
		L1.add(300);
		L1.add(400);

		for(Integer i:L1) {
			System.out.println(i);
		}
		LinkedList<Integer> L3 = new LinkedList<>();
		L3.add(600);
		L3.add(700);
		L3.add(800);
		L3.add(900);
		
		for(Integer i: L3){
			System.out.println(i);
			
		}
		
		
		L1.addAll(L3);
		for(Integer i:L1) {
			
		System.out.println(i);
		}
		System.out.println("****************************************************************");
		
		L1.removeAll(L3);
		for(Integer i:L1) {
			System.out.println(i);
		}
		System.out.println("################################################################");
		System.out.println("At Index 2 Value is:" +L3.get(2));
		System.out.println("Size of Array :" +L3.size());
		System.out.println("List L3 Contain 400: " +L3.contains(400));
		System.out.println("L3 is Empty:"+L3.isEmpty());
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		LinkedList<Character> L4 = new LinkedList<>();
		L4.add('A');
		L4.add('D');
		L4.add('A');
		L4.add('R');
		L4.add('S');
		L4.add('H');
		
		Iterator<Character> it=L4.iterator();
		while(it.hasNext()) {
			
			System.out.print(it.next());
			
		}
		System.out.println();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		TreeSet<Character> hashSet = new TreeSet<>();
		hashSet.add('M');
		hashSet.add('A');
		hashSet.add('S');
		hashSet.add('T');
	
		Iterator<Character> it1 = hashSet.descendingIterator();

		while (it1.hasNext()) {
			System.out.print(it1.next());
		}
		
	}
}
	
