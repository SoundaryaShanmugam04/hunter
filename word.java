package shiva;

import java.util.Scanner;

public class word {
public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter ther string");
	 String in=s.next();
	 System.out.println("enter the str 2");
	 String su=s.next();
	 String sp[]=in.split("su");
	 int le=sp.length;
	 String out=" ";
	 if(le%2==0)
	 {su
		 for(int i=0;i<le;i++)
		 {
			 out=sp[i]+su;
		 }
	 }
	 
}
}
