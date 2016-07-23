package aa;
import java.util.Scanner;

public class evenodd {
	public static void main(String[] args){
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("even no");
		}
		else{
			System.out.println("odd no");
		}
	}

}