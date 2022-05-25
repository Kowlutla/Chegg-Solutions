package com.Chegg.media;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MediaList list=new MediaList();
		Book b1=new Book("title1","author1","genre1",300,12.4);

		Book b6=new Book("title6","author6","genre6",300,12.4);
		Book b3=new Book("title3","author3","genre3",300,12.4);
		Book b4=new Book("title4","author4","genre4",300,12.4);
		Book b2=new Book("title2","author2","genre2",300,12.4);
		Book b5=new Book("title5","author5","genre5",300,12.4);
		String[]array=list.getItemListAsStringArray();
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		list.addItem(b2);
		list.addItem(b5);
		list.addItem(b3);
		list.addItem(b4);
		list.addItem(b1);
		list.addItem(b6);
		array=list.getItemListAsStringArray();
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		System.out.println(list.removeItem("title3", "author3"));
		array=list.getAllItemsByAuthor("author5");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		array=list.getSortedListOfAuthors();
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}
