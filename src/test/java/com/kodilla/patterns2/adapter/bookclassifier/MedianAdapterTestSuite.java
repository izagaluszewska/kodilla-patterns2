package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedian() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("S. Smith", "Era", 2011, "1234"));
        bookSet.add(new Book("A. Rude", "Amber", 2000, "5678"));
        bookSet.add(new Book("W. Willis", "Cat", 1951, "1567"));
        bookSet.add(new Book("F. Nit", "Dog", 2001, "1235"));
        bookSet.add(new Book("Z. Kio", "Jazz", 1923, "1340"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        int median = adapter.publicationYearMediana(bookSet);
        //Then
        System.out.println(median);
        Assert.assertEquals(2000, median);
    }
}
