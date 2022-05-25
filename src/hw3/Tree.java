package hw3;

import java.util.LinkedList;
import java.util.Queue;
public class Tree {
	static class Node
	{
		int data;
		Node left;
		Node right;
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	Node root=null;
	//Method to insert element into bst
	public void insert(int data)
	{
		root=insert(root,data);
		
	}
	public Node insert(Node root, int data)//Overloaded Method to insert element into bst
	{      
	    if(root==null)//if root is null insert at root
	    {
	        return new Node(data);
	    }
	    if(data<root.data)//if current data lessthan root data go and insert at left side of root
	    {
	        root.left=insert(root.left,data);
	    }
	    else
	    {
	        root.right=insert(root.right,data);//if current data Greater than root data go and insert at right side of root
	    }
	    return root;
	}
	
	//2problem ->Method to count the how many nodes in bst have two children 
	public int twoChild(Node root)
	{
		if(root==null)//root is null return 0
			return 0;
		int count=0;//initializes the count with zero
		if(root.left!=null && root.right!=null)//if both right&left child not null increment count
			count=count+1;
		count= count+twoChild(root.left)+twoChild(root.right);//compute the count for both left and right child
		return count;//return count
	}
	
	//print by Level iterative approach
	public void printByLevel(Node root)
	{
		if(root==null)//if root is null
			return;
		Queue<Node>q=new LinkedList<Node>();//initialize queue to keep track of nodes
		q.add(root);	//add root node to queue
		while(!q.isEmpty())//do until queue become empty
		{
			Node temp=q.poll();//take node from queue
			System.out.print(temp.data+" ");//print the element of popped node
			if(temp.left!=null)//if popped node left node is not null add it to queue
				q.add(temp.left);
			if(temp.right!=null)//if popped node right node is not null add to to queue
				q.add(temp.right);
		}
	}
	
		//print By level recursive approach(OPTIONAL)
		public void printByLevelRec(Node root)
		{
			int height=getHeight(root);//get the height of bst
			for(int i=1;i<=height;i++)//for each level
			{
				printLevel(root,i);//print elements present at ith level
			}
		}
		
		
		//Method to print values present at particular level
		public void printLevel(Node root,int level)	
		{
			if(root==null)//if root is null return
				return;
			if(level==1)//if we reaches the level print data 
				System.out.print(root.data+" " );
			printLevel(root.left,level-1);//recursively goes for the left child decrement current level by 1
			printLevel(root.right,level-1);//recursively goes for the right child decrement current level by 1
		}
		
		//to get the height of the bst
		public int getHeight(Node root)
		{
			if(root==null)//if root is null return 0
				return 0;
			int left=getHeight(root.left);//get the height of left sub tree
			int right=getHeight(root.right);//get height the height of right sub tree
			if(left>right)//find the maximum height between left and right sub tree add 1 to it 				
			{				//to get height from current node
				return 1+left;
			}
			else
			{
				return 1+right;
			}
		}
		public static void main(String args[])
		{
			Tree bst=new Tree();//creating main method
			bst.insert(1);//inserting elements into bst
			bst.insert(3);
			bst.insert(4);
			bst.insert(2);
			bst.insert(6);
			bst.insert(5);
			bst.insert(7);
			//to print the count of nodes which contain two child
			System.out.println(bst.twoChild(bst.root));
			//to print the tree by level wise
			bst.printByLevel(bst.root);		
		}	
}
