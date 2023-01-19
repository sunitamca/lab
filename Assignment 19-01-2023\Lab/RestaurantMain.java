package restraurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantMain {

	private static final Restaurant Restaurant = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id;
		
		Map<Integer,Restaurant> map = new HashMap <Integer,Restaurant>();
		
		map.put(1, new Restaurant("Chicken Biryani",130));
		map.put(2, new Restaurant("Paneer Butter masala",120));
		map.put(3, new Restaurant("Fried Chicken momo",80));
		map.put(4, new Restaurant("Chicken manchurian",110));
		map.put(5, new Restaurant(" Special msala Dosa",70));
		map.put(6, new Restaurant("Mushroom Chilli",130));
		
		System.out.println("Welcome to C3805 Restaurant");
		System.out.println("****************************");
		System.out.println("MENU");
		System.out.println("*********");
		System.out.println("ITMS\t\t\tPRICE");
		
		for(Map.Entry em: map.entrySet())
		{
			Restaurant rest = (Restaurant) em.getValue();
			System.out.println(em.getKey()+")");
			rest.display();
		}
		System.out.println();
		do {
			System.out.println("Enter food id:");
			id = sc.nextInt();
			Restaurant rest = map.get(id);
			Billing.order(rest.getFname(), rest.getPrice());
			
			Billing.cont();
		}while(true);
		
	}

}
