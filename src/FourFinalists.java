import java.util.Random;

public class FourFinalists {

	public static void main(String[] args) {
		Random rand=new Random();
		//initializing all finalist to 0
		int num,finalist1=0,finalist2=0,finalist3=0,finalist4=0;
		do 
		{
			//read random number from 1 to 25
			num=1+rand.nextInt(25);
			//if finalist1 not fixed then fix num to finalist 1
			if(finalist1==0)
			{
				finalist1=num;
			}
			
			/*if finalist1 is not the current number and finalist 2 is not fixed
			 * Then fix the current number to finalist 2
			*/
			else if(finalist2==0 && finalist1!=num)
			{
				finalist2=num;
			}
			/*if finalist1 and finalist2 are not the current number and finalist 3 is not fixed
			 * Then fix the current number to finalist 3
			 * */
			else if(finalist3==0 && finalist1!=num && finalist2!=num)
			{
				finalist3=num;
			}
			
			/*if finalist1,finalist2 and finalist3 are not the current number and finalist4 is not fixed
			 * Then fix the current number to finalist4
			 * */
			else if(finalist4==0 && finalist1!=num && finalist2!=num && finalist3!=num)
			{
				finalist4=num;
			}//do above till we fix the all four finalists
		}while(finalist1==0 || finalist2==0 ||finalist3==0 || finalist4==0);
		
		//print finalists
		System.out.println("Finalist1: "+finalist1);
		System.out.println("Finalist2: "+finalist2);
		System.out.println("Finalist3: "+finalist3);
		System.out.println("Finalist4: "+finalist4);
	}
}
