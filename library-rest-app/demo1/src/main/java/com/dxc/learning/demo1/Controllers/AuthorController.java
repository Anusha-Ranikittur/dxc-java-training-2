package com.dxc.learning.demo1.Controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.dxc.learning.demo1.model.Author;
import com.dxc.learning.service.AuthorService;

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
public class AuthorController {
  @Autowired
  private AuthorService authorService;
  @Autowired
  private Mapper modelMapper;


 
  @GetMapping("/authors")
   public List<Author> getAllAuthors() {
    return authorService.getAllAuthors();
  }
  

  @PostMapping("/authors")
   public Author createAuthor(@RequestBody Author newAuthor) {
     author.setCreationDate(LocalDate.now());
    return authorService.createAuthors(newAuthor);
  }

 
  
  @GetMapping("/authors/{id}")
  public Author getAuthorById(@PathVariable int id) {
    return authorService.getAuthorById(id);
    
  }

  @PutMapping("/authors/{id}")
   public Author updateAuthor(@RequestBody Author author, @PathVariable Integer id) {  
    return authorService.updateAuthor(author);
    
 }
  

  @DeleteMapping("/authors/{id}")
  public void deleteAuthor(@PathVariable Integer id) {
    authorService.deleteAuthor(id);
  }
}