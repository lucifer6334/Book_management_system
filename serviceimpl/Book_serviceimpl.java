package com.bms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bms.entity.Book_entity;
import com.bms.repository.Book_repository;
import com.bms.service.Book_service;

@Service
public class Book_serviceimpl implements Book_service {

	@Autowired
	Book_repository book_repository;

	@Override
	public Book_entity createbook(Book_entity book_entity) {
		// TODO Auto-generated method stub
		return book_repository.save(book_entity);
	}

	@Override
	public List<Book_entity> fetchallbooks() {
		// TODO Auto-generated method stub
		return book_repository.findAll();
	}

	@Override
	public Book_entity fetchbyid(int id) {
		// TODO Auto-generated method stub
		Book_entity book_entity = book_repository.findById(id).get();
		return book_entity;
	}

	@Override
	public String deletebyid(int id) {
		// TODO Auto-generated method stub
		book_repository.deleteById(id);
		return "Deleted Successfully id:-" + id;
	}

	@Override
	public Book_entity updatebyid(int id, Book_entity book_entity) {
		// TODO Auto-generated method stub
		Book_entity book_entity2 = book_repository.findById(id).get();
		book_entity2.setAuthor(book_entity.getAuthor());
		book_entity2.setBook_name(book_entity.getBook_name());
		book_entity2.setPublish(book_entity.getPublish());
		Book_entity book_entity3 = book_repository.save(book_entity2);
		return book_entity3;
	}

	

}
