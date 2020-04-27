import java.util.Scanner;
public class problem2 {
	private int l;
	private int a[]=new int[l];
	problem2(int a[], int l){
		this.l=l;
		this.a=a;
		
		
		
	}

//Scanner sc =new Scanner(System.in);
	//int n=sc.nextInt();
	//int arr[]=new int[n];
	void read()
	{
		for(int i=0;i<l;i++)
		{
			Scanner sc =new Scanner(System.in);
			int n1=sc.nextInt();
			a[i]=n1;
			
		}
		
		
	}
	void display()
	{
		for(int i=0;i<l;i++)
		{
			System.out.println( "elements are" +" "+ a[i] );
		}
	}
	void sort()
	{
		for(int i=0;i<l;i++)
		{
					    for ( int j = 0; j < l-i-1; j++)  
		        if (a[j] > a[j+1])  
		        {
		        	int k=a[j];
		        	a[j]=a[j+1];
		        	a[j+1]=k;}
		        }
		System.out.println("soretd elemnts are");
		for(int i=0;i<l;i++)
		{
			System.out.println(" "+a[i]);
		}
		}
	void search()
	
	{System.out.println("enter element to search");
	Scanner sc =new Scanner(System.in);
	int s=sc.nextInt();
		int k=0;
		for(int i=0;i<l;i++)
		{
			if(a[i]==s)
			{k=1;
				System.out.println("found");
				break;
			}}
			if(k==0)
				System.out.println("not found");
			
		
	}
}
