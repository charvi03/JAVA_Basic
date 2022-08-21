import java.util.Scanner;
class smallest_number{
		public static void main(String args[]){
		Scanner sc= new Scanner(System.in);  
               int a,b,c,d;
                 System.out.println("Enter four numbers");
                 a=sc.nextInt();
                 b=sc.nextInt();
                 c=sc.nextInt();
                 d=sc.nextInt();
         
      	if(a<b && a<c && a<d)
                                {
          	               System.out.println(a+" is smallest number");
                                  }
		  else if (b<a && b<c && b<d)
                                {
                           System.out.println(b +" is smallest number");
                                  }
               else if(c<a && c<b && c<d)
                                    {
            		    System.out.println(c+" is smallest number");
                                   }
		      else if (d<a && d<b && d<c)
                                      {
			           System.out.println(d+" is smallest number");
			                    }                    

	}

}
