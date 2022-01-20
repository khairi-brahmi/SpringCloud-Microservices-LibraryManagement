package fst.if5.cloud.projetMicroServices.book.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import fst.if5.cloud.projetMicroServices.book.model.Book;

public interface BookRepository extends MongoRepository<Book, String> {

	//public Book findByType(String type);
	public Book findById(String id);
}