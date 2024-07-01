package com.literalura.literalura.api;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.literalura.literalura.model.Book;

public class BookApiResponse {

    private List<Book> results;

    public List<Book> getResults() {
        return results;
    }

    public void setResults(List<Book> results) {
        this.results = results;
    }
    
    // Atributos individuais do livro
    private String title;

    @SerializedName("author_name")
    private String authorName;

    private String language;

    // Getters e Setters para os atributos individuais

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
