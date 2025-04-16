package com.kodilla.rest.controller;

import com.google.gson.Gson;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import java.util.List;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

@ExtendWith(MockitoExtension.class)
class BookControllerRestAssuredTest {
    @Mock
    private BookService bookService;
    @InjectMocks  // [1]
    private BookController bookController;

    @BeforeEach
    public void initialiseRestAssuredMockMvcStandalone() {
        RestAssuredMockMvc.standaloneSetup(bookController);  // [2]
    }

    @Test
    void shouldFetchBooks() {
        // given
        Mockito.when(bookService.getBooks())
                .thenReturn(List.of(
                        new BookDto("Title 1", "Author 2"),
                        new BookDto("Title 2", "Author 2"))
                );
        // when then
        when()
                .get("/books")  // [3]
                .then()
                .body("$.size()", Matchers.equalTo(2))  // [4]
                .body("[0].title", Matchers.equalTo("Title 1"))    // [5]
                .body("[0].author", Matchers.equalTo("Author 2"))
                .body("[1].title", Matchers.equalTo("Title 2"))
                .body("[1].author", Matchers.equalTo("Author 2"))
                .status(HttpStatus.OK);
    }
    @Test
    public void verifyBookIsAdded() {
        //given
        Gson gson = new Gson();

        BookDto bookDto = new BookDto("Title 1", "Author 1"); //Mockito.mock(BookDto.class);
        String json = gson.toJson(bookDto);
        System.out.println(json);

        //when then
        with().body(json).contentType(MediaType.APPLICATION_JSON).when().post("/books")
                .then()
                .status(HttpStatus.OK);
    }
}
