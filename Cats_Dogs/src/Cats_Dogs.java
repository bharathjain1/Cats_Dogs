import java.util.*;
public class Cats_Dogs {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the test cases");//Enter the test cases
		int t=sc.nextInt();
		System.out.println("enter the cat,dog,legs");//Enter the values
		for(int i=0;i<t;i++)
		{
			int c=sc.nextInt();    
			int d=sc.nextInt();
			int l=sc.nextInt();
			
			int k=(c+d)*4;  // K denotes the maximum legs both cats and dogs can have
			int p=0;   
			
			if(c<=2*d)
			{
				p=4*d;
			}
			else					// p denotes minimum leg both can have.
			{
				p=(c-d)*4;
			}
			
			if(l%4==0 && l<=k && l>=p)   //legs should be more than more or multiple of 4 and more than min , less than max.
            {
                System.out.println("yes");
            }
            
            else
            {
                System.out.println("no");
            }
			
			
		}

	}

}
