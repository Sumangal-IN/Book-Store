package com.kingfisher.bookStore.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book getBookById(int bookId) {
		Book obj = bookRepository.findById(bookId).get(0);
		return obj;
	}

	public List<Book> getAllBooks() {
		List<Book> list = new ArrayList<>();
		bookRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	public synchronized boolean addBook(Book book) {
		List<Book> list = bookRepository.findByIdAndData(book.getId(),
				book.getData());
		if (list.size() > 0) {
			return false;
		} else {
			bookRepository.save(book);
			return true;
		}
	}

	public void updateBook(Book book) {
		bookRepository.save(book);
	}

	public void deleteBook(int id) {
		bookRepository.delete(getBookById(id));
	}
}
