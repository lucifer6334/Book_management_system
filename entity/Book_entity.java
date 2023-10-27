package com.bms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book_entity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String book_name;
	private String author;
	private String publish;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublish() {
		return publish;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public Book_entity(String book_name, String author, String publish) {
		super();
		this.book_name = book_name;
		this.author = author;
		this.publish = publish;
	}
	@Override
	public String toString() {
		return "Book_entity [id=" + id + ", book_name=" + book_name + ", author=" + author + ", publish=" + publish
				+ "]";
	}
	public Book_entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	}
	
