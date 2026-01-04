import java.util.Scanner;
class User
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner (System.in);
		int age =Integer.parseInt(args[0]);
		boolean eligibility;
		String address,name;
		long mob;
		double weight;
		if (age>18)
		{
			System.out.println("Enter your name");
			name=sc.nextLine();
			System.out.println("Enter your mob NO");
			mob = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter your address");
			address = sc.nextLine();
			System.out.println("Enter your weight");
			weight = sc.nextDouble();
			
			if (weight>50)
			    eligibility = true;
			else
				eligibility = false;
			System.out.println(name);
			System.out.println(mob);
			System.out.println(address);
			System.out.println(weight);
			System.out.println(eligibility);
		}
		else
			System.out.println("Not Eligible");
	}
}