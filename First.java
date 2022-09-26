class First
{

    static int Age=13;
    static String FirstName="Muskan";
    static String LastName="Lama";
     
     
     public static void Display()
     {
        System.out.println("Static method");
        System.out.println(FirstName+ " " +LastName +" " +Age);
        
        }
        
        static 
        { 
           System.out.println("Static block");
           System.out.println(FirstName+ " " +LastName +" " +Age);
          
          }
       
       public static void main(String args[])
        { 
          
          Display();
        
        }



}
