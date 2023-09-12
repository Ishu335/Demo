
import java.util.*;
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		System.out.println("\nEnter the Process Count:- ");
		//int process_count=S.nextInt();
		int process_count=5;
		int process_id[]=new int[process_count];
		int process_ar[]=new int[process_count];
		int process_bt[]=new int[process_count];
		int process_ct[]=new int[process_count];
		int process_ta[]=new int[process_count];
		int process_wt[]=new int[process_count];
		System.out.print("\n Enter the Values:- ");
//		for (int i=0;i<=process_count;i++)
//		{
//			System.out.println("Enter the Process ID:- ");
//			process_id[i]=S.nextInt();
//			System.out.println("Enter the Process Arrival Time:- ");
//			process_ar[i]=S.nextInt();
//			System.out.println("Enter the Process Burst Time:- ");
//			process_bt[i]=S.nextInt();
//		}
//		int temp;
//		for(int i=0;i<=process_count;i++)
//		{
//			if(process_ar[i]>process_ar[i+1])
//			{
////				Arrivel Time
//				temp=process_ar[i];
//				process_ar[i]=process_ar[i+1];
//				process_ar[i+1]=temp;
////				Process Id
//				temp=process_id[i];
//				process_id[i]=process_id[i+1];
//				process_id[i+1]=temp;
//				temp=process_ar[i];
////				Brust time
//				process_bt[i]=process_bt[i+1];
//				process_bt[i+1]=temp;
//				
//			}
//		}

		System.out.println("\n\t| Process Id    |Arrival Time   |Brust Time     | ");
		for(int i=0;i<=process_count;i++)
		{
			System.out.println("\t|"+process_id[i]+"\t\t|"+process_ar[i]+"\t\t|"+process_bt[i]+"\t\t|");
		}
		}
//	  +++++++++++++++++++++++++++++++++++++++++++++++++++++++ CT=At+BT ++++++++++++++++++++++++++++++++++++++++	
	System.out.println("\n\t| Process Id    |Arrival Time   |Brust Time     |CT     | ");
	int CT=0;
	for(int i=0;i<=process_count;i++)
	{	if(i==0)
		{
			CT=process_ar[i]+process_bt[i];
		}
		CT=CT+process_ar[i];
		System.out.println("\t|"+process_id[i]+"\t\t|"+process_ar[i]+"\t\t|"+process_bt[i]+"\t\t|"+CT);
	}
	}
	}

