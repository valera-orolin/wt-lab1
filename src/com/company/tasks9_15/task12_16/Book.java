package com.company.tasks9_15.task12_16;

import java.lang.reflect.Field;

public class Book implements Comparable<Book> {

    String title;
    String author;
    int price;
    static int edition;
    private int isbn;

    public int compareTo(Book book) {
        return Integer.compare(isbn, book.isbn);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public boolean equals(Object obj) {

        if (obj == this)
            return true;
        if (!(obj instanceof Book))
            return false;
        Field[] thisField = this.getClass().getDeclaredFields();
        Field[] objFields = obj.getClass().getDeclaredFields();

        if (thisField.length != objFields.length)
            return false;
        Book tmp = (Book)obj;

        return this.author == tmp.author && this.price == tmp.price && this.title == tmp.title;
    }

    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + (title == null ? 0 : title.hashCode());
        hash = 31 * hash + (author == null ? 0 : title.hashCode());
        hash = 31 * hash + price;
        hash = 31 * hash + edition;
        return hash;
    }

    public String toString() {
        return this.author + "\n" + this.title + "\n" + Integer.toString(this.price) + "\n";
    }

    public Book clone() {
        Book tmp = new Book();
        tmp.title = this.title;
        tmp.author = this.author;
        tmp.price = this.price;
        return tmp;
    }
}
