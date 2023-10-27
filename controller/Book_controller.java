package com.bms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bms.entity.Book_entity;
import com.bms.service.Book_service;

@RestController
@RequestMapping("/api")
public class Book_controller {

	@Autowired
	Book_service book_service;

	@PostMapping("/createbook")
	ResponseEntity<Book_entity> createbook(@RequestBody Book_entity book_entity) {
		return new ResponseEntity<Book_entity>(book_service.createbook(book_entity), HttpStatus.CREATED);
	}

	@GetMapping("/fetchallbooks")
	List<Book_entity> get_allbooks() {
		return book_service.fetchallbooks();
	}

	@GetMapping("/fetchbyid/{b_id}")
	Book_entity getbyid(@PathVariable("b_id") int id) {
		return book_service.fetchbyid(id);
	}

	@DeleteMapping("/deletebyid/{b_id}")
	String deletebyid(@PathVariable("b_id") int id) {
		return book_service.deletebyid(id);
	}

	@PutMapping("/updatebyid/{id}")
	Book_entity updateByid(@PathVariable("id") int id, @RequestBody Book_entity book_entity) {
		return book_service.updatebyid(id, book_entity);
	}
}