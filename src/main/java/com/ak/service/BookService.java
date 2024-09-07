package com.ak.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ak.entity.BookEntity;
import com.ak.repo.BookRepo;

@Component
public class BookService {
	@Autowired
	BookRepo br;
	
	public List<BookEntity> getAllBooks() {
		List<BookEntity> list = (List<BookEntity>) br.findAll();
		return list;
	}
	
	public BookEntity getBookByID(int i) {
		BookEntity b = br.findById(i);
		return b;
	}

	public String insertBook(BookEntity b) {
		br.save(b);
		return "Book Inserted";
	}

	public String updateBook(int id, BookEntity b) {
		BookEntity b1 = br.findById(id);
		b1.setBname(b.getBname());
		b1.setBauthor(b.getBauthor());
		br.save(b1);
		
		return "Book Updated";
	}

	public String deleteBook(int id) {
		br.deleteById(id);
		return "Book Deleted";
	}
}
