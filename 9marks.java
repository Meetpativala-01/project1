import java.util.*;
class MovieDinner
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int md,mae,fare,tickets;
		String movie;
		System.out.println("Enter true to procced ahead");
		String a = sc.nextLine();
		if (true)
		{
		   System.out.println("Press 1 for movie and press 2 for dinner");
           md = sc.nextInt();
           
        if(md==1)
		{  System.out.println("Enter name of movie");
            movie = sc.nextLine();
			System.out.println("Price of 1 ticket is 200 rupees");
            System.out.println("Which show whould you like to go: Morning, Afternoon OR Evening ");
            System.out.println("press 1 for morning and you will get extra 20% dis"+"press 2 for afternoon and you will get extra 10% dis"+"Press 3 for evening NO DISCOUNT");
			mae = sc.nextInt();
			if(mae==1)
			{	System.out.println("How many tickets do you want to book for morning show");
			    tickets = sc.nextInt();
				System.out.println("Total amount to be paid:"+(200*tickets)(200*tickets)*20/100);
			}	
			
		} 			
	}
		}
}