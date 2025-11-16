package pe.edu.tecsup._04.collections.list.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TestSort2 {
	
	public static void main(String args[]) {

		List<Integer> al = new ArrayList<Integer>();
		/*
		al.add(Integer.valueOf(201));
		al.add(Integer.valueOf(101));
		al.add(Integer.valueOf(230));
		*/
		
		al.add(201);
		al.add(101);
		al.add(230);
		al.add(1000);
				
		//Collections.sort(al);
        Collections.sort(al,Collections.reverseOrder());  

		for (Object object : al)
			System.out.println(object);
	
		
	}
}