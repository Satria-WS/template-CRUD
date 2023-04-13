package com.javatpoint.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//mark class as an Entity
@Entity

//classname as table name

@Table(name = "perpustakaan",schema = "mgr")

public class Books {

    //BOOK Id as primary key
    @Id
    @Column
    private int bookid;

    @Column
    private String bookname;

    @Column
    private String author;

    @Column
    private int price;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getbookname() {
        return bookname;
    }

    public void setBookName(String bookName) {
        this.bookname = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
