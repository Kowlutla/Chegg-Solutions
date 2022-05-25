
import java.util.*;
public class GradeList {

	public static void main(String[] args) {
		
		List<Integer>grades=new ArrayList<Integer>();
		grades.add(10);
		grades.add(15);
		grades.add(30);
		grades.add(5);
		grades.add(12);
		grades.add(18);
		grades.add(13);
		grades.add(14);
		
		GradeList list=new GradeList();
		double average=list.getAverage1(grades);
		System.out.println("Average of grades: "+average);
		
		average=list.getAverage2(grades);
		System.out.println("Average with out two minimums: "+average);
		
		System.out.println("Median: "+list.getMedian(grades));
		

	}

	public  double getAverage1(List<Integer> grades) {

		double sum=0;
		for(int i=0;i<grades.size();i++)
		{
			sum+=grades.get(i);
		}
		
		return sum/grades.size();
	}

	
	public  double getAverage2(List<Integer> grades)
	{
		Collections.sort(grades);
		double sum=0;
		if(grades.size()<=2)
		{
			return 0;
		}
		else
		{
			for(int i=2;i<grades.size();i++)
			{
				sum+=grades.get(i);
			}
		}
		return sum/(grades.size()-2);
	}
	
	public  double getMedian(List<Integer>grades)
	{
		Collections.sort(grades);
	    int n=grades.size();
	    if (n % 2 != 0)
	    {
		       return (double)grades.get(n/2); 
	    }
	    return (double)(grades.get((n-1)/2) + grades.get(n/2))/2.0; 
	}
}


