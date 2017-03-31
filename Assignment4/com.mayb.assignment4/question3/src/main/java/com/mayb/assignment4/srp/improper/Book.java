package com.mayb.assignment4.srp.improper;

/**
 * Created by by Long on 3/31/2017.
 */
public class Book {
    private String author;
    private String isbn;
    private String title;

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                '}';
    }


    public void printPage() {
        System.out.println(this);
    }
}
