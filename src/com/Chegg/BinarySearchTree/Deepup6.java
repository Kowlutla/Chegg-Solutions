package com.Chegg.BinarySearchTree;

import java.io.PrintStream;
import java.util.Scanner;

public class Deepup6 {
	node root = null;
	// class node
	private class node {
		String varname;
		double value;
		node llink, rlink;// left and right link
		// node constructor

		node(String s, double d) {
			varname = s;
			value = d;
			llink = rlink = null;
		}// end of constructor
	}// end of node

	PrintStream prt = System.out;

	// Method to insert varname and value into binary search tree
	private void insert(String s, double d) {
		node temp = new node(s, d);// creating node
		root = insertUtil(root, temp);// passing temp to insert into BST
	}

	// utility method to insert node into binary search tree
	private node insertUtil(node root, node temp) {

		if (root == null)// if root is null insert at root
		{
			root = temp;
			return root;
		}
		// if temp varname lesser should be inserted to lefe
		if (temp.varname.compareTo(root.varname) < 0) {
			// if root left is null insert at root left
			if (root.llink == null) {
				root.llink = temp;
			} else {
				root.llink = insertUtil(root.llink, temp);
			}
		}
		// if temp varname greater should be inserted to right
		else if (temp.varname.compareTo(root.varname) > 0) {
			if (root.rlink == null) {
				root.rlink = temp;
			} else {
				root.rlink = insertUtil(root.rlink, temp);
			}
		}
		return root;
	}

	// Method to search for varname and print corresponding value
	private void search(String s) {
		// calling searchUtil method to search s
		node temp = searchUtil(root, s);
		// if varname s found print corresponding value
		if (temp != null) {
			System.out.println(s + " : " + temp.value);
		} else// if not found just print varname
		{
			System.out.println(s + " : ");
		}
	}

	// A utility function to search a given key in BST
	private node searchUtil(node root, String s) {
		// Base Cases: root is null or s is present at root
		if (root == null || root.varname.equals(s))
			return root;

		// s is less than root's value
		if (root.varname.compareTo(s) > 0)
			return searchUtil(root.llink, s);

		// s is greater than root's value
		return searchUtil(root.rlink, s);
	}

	// Method to read the input
	private void readinput() {
		int n;
		double x;
		String s;
		try {
			Scanner inf = new Scanner(System.in);// read input file
			// read no of inputs
			n = inf.nextInt();
			for (int i = 1; i <= n; i++) {
				s = inf.next();// read variable name
				x = inf.nextDouble();// read variable value
				insert(s, x);
			} // end for

			// Read no of variable names to search
			n = inf.nextInt();
			for (int i = 1; i <= n; i++) {
				s = inf.next();// read next variable name
				search(s);
			} // end for
			inf.close();
		} catch (Exception e) {
			System.out.print("\nException " + e + "\n");
		}
	}

	public static void main(String args[]) {
		System.out.println(
				"\n\tG.Dastghaiby Fard COMP182 Project6, " + "\n\tBST Java program " + java.time.LocalDate.now());
		Deepup6 bst = new Deepup6();
		bst.readinput();
	}
}
