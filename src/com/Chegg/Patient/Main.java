package com.Chegg.Patient;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Patient p1=new Patient("Thabo Lehaile",32,"Kwazulu Natal","Male");
		Patient p2=new Patient("Lesang Lemo",32,"Gauteng","Female");
		Patient p3=new Patient("James Boles",28,"Free State","Male");
		Patient p4=new Patient("Ahmed Drinkwater",31,"Gauteng","Male");
		Patient p5=new Patient("Lucia Tsalalie",32,"Kwazulu Natal","Female");
		
		File file=new File("data.txt");
		try {
			PrintWriter pw=new PrintWriter(file);
			pw.println(p1);
			pw.println(p2);
			pw.println(p3);
			pw.println(p4);
			pw.println(p5);
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
