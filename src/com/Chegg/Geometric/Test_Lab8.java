package com.Chegg.Geometric;
import java.util.Arrays;
import java.util.Scanner;
public class Test_Lab8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// take number of objects to store
		String data = sc.nextLine();
		int count = Integer.parseInt(data);
		// declare an Object array to hold the shape objects,
		GeometricObject[] objects = new GeometricObject[count];
		//loop to read count no of Objects
		for (int i = 0; i < count; i++) {
			//read complete object information in string form
			data = sc.nextLine();
			//split the data using " "
			String[] tempData = data.split(" ");
			//if data contain three words
			if (tempData.length == 3) {
				int object_ID = Integer.parseInt(tempData[0]);//take object id
				double radius = Double.parseDouble(tempData[1]);//take radius
				String color = tempData[2];//take color
				//create object of circle using above three fields
				GeometricObject circle = new Circle(object_ID, radius, color);
				//add circle object to objects array
				objects[i] = circle;
			}
			//if data contain four words
			else if (tempData.length == 4) {
				int object_ID = Integer.parseInt(tempData[0]);//take object id
				double width = Double.parseDouble(tempData[1]);//take width
				double height = Double.parseDouble(tempData[2]);//take height
				String color = tempData[3];//take color
				//create rectangle object with above four fields
				GeometricObject rectangle = new Rectangle(object_ID, width, height, color);
				//add rectangle object to objects array
				objects[i] = rectangle;
			}
		}
		// sorting array object based on object_ID
		Arrays.sort(objects);
		System.out.println();
		// printing objects in sorted order of object_ID
		for (int i = 0; i < count; i++) {
			System.out.println(objects[i].toString());
		}
		sc.close();
	}

}
