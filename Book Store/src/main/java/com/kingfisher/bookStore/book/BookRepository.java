package com.kingfisher.bookStore.book;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findById(int id);

	List<Book> findByIdAndData(int id, String data);
}