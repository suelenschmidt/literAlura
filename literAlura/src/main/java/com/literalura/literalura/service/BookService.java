package com.literalura.literalura.service;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.literalura.literalura.api.BookApiResponse;
import com.literalura.literalura.model.Book;
import com.literalura.literalura.repository.BookRepository;

import retrofit2.Call;
import retrofit2.Response;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public List<Book> getBooksFromAPI(String topic) {
        GutendexService gutendexService = new GutendexService();
        GutendexAPI gutendexAPI = gutendexService.createGutendexAPI();

        Call<BookApiResponse> call = gutendexAPI.getBooks(topic);
        try {
            Response<BookApiResponse> response = call.execute();
            if (response.isSuccessful() && response.body() != null) {
                return response.body().getResults();
            }else {
                System.out.println("Erro na resposta da API: " + response.message());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }
}
