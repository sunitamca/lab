//WAP to count the no. of occurance of a character

package arrayprogames;

public class OccuranceNoString {

	public static void main(String[] args) {
		 
		{
			String input = "aaaabbccAABBCCDD";
			char search = 'a';
			
			int count=0;
			for(int i=0;i<input.length(); i++)
			{
				if(input.charAt(i)==search)
					count++;
			}
			
			System.out.println("The Character '"+search+"'appears" +count+ "times.");
		}

	}

}
