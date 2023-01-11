package collection;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(5);
		
		vec.add("Riya");
		vec.add("Reeti");
		vec.add("saniya");
		vec.add("sarita");
		vec.add("Neha");
		
		System.out.println(vec);
		System.out.println("Size of vector "+vec.size());
		System.out.println("Default capacity: "+vec.capacity());
		
		System.out.println();
		
		vec.addElement("Sunita");
		vec.addElement("geeta");
		System.out.println("Size of vector "+vec.size());
		System.out.println("Default capacity: "+vec.capacity());
		

	}

}
