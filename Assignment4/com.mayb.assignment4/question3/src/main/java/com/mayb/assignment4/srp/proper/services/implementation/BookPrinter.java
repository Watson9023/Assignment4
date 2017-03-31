package com.mayb.assignment4.srp.proper.services.implementation;

import com.mayb.assignment4.srp.proper.domain.Book;
import com.mayb.assignment4.srp.proper.services.Printer;

/**
 * Created byby Long on 3/31/2017.
 */
public class BookPrinter implements Printer{

    public void printPage(Book b) {
        System.out.println(b);
    }
}
