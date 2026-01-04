import java.util.*;
class array
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		int i=0,j=0,size;
		System.out.print("enter size : ");
		size=sc.nextInt();
		int a[]=new int[size];
		
		for(i=0;i<size;i++)
		{
			System.out.print("enter values : ");
			a[i]=sc.nextInt();
		}
		for(i=0;i<size;i++)
			System.out.print(a[i]+" ");
		int max=a[0];
		for(i=0;i<size;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.print("max value is  : "+max);
	}
}