package library;

public class LibraryBook {
	//attributes
	private String title;
	private int copyrightYear;
	private String isbnNum;
	private String authorLastName;
	private String authorFirstName;
	
	//Constructors 
	public LibraryBook(String newtitle,String newisbn,String lname,String fname,String copy)
	{
		this.title=newtitle;
		this.isbnNum=newisbn;
		this.authorLastName=lname;
		this.authorFirstName=fname;
		this.copyrightYear=Integer.parseInt(copy);
	}

}
