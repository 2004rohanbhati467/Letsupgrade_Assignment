import java.util.*;  
class Demo
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		int sum=0;
		for(int i=0;i<5;i++){
		  	num=sc.nextInt();
				sum += num;
			}
		System.out.println("Sum of five integer is : "+sum);
	}
}
