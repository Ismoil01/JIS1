package com.company.HomeWork05;

import java.util.Objects;

public class Book {
    String author;
    String title;
    int numberOfPages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages &&
                Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, numberOfPages);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Philip Roth");
        book.setTitle("Letting Go");
        book.setNumberOfPages(342);
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getNumberOfPages());
    }
}
