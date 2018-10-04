package com.company;

import java.awt.*;

public class Book {
    private String title;
    private String author;
    private String year;
    private String isbn;
    private String id;
    private boolean status;
    private Image image;


    public Book(String title, String author, String year, String isbn, String id, boolean status, Image image) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.id = id;
        this.status = status;
        this.image = image;
    }

    public Book() {
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

