
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class BuzzPlayer {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		//starting number
		int start;
		
		//store the track of each game
		HashMap<Integer,ArrayList<String>>track=new HashMap<Integer,ArrayList<String>>();
		
		char query;//to ask play next game or not
		
		int game=1;//to hold the game number
		int highestScore=Integer.MIN_VALUE;//highest score
		int lowestScore=Integer.MAX_VALUE;//lowest score
		double averageScore=0;//average score
		boolean playMore=true;//to check want to play more games
		
		while(playMore)
		{
			//starting number
			System.out.print("Enter starting number: ");
			start=sc.nextInt();
			//to hold the score for each game
			int score=0;
			//to hold the track of current game
			ArrayList<String>list=new ArrayList<String>();
			
			for(;;start++)
			{
				//enter string
				String s=sc.next();
				try
				{
					int integer=Integer.parseInt(s);
					
					
					//Case1:the incorrect number than the current number you’re on.
					if(integer!=start)
					{
						System.out.println("Wrong Number");
						break;
					}
					
					//if number contain 7 or divisible by 7
					else if(start%7==0 || contains7(start))
					{
						//if buzz add score 2 to current score
						if(s.equals("buzz"))
						{
							score=score+2;
						}
						//if not buzz 
						else
						{
							System.out.println("Should have Buzzed");
							break;
						}
					}
					else//else increment score by 1
					{
						score=score+1;
					}
				}
				catch(Exception e)
				{
					//if entered input is buzz
					if(s.equals("buzz"))
					{
						//but if it is not buzz
						if(!(start%7==0) && !(contains7(start)))
						{
							System.out.println("Not a buzz!");
							break;
						}
						//if it is buzz 
						else
						{
							score=score+2;
						}
					}
					
				}
				//add current input to track of current game
				list.add(s);
			}
			//put the current game track in whole track
			track.put(game,list );
			System.out.println("GAME OVER!");
			//calculating highest score
			highestScore=Math.max(highestScore, score);
			//calculating lowest score
			lowestScore=Math.min(lowestScore, score);
			//calculating average score
			averageScore=(averageScore*(game-1)+score)/game;
		
			//printing the game summary:
			System.out.println("Game :"+game);
			System.out.println("Score: "+score);
			System.out.println("Highest Score : "+highestScore);
			System.out.println("Lowest Score: "+lowestScore);
			System.out.format("Avarage score: %.2f ",averageScore);
			System.out.println("\nNo of games played: "+game);
			//incrementing game
			game++;
			//asking to play next game or not
			System.out.print("Enter 'Y' to continue  'N' to stop :");
			query=sc.next().charAt(0);
			//if entered N or n play game again
			if(query=='N' || query=='n')
			{
				playMore=false;
			}
			//if entered y or Y
			else
			{
				playMore=true;
			}
			
		}
		
		System.out.println("\n* * * THANK YOU FOR PLAYING * * * ");
		
		
		//printing the track of every game we have played
		System.out.println("Track of each Game :");
		
		Iterator<Integer>iter=track.keySet().iterator();
		while(iter.hasNext())
		{
			int key=iter.next();
			System.out.println("Game : "+key);
			ArrayList<String>list=track.get(key);
			for(String s:list)
			{
				System.out.println(s);
			}
			System.out.println();
		}
		sc.close();

	}

	//Method to check number contain 7 or not
	private static boolean contains7(int start) {
		
		while(start>0)
		{
			//extracting each digit
			int digit=start%10;
			//if digit is 7
			if(digit==7)
			{
				return true;
			}
			//to find the next digit
			start=start/10;
		}
		//return false if no 7 found
		return false;
	}

}
