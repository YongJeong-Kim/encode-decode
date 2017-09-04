package com.example.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Person;
import com.example.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository personRepository;
	
	public void init() throws IOException {
		Person p = new Person();
		String path = "C:\\Users\\yjk\\Desktop\\streamAPI.png";
		/*File file = new File(path);
		byte[] fileContent = Files.readAllBytes(file.toPath());
		
		String byteToString = new String(fileContent, 0, fileContent.length);
		System.out.println(fileContent);
		System.out.println(fileContent.toString());
		
		p.setImage(fileContent);
		p.setContent("Hello Hello !! ++ \n hi hi hi");
		
		personRepository.save(p);
		byte[] gg = personRepository.findOne(1L).getImage();
		String co = personRepository.findOne(1L).getContent();
		System.out.println(gg);
		System.out.println(co);*/

	}
	
	
}
