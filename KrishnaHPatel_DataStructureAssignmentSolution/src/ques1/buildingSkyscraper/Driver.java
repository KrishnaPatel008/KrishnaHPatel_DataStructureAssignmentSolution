package ques1.buildingSkyscraper;
import java.util.Scanner;
public class Driver 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int floor=sc.nextInt();
		BuildSkyscraper bs=new BuildSkyscraper();
		bs.FloorCount(floor);
		bs.Construction();
		sc.close();

	}
}
