package com.library.service;

import com.library.model.Book;
import com.library.repository.BookRepository;

public class BookService {

    private Book book;  // Constructor injection
    private BookRepository bookRepository;  // Setter injection

    public BookService(Book book) {
        this.book = book;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void registerBook() {
        System.out.println("BookService: Registering Book...");
        bookRepository.save(book.getDetails());
    }
}
