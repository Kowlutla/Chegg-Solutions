
public class LockerPuzzle {

	public static void main(String[] args) {
		boolean[] lockers = new boolean[101];
        //initially all lockers are closed
        for (int i = 1; i < lockers.length; i++) {
            lockers[i] = false;
        }


        //open every locker for every multiple of i
        for (int i = 1; i <= 100; i++) 
        {
            for (int j = 1; i * j <= 100; j++) 
            {
            	  //toggile the every multiple of i
                lockers[i * j] = (lockers[i * j] == true) ? false : true;
            }
        }

        //Display the open lockers
        for (int i = 0; i < lockers.length; i++) {
            if (lockers[i] == true)
                System.out.println("locker " + i + " is open");
        }
	}

}
