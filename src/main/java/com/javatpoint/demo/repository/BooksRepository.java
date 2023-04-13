package com.javatpoint.demo.repository;
import org.springframework.data.repository.CrudRepository;
import com.javatpoint.demo.entity.Books;

//repository that extends CrudRepository
public interface BooksRepository extends CrudRepository<Books, Integer>  {
}