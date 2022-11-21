package basics;

import java.util.Scanner;
class elect_bill{ 
                
        public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);  
          int a;
            System.out.println("enter the units consumed");
             a=sc.nextInt();
             float bill=0;
      	
        	if(a<=100)
	                     {
	                    bill= a;
	                             }
			else if(a<=200)
	                       {
	                 bill=100+(a-100)*2;
	                             }
			else if(a<=300)
	                           {
	                       bill=300+(a-200)*3;
	                                }
             else if(a>301)
	                           {
	                       bill=600+(a-300)*5;
	                                  }
       
	          System.out.println(" Total bill to pay is Rs.: " + bill); 

       } 
   }