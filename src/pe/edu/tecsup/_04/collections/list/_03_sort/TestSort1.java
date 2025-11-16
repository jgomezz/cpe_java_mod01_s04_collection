package pe.edu.tecsup._04.collections.list._03_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class TestSort1 {
	
	public static void main(String args[]) {

		List<String> al = new ArrayList<String>();
		al.add("Jose");
		al.add("Zevallos");
		al.add("Pedro");
		al.add("Alberto");
		al.add("Samir");
		al.add("Angel");

		Collections.sort(al); // Ordenados en forma alfabetica.
        //Collections.sort(al,Collections.reverseOrder());

		for (String s : al) 
			System.out.println(s);
	}
}