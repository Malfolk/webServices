package com.epam.mentoring.module10.data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siarhei_Karytka
 */
public class BookStorage
{
	private static List<Book> bookList = new ArrayList<Book>();

	private static long nextBookID = 0;

	static {
		bookList.add(new Book(getNextBookID(), 25, "Spring in Action", "Book about spring"));
		bookList.add(new Book(getNextBookID(), 30, "Crime and Punishment", "Detective book"));
		bookList.add(new Book(getNextBookID(), 8, "Bukvar", "You first book."));
	}

	public static List<Book> getBookList()
	{
		return bookList;
	}

	public static void setBookList(List<Book> bookList)
	{
		BookStorage.bookList = bookList;
	}

	public static Book getBookByID(long id)
	{
		for(Book book : bookList)
		{
			if(book.getId() == id)
			{
				return book;
			}
		}
		return null;
	}

	public static long addBook(int price, String title, String description)
	{
		Book book = new Book(getNextBookID(), price, title, description);
		bookList.add(book);

		return book.getId();
	}

	private static long getNextBookID()
	{
		nextBookID++;
		return nextBookID;
	}
}
