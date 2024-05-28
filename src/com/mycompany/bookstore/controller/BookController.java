package com.mycompany.bookstore.controller;

import com.mycompany.bookstore.dto.BookDTO;
import com.mycompany.bookstore.service.BookService;
import com.mycompany.bookstore.service.impl.BookServiceImpl;


public class BookController {
    private BookService bookService;
    public BookController(){
        //dynamic polymorphism
        this.bookService = new BookServiceImpl();
    }
    public Long add(BookDTO bookDTO) {
        //call to the service layer add method
        return this.bookService.add(bookDTO);

    }
    public BookDTO getBook(Long bookId){
        //call to the service layer get book method and return the book dto
        return this.bookService.getBook(bookId);
    }

}
