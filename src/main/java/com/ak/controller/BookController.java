package com.ak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ak.entity.BookEntity;
import com.ak.service.BookService;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
public class BookController {
	@Autowired
	BookService bs;
	
	@GetMapping("/books")
	public List<BookEntity> getAllBooks() {
		return bs.getAllBooks();
	}
	
	@GetMapping("/books/{id}")
	public BookEntity getBookByID(@PathVariable("id") int  i) {
		return bs.getBookByID(i);
	}
	
	@PostMapping("/books")
	public String insertBook(@RequestBody BookEntity b) {
		return bs.insertBook(b);
	}
	
	@PutMapping("/books/{id}")
	public String update(@PathVariable int id, @RequestBody BookEntity b) {
		return bs.updateBook(id, b);
	}
	
	@DeleteMapping("/books/{id}")
	public String deleteBook(@PathVariable int id) {
		return bs.deleteBook(id);
	}
}
