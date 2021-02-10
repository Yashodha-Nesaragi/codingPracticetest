package question1;
import java.util.Scanner;

public class AgeDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		int ad=0;
		int s=0;
		Scanner var = new Scanner(System.in);
		System.out.print("Enter no. of people you want in array:");
		int n = var.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the ages of people:");
		for(int i = 0; i < n; i++)
		{
			a[i] = var.nextInt();    
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]<18)
			{
				c++;
			}
			else if(a[i]>=18 && a[i]<=54)
			{
				ad++;
			}
			else
			{
				s++;
			}

		}

		System.out.println("Children: "+c);
		System.out.println("Adult: "+ad);
		System.out.println("Senior Citizen: "+s);





	}
	//34,78,56,7,12,67,20,50}
}
