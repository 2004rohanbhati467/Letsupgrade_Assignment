import java.util.*;  
class Demo
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		num=sc.nextInt();
		if(num>0){
			System.out.println("Positive");
	  }
	  else if(num<0){
	  		  System.out.println("Negative");
	       }
	      else{
	        System.out.println("Zero");
	      }
	  }
}