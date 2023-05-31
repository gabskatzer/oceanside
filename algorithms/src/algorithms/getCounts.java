package algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class getCounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(7);
		list.add(3);
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int element: list) {
			if(map.get(element) != null) {
				map.put(element, map.get(element) + 1);
			}else {
				map.put(element, 1);
			}
		}
		for(int element: map.keySet()) {
			System.out.println(element + " -> " + map.get(element));
		}
		
		
		
		int result = 0;
		for(int element: list) {
			if(element == 3) {
				result++;
			}
		}
		
		
	}

	
}
