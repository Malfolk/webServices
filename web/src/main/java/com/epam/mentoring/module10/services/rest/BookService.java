package com.epam.mentoring.module10.services.rest;

import java.util.List;

import com.epam.mentoring.module10.data.Book;
import com.epam.mentoring.module10.data.BookStorage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Siarhei_Karytka
 */
@RestController
@RequestMapping("/rest/books")
public class BookService
{
	@RequestMapping(value = "", method = RequestMethod.GET)
	@ResponseBody
	public List<Book> getBooks()
	{
		return BookStorage.getBookList();
	}

	@RequestMapping(value = "/{bookID}", method = RequestMethod.GET)
	@ResponseBody
	public Book getBook(@PathVariable("bookID") long bookID)
	{
		return BookStorage.getBookByID(bookID);
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	@ResponseBody
	public long createBook(@RequestParam(value = "price", required = true) int price,
			@RequestParam(value = "title", required = true) String title,
			@RequestParam(value = "description", required = true) String description)
	{
		return BookStorage.addBook(price, title, description);
	}
}
