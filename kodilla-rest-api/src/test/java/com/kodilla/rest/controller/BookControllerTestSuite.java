package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import static org.mockito.Mockito.times;

class BookControllerTestSuite {

    @Test
    void shouldFetchBooks() {
        //given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> booksList = new ArrayList<>();
        booksList.add(new BookDto("Title 1", "Author 1"));
        booksList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(booksList);

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertThat(result).hasSize(2);

    }

    @Test
    public void shouldCheckIfAddBookChangesListSize() {
        //given
        BookService bookService = new BookService(); //Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookService); //Mockito.mock(BookController.class);
        BookDto bookDto1 = Mockito.mock(BookDto.class);
        BookDto bookDto2 = Mockito.mock(BookDto.class);
        bookController.addBook(bookDto1);
        bookController.addBook(bookDto2);

        //when
        int bookDtoListSize = bookController.getBooks().size();
        List<BookDto> result = bookController.getBooks();

        //then
        Assertions.assertEquals(2, bookDtoListSize);
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldCheckIfAddBookIsInvoked() {
        //given
        BookController bookControllerMock = Mockito.mock(BookController.class);
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookDto bookDto = new BookDto(); //Mockito.mock(BookDto.class);
        //when
        bookControllerMock.addBook(bookDto);
        bookServiceMock.addBook(bookDto);
        //then
        Mockito.verify(bookControllerMock, times(1)).addBook(bookDto);
        Mockito.verify(bookServiceMock, times(1)).addBook(bookDto);
    }
}