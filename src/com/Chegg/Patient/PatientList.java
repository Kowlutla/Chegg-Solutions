package com.Chegg.Patient;

import java.io.*;
import java.util.*;

public class PatientList<T> {

	public static void main(String[] args) throws IOException {
		ArrayList<Patient> list = new ArrayList<Patient>();// to hold the patients

		// reading file
		BufferedReader br = new BufferedReader(new FileReader(new File("data.txt")));
		String s = "";
		// extract the each line and store in s
		while ((s = br.readLine()) != null) {
			String[] details = s.split("\\t");// split the s based on deli meter
			// take each attribute and create a new Patient object using those attributes
			String name = details[0];
			int age = Integer.parseInt(details[1]);
			String province = details[2];
			String gender = details[3];
			list.add(new Patient(name, age, province, gender));
		}
		br.close();
		Collections.sort(list);// sorting List
		for (Patient p : list)// printing list
		{
			System.out.println(p);
		}
	}

}
