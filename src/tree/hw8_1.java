package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;

public class hw8_1 {
	
	//class for node
	static  class Node
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
	
	//root node
	static Node root;
	
	/* Method to insert the formed nodes to the tree when a parent node 
	 * does not have a right or the left child. */
	public void append(int data) {
		 
        Node temp;
        Queue<Node>queue=new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
        	temp=queue.peek();
        	queue.poll();
        	/* Insert node as the left child of the parent node. */
        	if(temp.left==null)
        	{
        		temp.left=new Node(data);
        		break;
        	}
        	/* If the left node is not null push it to the queue. */
        	else
        	{
        		queue.add(temp.left);
        	}
        	/* Insert node as the right child of the parent node. */
        	if(temp.right==null)
        		
        	{
        		temp.right=new Node(data);
        		break;
        	}
        	/* If the right node is not null push it to the queue. */
        	else
        	{
        		queue.add(temp.right);
        	}
        }
    }
	
	//Pre order traversal
	public void preOrderTraverse(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+" ");
		preOrderTraverse(root.left);
		preOrderTraverse(root.right);
	}
	
	//post order traversal
	public void PostOrderTraverse(Node root)
	{
		if(root==null)
		{
			return;
		}
		PostOrderTraverse(root.left);
		PostOrderTraverse(root.right);
		System.out.print(root.data+" ");
	}
	
		//In order traversal
		public void InOrderTraverse(Node root)
		{
			if(root==null)
			{
				return;
			}
			InOrderTraverse(root.left);
			System.out.print(root.data+" ");
			InOrderTraverse(root.right);
			
		}
	
	//level order traversal
	public void LevelOrderTraverse(Node root)
	{
		if(root==null)
		{
			return ;
		}
		Queue<Node>queue=new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node temp=queue.poll();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
			{
				queue.add(temp.left);
			}
			if(temp.right!=null)
			{
				queue.add(temp.right);
			}
		}
	}
	
	// To keep track of last processed 
    // nodes parent and node itself. 
	static  Node parentOfLastNode=null;
	static Node lastNode=null;
	public void deleteLastNode(Node root) 
    { 
  
        int levelOfLastNode = getHeight(root); 
  
        // Get all nodes at last level 
        getLastNodeAndItsParent(root, levelOfLastNode,null); 
		if (lastNode != null && parentOfLastNode != null) 
		{ 
            if (parentOfLastNode.right != null) 
            {
            	parentOfLastNode.right = null; 
            }
            else
            {
                parentOfLastNode.left = null; 
            }
        } 
        else
        	return;
    } 
  
    // Method to keep track of parents 
    // of every node 
    public void getLastNodeAndItsParent(Node root,  int level,Node parent) 
    { 
  
        if (root == null) 
            return; 
  
        // The last processed node in 
        // Level Order Traversal has to 
        // be the node to be deleted. 
        // This will store the last 
        // processed node and its parent. 
        if (level == 0) 
        { 
        	lastNode = root; 
            parentOfLastNode = parent; 
        } 
        getLastNodeAndItsParent(root.left,level - 1,root); 
        getLastNodeAndItsParent(root.right,level - 1,root); 
    } 
    //Method to check tree  bst or not
	public boolean isBST()
	{
		return isBST(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	//Overloaded method to check tree is bst or not
	private boolean isBST(Node root,int min,int max)
	{
		if(root==null)
		{
			return true;
		}
		
		if(root.data>max || root.data<min)
		{
			return false;
		}
		return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);
	}
	
	
	//to get the height of the tree
	public int getHeight(Node root)
	{
		if(root==null)
			return -1;
		int left=getHeight(root.left);
		int right=getHeight(root.right);
		if(left>right)
		{
			return 1+left;
		}
		else
		{
			return 1+right;
		}
	}
	
	public static void main(String args[]) throws  IOException
	{
		hw8_1 tree=new hw8_1();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//asking for root value
		int root_value=Integer.parseInt(br.readLine());
		root=new Node(root_value);
		
		// no of queries from user
		int q=Integer.parseInt(br.readLine());
		//to store queries
		String[]query=new String[q];
		for(int i=0;i<q;i++)
		{
			query[i]=br.readLine();
		}
		
		
		//executing each query based on entry
		System.out.println();
		for(int i=0;i<q;i++)
		{
			String current=query[i];
			if(current.contains("append"))
			{
				String[]array=current.split(" ");
				int value=Integer.parseInt((array[1]));
				tree.append(value);
			}
			else if(current.equalsIgnoreCase("isBST"))
			{
				System.out.println(tree.isBST());
			}
			else if(current.equalsIgnoreCase("height"))
			{
				System.out.println(tree.getHeight(root));
			}
			else if(current.equalsIgnoreCase("preOrder"))
			{
				tree.preOrderTraverse(root);
				System.out.println();
			}
			else if(current.equalsIgnoreCase("postOrder"))
			{
				tree.PostOrderTraverse(root);
				System.out.println();
			}
			else if(current.equalsIgnoreCase("levelOrder"))
			{
				tree.LevelOrderTraverse(root);
				System.out.println();
			}
			else if(current.equalsIgnoreCase("inOrder"))
			{
				tree.InOrderTraverse(root);
				System.out.println();
			}
			else if(current.equalsIgnoreCase("deleteLastNode"))
			{
				tree.deleteLastNode(root);
			}
		}
		
		
	}

}
