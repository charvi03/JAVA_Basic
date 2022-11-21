import java.util.Scanner;
class largest_number{
		public static void main(String[] args){
		Scanner sc= new Scanner(System.in);  
          int a,b,c,d;
          System.out.println("enter four numbers");
          a=sc.nextInt();
          b=sc.nextInt();
          c=sc.nextInt();
          d=sc.nextInt();
         
      	if(a>b && a>c && a>d){
          	System.out.println(a+" is greatest number");
            }
		else if (b>a && b>c && b>d){
                System.out.println(b +" is greatest");
            }
           else if(c>a && c>b && c>d){
            		System.out.println(c+" is greatest");
            }
		else if (d>a && d>b && d>c){
			System.out.println(d+" is greatest");
			}                    

	}

}

/*
units/charge  
1-100 -> rs 1 /unit
101-200 -> rs 2/ unit
201 -300 -> rs 3/unit
301 + -> rs 5 per unit 

*/