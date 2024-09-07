package com.ak.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.ak.entity.BookEntity;

@Component
public interface BookRepo extends CrudRepository<BookEntity, Integer> {
	BookEntity findById(int i);
}
