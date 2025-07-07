// Strings

// String Concatenation
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String firstName = sc.nextLine();
	    String lastName = sc.nextLine();
	    int num = 21;
	    System.out.println("Hello "+firstName+" "+lastName); // String Concatenation ( manual )
	    System.out.println(firstName.concat(lastName)); // String Concatenation ( using concat method )
	    System.out.println(firstName+num);     // Java Numbers and Strings
	    System.out.println(firstName+"\n"+"\t"+lastName); // String Special Characters
	}
}

/* 
Sample Input:
santosh kumar
gubbala

Sample Output:
santosh kumar gubbala
santosh kumar gubbala
santosh kumar21 
santosh kumar
    gubbala
*/
