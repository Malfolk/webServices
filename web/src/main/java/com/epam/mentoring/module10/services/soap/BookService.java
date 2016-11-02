package com.epam.mentoring.module10.services.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.epam.mentoring.module10.data.Book;

/**
 * @author Siarhei_Karytka
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface BookService
{
	@WebMethod
	public Book getBookInfo();

	@WebMethod
	public Book[] getBookList();

	@WebMethod
	public long addBook(@WebParam(name = "price") int price, @WebParam(name = "title") String title,
			@WebParam(name = "description") String description);
}
