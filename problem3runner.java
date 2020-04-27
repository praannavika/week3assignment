import java.util.Scanner;
public class problem3runner {

	public static void main(String[] args) {
		System.out.println("enter n");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n]; 
		System.out.println("enetr elements to convert");
		for(int i=0;i<n;i++)
		{//System.out.println("enetr elements to convert");
			Scanner sc1 =new Scanner(System.in);
			int n1=sc1.nextInt();
			a[i]=n1;
			
		}
		problem3 pb=new problem3( a, n);
		pb.conversion();

	}

}
