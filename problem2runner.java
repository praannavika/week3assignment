import java.util.Scanner;
public class problem2runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter n");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n]; 
		problem2 pb=new problem2(arr,n);
		pb.read();
		pb.display();
		pb.sort();
		pb.search();
		
	}

}
