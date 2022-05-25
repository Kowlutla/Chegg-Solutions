
package com.Chegg.media;
/**
 * This class encapsulates the data required to represent a book in electronic format
 * in a collection of MediaItems. It derives from MediaItem.
 * In addition to its superclass attributes, the attributes of a book are:
 *       number of pages and font size.
 **/
public class Book extends MediaItem 
{
	private int numPages;
	private double fontSize;
	/* TODO 2.1: Constructor*/
	public Book(String title, String author, String genre,int numPages, double fontSize){
		super(title,author,genre);
		this.fontSize=fontSize;
		this.numPages=numPages;
	}
	public int getNumPages() {
		return numPages;
	}
	public double getFontSize() {
		return fontSize;
	}
	/* TODO 2.2: Implement this method:
	 * Override the superclass toString method. Use a call to the superclass toString method
	 * to get the superclass attributes.
	 * The return should have the format:
	 *   Book: [title], [author], [genre], [numPages], [fontSize]
	 * For example:
	 *   "Book: Snow Crash, Neil Stephenson, sci fi, 480, 3.5"
	 */
	public String toString(){
		return "Book: "+super.toString()+","+numPages+","+fontSize;
	}
}
