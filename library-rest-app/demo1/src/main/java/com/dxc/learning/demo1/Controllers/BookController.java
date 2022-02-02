package com.dxc.learning.demo1.Controllers;


import java.time.LocalDate;

import javax.xml.bind.Unmarshaller.Listener;

import com.dxc.learning.ModelMapper;
import com.dxc.learning.demo1.model.Book;
import com.dxc.learning.demo1.repository.BookRepository;
import com.dxc.learning.service.BookService;

import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
  @Autowired
  private final BookService bookService;

  @Autowired
  private ModelMapper modelMapper;

  @GetMapping("/books")
  public List<Book> getAllBooks(){
    return BookService.getAllBooks)();

  }
  

  @PostMapping("/books/{id}")
  public Book createbook()
  
}
    



    
}
