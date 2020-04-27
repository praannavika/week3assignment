import java.util.Scanner;

public class command_line1runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println("enter n");
    	 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();     
		int arr[]=new int[n];
		command_line1 cl=new command_line1();
		cl.displaydata(arr,n);

	}

}
