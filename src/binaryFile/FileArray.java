package binaryFile;
import java.io.*;
public class FileArray {
	 /* method which take two arguments: the name of a file and a reference to an int array.
	 *  The file should be opened as a binary file, the contents of the array should be written to the file, 
	 *  and then the file should be closed.
	 * */
	public static void WriteFile(File file,int inputArray[]) throws IOException
	{
		try 
		{
			//Opening file as Binary file
			FileOutputStream fos=new FileOutputStream(file);//file output stream object
			ObjectOutputStream oos=new ObjectOutputStream(fos);//object output stream object
			oos.writeObject(inputArray);
			
		} 
		//if file not found then exception occures
		catch (FileNotFoundException e) 
		{
			System.out.println(e);
		}
		
	}
	 /*method which take two arguments: the name of a file and a reference to an int array. 
	 * The file should be opened, data should be read from the file and written into the array, 
	 * and then the file should be closed.
	 * */
	public static int[] readArray(File file,int outputArray[]) throws IOException, Exception
	{
		try 
		{
			FileInputStream fis=new FileInputStream(file);
			ObjectInputStream ois=new ObjectInputStream(fis);
			outputArray=(int[])ois.readObject();
			ois.close();
			fis.close();
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e);
		}
		
		return outputArray;
	}
	
	

}
