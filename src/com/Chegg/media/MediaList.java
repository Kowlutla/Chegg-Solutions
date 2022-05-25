
package com.Chegg.media;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MediaList {
	
	/* TODO 6: Declare instance variables:
	  * Class instance variable declarations section.
	  * You are required to declare at least one instance variable called itemList.
	  *That variable should be an ArrayList of type MediaItem.
	  * This variable is the primary data structure that stores all of the MediaItem objects
	  * in the library.
	  * You may declare other instance variables if you wish. Points will be
	  * deducted if you declare local variables here. A variable is local if
	  * it is used in only one method.
	  */
	ArrayList<MediaItem>itemList;
	
	/* TODO 7: Constructor
	 * You will use this Constructor to initialize your itemList and
	 * any other instance variables that were declared above.
	 */   
	public MediaList()
	{
		itemList=new ArrayList<MediaItem>();
	}
	
	/** TODO 8: implement this method.
	 * Add the newItem passed in to the the itemList.
	 */
	 public void addItem(MediaItem newItem){
		 itemList.add(newItem);
	 }
	 
	 /** TODO 9: implement this method.
	  * Returns true if the MediaItem with the title and author passed in
	  * is on the itemList, false otherwise. Assume the title/author pair
	  * uniquely identifies a MediaItem.
	  * NOTE: All String comparisons are case-insensitive.
	  */
	 public boolean containsItem(String targetTitle, String targetAuthor){
		 for(int i=0;i<itemList.size();i++)
		 {
			 MediaItem item=itemList.get(i);
			 if(item.getAuthor().equalsIgnoreCase(targetAuthor) && item.getTitle().equalsIgnoreCase(targetTitle))
			 {
				 return true;
			 }
		 }
		 return false;
	 }
	 /** TODO 10: implement this method.
	  * Remove the MediaItem with the title and author passed in.
	  * Return true if removed, false if not found or not removed.
	  * Assume the title/author pair uniquely identifies a MediaItem.
	  * NOTE: All String comparisons are case-insensitive.
	  */
	 public boolean removeItem(String targetTitle, String targetAuthor){
		 for(int i=0;i<itemList.size();i++){
			 MediaItem item=itemList.get(i);
			 if(item.getAuthor().equalsIgnoreCase(targetAuthor) && item.getTitle().equalsIgnoreCase(targetTitle)){
				 removeItemUtil(i);
				 return true;
			 }
		 }
		 return false; 
	 }
	 //Utility Method to remove mediaItem at specific position in itemList
	private void removeItemUtil(int i) {
		itemList.remove(i);
	}
	
	 /** TODO 11: implement this method.
	  * This method returns an array of the String representation of all of
	  * the MediaItem objects that are currently stored in the itemList.
	  * A String representation of a MediaItem is returned by calling its toString() method.
	  * The array returned may not contain any NULL values. This method returns an array of
	  * length 0 if the itemList is empty.
	  **/
	public String[] getItemListAsStringArray(){
		String []itemArray=new String[itemList.size()];
		for(int i=0;i<itemList.size();i++){
			itemArray[i]=itemList.get(i).toString();
		}
		return itemArray;
	}
	/**TODO 12: implement this method.
	 * This method returns a new array that contains only the String representations
	 * of all MediaItems whose genre matches the targetGenre passed in.
	 * A String representation of a MediaItem is returned by calling its toString() method.
	 * The array returned may not contain any NULL values.
	 * This method returns an array of length 0 if there are no matches.
	 **/  
	public String[] getAllItemsByGenre(String targetGenre){
		//list to store the media items which genre is target genre
		ArrayList<String>list=new ArrayList<String>();
		for(int i=0;i<itemList.size();i++){
			 MediaItem item=itemList.get(i);
			 if(item.getGenre().equalsIgnoreCase(targetGenre))
			 {
				list.add(item.toString());
			 }
		}
		String []genre=new String[list.size()];
		for(int i=0;i<list.size();i++)
		{
			genre[i]=list.get(i);
		}
		return genre;
	}

	 /**TODO 13: implement this method.
	  * This method returns a new array that contains only the String representations
	  * of all MediaItems whose author matches the targetAuthor passed in.
	  * The array returned may not contain any NULL values.
	  * This method returns an array of length 0 if there are no matches.
	  * NOTE: All String comparisons are case-insensitive.
	  **/  
	public String[] getAllItemsByAuthor(String targetAuthor){
		ArrayList<String>list=new ArrayList<String>();
		for(int i=0;i<itemList.size();i++)
		{
			 MediaItem item=itemList.get(i);
			 if(item.getAuthor().equalsIgnoreCase(targetAuthor))
			 {
				list.add(item.toString());
			 }
		}
		String []author=new String[list.size()];
		for(int i=0;i<list.size();i++)
		{
			author[i]=list.get(i);
		}
		return author;
	}
	
	 /** TODO 14: implement this method.
	  * This method returns a sorted array of the names of all the authors for
	  * all the media items in the list. This list should not contain duplicates.
	  * Hint: use Arrays.sort for sorting an array, or Collections.sort for sorting
	  *        an ArrayList.
	  **/
	//Using Collection.sort()method
	public String[] getSortedListOfAuthors(){
		Collections.sort(itemList, (i1,i2)->
		{
			if(i1.getAuthor().compareToIgnoreCase(i2.getAuthor())>0){
				return 1;
			}
			else if(i1.getAuthor().compareToIgnoreCase(i2.getAuthor())<0){
				return -1;
			}
			else{
				return 0;
			}
		});	
		String[]authors=new String[itemList.size()];
		for(int i=0;i<itemList.size();i++){
			authors[i]=itemList.get(i).getAuthor();
		}
		return authors;
	}
	//USING Arrays.sort() METHOD
	/*	public String[] getSortedListOfAuthors(){
	
			String []authors=new String[itemList.size()];
			for(int i=0;i<itemList.size();i++)
			{
				authors[i]=itemList.get(i).getAuthor();
			}
			Arrays.sort(authors);
			return authors;
	}*/
	 
	 
	/** TODO 15: implement this method.
	 * Returns the number of items currently stored in the itemList.
	 **/
	public int getNumItems(){
		return itemList.size();
	}
	
	/** TODO 16: implement this method.
	 * Returns true if the itemList contains no MediaItems, false otherwise.
	 **/
	public boolean isEmpty(){
		return getNumItems()==0;
	}
	 
}
