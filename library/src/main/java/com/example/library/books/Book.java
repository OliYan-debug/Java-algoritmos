package com.example.library.books;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name="Livros")
public class Book {
    @Id
    @SequenceGenerator(
            name = "sequence_book",
            sequenceName = "sequence_book",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sequence_book"
    )
    private Long id;
    private String name;
    private int pages;
    private String author;
    private String isbn;
    private LocalDate release;
    @Transient
    private int age;

    public Book(String name, int pages, String author, String isbn, LocalDate release) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.isbn = isbn;
        this.release = release;
    }

    public Book() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public int getAge() {
        return Period.between(release,LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nome='" + name + '\'' +
                ", páginas=" + pages +
                ", autor='" + author + '\'' +
                ", isbn=" + isbn +
                ", lançamento=" + release +
                ", anos=" + age + " anos" +
                '}';
    }
}
