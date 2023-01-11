//print the element of linked list using for each loop and while loop

package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Arraylist {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();
		
		name.add("Amrita");
		name.add("Priya");
		name.add("Rahul");
		name.add("Sunita");
		
		System.out.println(name);
		System.out.println();
	    System.out.println("using for each loop:");
		for(String s:name)
		{
			System.out.println(s);
		}
		
		System.out.println();
		
		System.out.println("Using while loop:");
		int count=0;
		while(count<name.size())
		{
			System.out.println(name.get(count));
			count++;
		}
		System.out.println();
		
		System.out.println("Using iterator:");
		Iterator itr = name.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		System.out.println("Performing adding opearations:");
		name.addFirst("Sunita");//adding at first position
		name.addLast("Suborno");//adding from last position
		name.add(2, "Lokesh");//adding at index 2
		System.out.println(name);
		
		System.out.println();
		System.out.println("Performing removing opearations:");
		name.removeFirst();//removing at first position
		name.removeLast();//removing from last position
		name.remove(2);//removing at index 2
		System.out.println(name.remove("Lokesh"));//removing using object
		System.out.println(name);
		
		System.out.println();
		name.set(1, "Lokesh");
		System.out.println(name);
		//String name = names.get(0);
		//String.out.println(name);
		System.out.println(name.get(2));
		System.out.println(name);
		
		name.removeAll(name);
		System.out.println(name);
		
		name.clear();//it clears the linked list and marks it empty
		System.out.println(name);
		
		ListIterator listit = name.listIterator();
		System.out.println("Foeward direction");
		while(listit.hasNext())
		{
			System.out.println(listit.next());
		}
		System.out.println();
		
		System.out.println("Backward direction:");
		while(listit.hasPrevious())
		{
			System.out.println(listit.previous());
		}
		System.out.println();
		
		System.out.println("Printing in reverse using descending iterator:");
		Iterator itr1 = name.descendingIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a name to check:");
//		String str = sc.next();
//		//checking the contents using if loop using contains keyword
//		if(name.contains(str))
//		{
//			System.out.println("Data is present");
//		}
//		else
//		{
//			System.out.println("Data is not present");
//		}
		
		name.add("Sabdick");
		System.out.println(name);
		System.out.println(name.lastIndexOf("Rahul"));
		
		name.add("Priya");
		System.out.println(name);
		
		System.out.println("Element popped: "+name.pop());
		System.out.println(name);
		
		System.out.println("Element poll: "+name.poll());
		System.out.println(name);
			
		System.out.println("Element poll: "+name.pollFirst());
		System.out.println(name);
		
		System.out.println("Element poll: "+name.pollLast());
		System.out.println(name);
		
		name.push("Sandeep");
		name.push("Arnab");
		//convert linked list into array list
		List<String> arlist = new ArrayList<>(name);
		System.out.println("Converting linked list to array list:");
		System.out.println(name);
		
		System.out.println();
		//convert linked list into array
		String array[] = name.toArray(new String[name.size()]);
		System.out.println("Converting linked list to array:");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		}
			
		}
		
		

	


