package com.epam.mentoring.module10.services.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.epam.mentoring.module10.data.Book;
import com.epam.mentoring.module10.data.BookStorage;

/**
 * @author Siarhei_Karytka
 */
@WebService(endpointInterface = "com.epam.mentoring.module10.services.soap.BookService")
public class BookServiceImpl implements BookService
{
	@Override
	public Book getBookInfo()
	{
		return BookStorage.getBookByID(1);
	}

	@Override
	public Book[] getBookList()
	{
		List<Book> bookList =  BookStorage.getBookList();
		Book[] books = new Book[bookList.size()];
		books = bookList.toArray(books);

		return books;
	}

	@Override
	public long addBook(int price, String title, String description)
	{
		return BookStorage.addBook(price, title, description);
	}
}
