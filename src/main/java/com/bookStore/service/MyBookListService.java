package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookListRepository;

@Service
public class MyBookListService {
	
	@Autowired
	private MyBookListRepository mybook;
	
	public void saveMyBooks(MyBookList book) {
		
		mybook.save(book);
		
		
	}
	
	public List<MyBookList> getAllMyBooks(){
		
		return mybook.findAll();
		
		
	}
	
	//method to delete from my booklist
	
	public void deleteById(int id) {
		
		mybook.deleteById(id);
	}

}
