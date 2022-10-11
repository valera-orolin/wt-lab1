package com.company.tasks9_15.task12_16;

import java.util.Comparator;

class SortByTitleAuthor implements Comparator<Book> {
    public int compare(Book book1, Book book2) {
        int titleCompare = book1.getTitle().compareTo(book2.getTitle());
        int authorCompare = book1.getAuthor().compareTo(book2.getAuthor());
        return (titleCompare == 0) ? authorCompare : titleCompare;
    }
}
