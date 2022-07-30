package ques1.buildingSkyscraper;
import java.util.*;


public class BuildSkyscraper
{
	PriorityQueue<Integer> PQueue=new PriorityQueue<>(Collections.reverseOrder());
	int []day;
	
	public void FloorCount(int f)
	{	
		int size;
		Scanner sc=new Scanner(System.in);
		day=new int[f];
		for(int i=0;i<f;i++)
		{
			System.out.println("enter the floor size given on day:"+(i+1));
			size=sc.nextInt();
			day[i]=size;
			PQueue.offer(size);
		}
	sc.close();
	}
	
	public void Construction()
	{	
		Queue<Integer> pq = new PriorityQueue<>();
		System.out.println("The order of construction is as follows");
		
		for(int i=0;i<day.length;i++)
		{
			System.out.println("Day:"+(i+1));
			pq.add(day[i]);
			while(pq.contains(PQueue.peek()))
			{
				System.out.print(PQueue.poll()+" ");
			}
			System.out.println(" ");
		}
	}
	
}


