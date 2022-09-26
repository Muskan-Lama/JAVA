import java.util.*;
class Menu {
		
	
		public static  void Area(float r)
		
		{
			
			 System.out.printf("Area : %.2f",3.14*r*r);
		}
		
		public static void Circumference(float r)
		{
			System.out.printf("Circumference : %.2f",2*3.14*r);
			
		}
		
	
			public static void main(String args[])
			{
				Scanner x=new Scanner(System.in);
				System.out.println("      MENU     ");
				System.out.println("1. Calculate Area of Circle"+ "\n"+
				       "2. Calculate Circumference of a Circle" +"\n"+
						"3. Exit." +"\n"+
						"Choose an option (1-3):");

				System.out.println("Enter choice");
				int c=x.nextInt();
				System.out.println("Enter radius");
				float r=x.nextFloat();
				
				switch(c)
				{
				case 1:
					Menu.Area(r);
					break;
					
				case 2:
					Menu.Circumference(r);
					break;
				case 3:
					System.exit(0);
				}
			}
	

}

