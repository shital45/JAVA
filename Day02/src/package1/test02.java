package package1;

import java.util.Scanner;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        System.out.println("enter the roll No: ");
        System.out.println(sc.nextInt());
        
        System.out.println("Student Name: ");
        System.out.println(sc.next());
        
        System.out.println("Enter the marks of the 3 sub");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         System.out.println(a);
         System.out.println(b);
         System.out.println(c);
         System.out.println("the total of the subjects is ");
         int total=a+b+c;
         System.out.println(total);
         System.out.println("the avrg of sub is ");
          int avrg=(a+b+c)/3;
          System.out.println(avrg);
	}

}
