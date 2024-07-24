package com.sparta.lh.springweb.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false)
    private Integer id;

    @Size(max = 100, message = "Title must be 100 characters or less")
    @Column(name = "title", length = 100)
    private String title;

    @Size(max = 100)
    @Column(name = "author_fname", length = 100)
    private String authorFname;

    @Size(max = 100)
    @Column(name = "author_lname", length = 100)
    private String authorLname;

    @Column(name = "released_year")
    private Integer releasedYear;

    @Column(name = "stock_quantity")
    private Integer stockQuantity;

    @Column(name = "pages")
    private Integer pages;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorFname() {
        return authorFname;
    }

    public void setAuthorFname(String authorFname) {
        this.authorFname = authorFname;
    }

    public String getAuthorLname() {
        return authorLname;
    }

    public void setAuthorLname(String authorLname) {
        this.authorLname = authorLname;
    }

    public Integer getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(Integer releasedYear) {
        this.releasedYear = releasedYear;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}