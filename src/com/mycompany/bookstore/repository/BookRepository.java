package com.mycompany.bookstore.repository;

import com.mycompany.bookstore.entity.BookEntity;

public interface BookRepository {
    public Long add(BookEntity bookEntity);
    public BookEntity getDetails(Long bookID);
}
