package stringADT;

public class Tester {

	public static void main(String[] args) {
		
		System.out.println();
		
		char array[]= {'j','a','v','a'};//character array
		//creating object linked string object by passing array of characters
		System.out.println("linkedString Object 1: ");
		LinkedString ls1=new LinkedString(array);
		//checking whether the ls1 is empty or not
		System.out.println("isEmpty: "+ls1.isEmpty());
		//printing the length of ls1 object
		System.out.println("Length :"+ls1.length());
		//printing ls1 in form of string
		System.out.println("String form: "+ls1.toString());
		//printing the character at specific index
		System.out.println("Character At index 2: "+ls1.charAt(2));
	
		//creating object linked string object by passing string
		System.out.println("\nlinkedString Object 2: ");
		LinkedString ls2=new LinkedString("programming");
		//checking whether the ls2 is empty or not
		System.out.println("isEmpty: "+ls2.isEmpty());
		//printing the length of ls2 object
		System.out.println("Length :"+ls2.length());
		//printing ls1 in form of string
		System.out.println("String form: "+ls2.toString());
		//printing the character at specific index
		System.out.println("Character At index 5: "+ls2.charAt(5));
		
		
		//concatenating ls2 to ls1
		System.out.println("\nConcatenated linked String: ");
		LinkedString ls3=ls1.concat(ls2);
		//checking whether the ls3 is empty or not
		System.out.println("isEmpty: "+ls3.isEmpty());
		//printing the length of ls3 object
		System.out.println("Length :"+ls3.length());
		//printing ls1 in form of string
		System.out.println("String form: "+ls3.toString());
		//printing the character at specific index
		System.out.println("Character At index 10: "+ls3.charAt(10));

		//replace all occurrences of 'a' to 'A'
		System.out.println("\nReplaced String: ");
		LinkedString ls4=ls3.replace('a', 'A');//replacing
		System.out.println(ls4.toString());//new String after replacing
	}

}
