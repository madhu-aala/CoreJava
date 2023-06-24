package groceries;

import java.util.Scanner;

public class Products
{
	Scanner sc=new Scanner(System.in);
	int sum=0;
	void getProducts()
	{
		System.out.println("Welcome to Organic Store");
		System.out.println("-----------------------------");
		System.out.println("Available Products in the store");
		System.out.println("1) Fruits");
		System.out.println("2) Vegetables");
		System.out.println("3) Books");
		System.out.println("4) Dairy Products");
		System.out.println("-----------------------------");
		System.out.println("Please enter your choice");
		System.out.println("Enter your choice between 1 and 4");
		
		int choice=sc.nextInt();
		
		if(choice==1)
		{
			System.out.println("101 Mangoes 1 kg = ₹50");
			System.out.println("102 Apples 1 kg = ₹70");
			System.out.println("103 Bananas 1 Dozen = ₹50");
			System.out.println("104 Oranges 1 kg = ₹60");
			System.out.println("105 Grapes 1 kg = ₹55");
			System.out.println("--------------------------");
			System.out.println("Select Fruit Code");
			int a=sc.nextInt();

			switch(a)
			{
			case 101:
				System.out.println("How many kgs do you want?");
				int b=sc.nextInt();
				b=b*50;
				System.out.println("Press 1 for Continue");
				System.out.println("₹"+b);
				break;
			case 102:
				System.out.println("How many kgs do you want?");
				int b2=sc.nextInt();
				b=b2*70;
				System.out.println("₹"+b);
				break;
			case 103:
				System.out.println("How many dozens do you want?");
				int b3=sc.nextInt();
				b=b3*50;
				System.out.println("₹"+b);
				break;
			case 104:
				System.out.println("How many kgs do you want?");
				int b4=sc.nextInt();
				b=b4*60;
				System.out.println("₹"+b);
				break;
			case 105:
				System.out.println("How many kgs do you want?");
				int b5=sc.nextInt();
				b=b5*55;
				break;
			}

			System.out.println("Press 1 to continue shopping or press 2 for bill" );
			int s=sc.nextInt();
			if(s==1)
			{
				Products items =new Products();
				items.getProducts();
			}
		}

		else if(choice==2)
		{
			System.out.println("201 Tomato 1 kg = ₹50");
			System.out.println("202 Potato 1 kg = ₹70");
			System.out.println("203 Brinjal = ₹50");
			System.out.println("204 Radish 1 kg = ₹60");
			System.out.println("205 Cucumber 1 kg = ₹55");
			System.out.println("--------------------------");
			System.out.println("Select Vegetable Code");
			int a=sc.nextInt();

			switch(a)
			{
			case 101:
				System.out.println("How many kgs do you want?");
				int b=sc.nextInt();
				b=b*50;
				System.out.println("₹"+b);
				break;
			case 202:
				System.out.println("How many kgs do you want?");
				int b2=sc.nextInt();
				b=b2*70;
				if(b>=500) {
					float dis=(float) (b*0.5);
					float art=dis-b;
					System.out.println(art);
				}
				else
					System.out.println(b);
				System.out.println("₹"+b);
				break;
			case 203:
				System.out.println("How many dozens do you want?");
				int b3=sc.nextInt();
				b=b3*50;
				System.out.println("₹"+b);
				break;
			case 204:
				System.out.println("How many kgs do you want?");
				int b4=sc.nextInt();
				b=b4*60;
				System.out.println("₹"+b);
				break;
			case 205:
				System.out.println("How many kgs do you want?");
				int b5=sc.nextInt();
				b=b5*55;
				break;
			}

			System.out.println("Press 1 to continue shopping or press 2 for bill" );
			int s=sc.nextInt();
			if(s==1)
			{
				Products items =new Products();
				items.getProducts();
			}

		}

		else if(choice==3)
		{
			System.out.println("301 Rich Dad Poor Dad = ₹149");
			System.out.println("302 Atomic Habits = ₹249");
			System.out.println("303 Coffee Can Investing = ₹99");
			System.out.println("304 Intellegent Investor = ₹199");
			System.out.println("305 The Definimg Decade = ₹199");
			System.out.println("--------------------------");
			System.out.println("Select Book Code");
			int a=sc.nextInt();

			switch(a)
			{
			case 301:
				System.out.println("How many books do you want?");
				int b=sc.nextInt();
				b=b*149;
				System.out.println("₹"+b);
				break;
			case 302:
				System.out.println("How many books do you want?");
				int b2=sc.nextInt();
				b=b2*249;
				System.out.println("₹"+b);
				break;
			case 303:
				System.out.println("How many books do you want?");
				int b3=sc.nextInt();
				b=b3*99;
				System.out.println("₹"+b);
				break;
			case 304:
				System.out.println("How many books do you want?");
				int b4=sc.nextInt();
				b=b4*199;
				System.out.println("₹"+b);
				break;
			case 305:
				System.out.println("How many books do you want?");
				int b5=sc.nextInt();
				b=b5*59;
				break;
			}

			System.out.println("Press 1 to continue shopping or press 2 for bill" );
			int s=sc.nextInt();
			if(s==1)
			{
				Products items =new Products();
				items.getProducts();
			}
			else if(s==2)
			{
				int b = 0;
				int q = 0;
				while (b>=200)
				{
					int t=q*100; //t=total
					{
						int d=t*10/100; //d=discount
						System.out.println("Discount="+d);

						t=t*90/100;
						System.out.println("Net Amount="+t);
					}
				}
			}

			else if(choice==4)
			{
				System.out.println("401 Milk 1 packet = ₹30");
				System.out.println("402 Curd 1 packet = ₹30");
				System.out.println("403 Butter 1 packet = ₹50");
				System.out.println("404 Cheese 1 packet = ₹60");
				System.out.println("405 Ghee 1 packet = ₹55");
				System.out.println("--------------------------");
				System.out.println("Select Product Code");
				int a1=sc.nextInt();

				switch(a1)
				{
				case 401:
					System.out.println("How many kgs do you want?");
					int b=sc.nextInt();
					b=b*30;
					System.out.println("₹"+b);
					break;
				case 402:
					System.out.println("How many kgs do you want?");
					int b2=sc.nextInt();
					b=b2*30;
					System.out.println("₹"+b);
					break;
				case 403:
					System.out.println("How many dozens do you want ?");
					int b3=sc.nextInt();
					b=b3*50;
					if(b>=500){
						float discou=(float) (b3*0.5);
						float ass=discou-b3;
						System.out.println(ass);
					}
					else
					System.out.println("₹"+b);
					break;
				case 404:
					System.out.println("How many kgs do you want?");
					int b4=sc.nextInt();
					b=b4*60;
					System.out.println("₹"+b);
					break;
				case 405:
					System.out.println("How many kgs do you want?");
					int b5=sc.nextInt();
					b=b5*55;
					break;
				}

				System.out.println("Press 1 to continue shopping or press 2 for bill" );
				int s1=sc.nextInt();
				if(s1==1)
				{
					Products items =new Products();
					items.getProducts();
				}
			}
			else
				System.out.println("Invalid Choice");
		}
	}
	public static void main(String[] args)
	{
		Products items =new Products();
		items.getProducts();
	}
}