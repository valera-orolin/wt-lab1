package com.company.tasks9_15.task12_16;

import java.util.Comparator;

class SortByTitle implements Comparator<Book> {
    public int compare(Book book1, Book book2) {
        return book1.getTitle().compareTo(book2.getTitle());
    }
}
