package com.kingfisher.bookStore.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/bookStore")
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Book> getAllUsers() {
		return bookRepository.findAll();
	}
}
