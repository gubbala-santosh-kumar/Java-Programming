// if else else if 
public class Main
{
	public static void main(String[] args) {
	    int num1 = 49;
	    int num2 = 1;

    // if else else if 
	    if(num1>num2){
	        System.out.println(num1+" is big.");
	    }
	    else if(num1==num2){
	        System.out.println(num1 +" and "+num2+" equal.");
	    }
	    else{
	        System.out.println(num2+" is big.");
	    }

    // Short Hand if...else
    String result = (num1>num2) ? num1+" is big." : num2+" is big";
    System.out.println(result);
	}
}
