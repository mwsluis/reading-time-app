package com.github.demo.model;

/**
 * Model class for book.
 */
public class Book {

    private String title;

    private String author;

    private String cover;
    
    private String summary;

    public Book() {

    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title, String cover) {
        this.author = author;
        this.title = title;
        this.cover = cover;
    }

    public String getSummary() {
        return summary;
    }
    
    public void setSummary(String input) {
        this.summary = input;
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDetails() {
        return author + " " + title;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
