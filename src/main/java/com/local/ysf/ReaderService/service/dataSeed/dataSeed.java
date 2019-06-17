package com.local.ysf.ReaderService.service.dataSeed;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.javafaker.Faker;
import com.local.ysf.ReaderService.Entity.Reader;
import com.local.ysf.ReaderService.service.ReadersService;

//@Component
public class dataSeed {

	@Autowired
	private ReadersService readerService;
	
	
	@PostConstruct
	public void addindData(){
		
		for (int i = 0; i < 21; i++) {
			Faker faker =  new Faker();
			List<String> listOfBook= new ArrayList<>();
			for (int j = 0; j < 3; j++) {
				listOfBook.add(faker.book().title());
			}
			 
			readerService.saveReader(new Reader(null,faker.name().firstName(), faker.name().firstName(), listOfBook));
		}
	}
}
