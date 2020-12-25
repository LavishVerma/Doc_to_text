package com.example.Doc_to_text;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.Doc_to_text.Reader.DocumentReader;

@SpringBootApplication
public class DocToTextApplication implements CommandLineRunner {
	
	@Autowired
	DocumentReader reader;

	public static void main(String[] args) {
		SpringApplication.run(DocToTextApplication.class, args);
	}
	
	 @Override
	   public void run(String... arg0) throws Exception {
//	     reader.Read();
	     reader.readDocxFile("D:/Doc_to_text/src/main/resources/Spring Final.docx");
//	     reader.readDocFile("D:/Doc_to_text/src/main/resources/file-sample_100kB.doc");  
	 }


}
