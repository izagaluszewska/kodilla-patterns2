package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Arrays;
import java.util.Map;

public class Statistics implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        if (books.size() == 0) return 0;
        int result = books.entrySet().stream()
                .map(entry -> entry.getValue().getYearOfPublication())
                .reduce(0, (sum, current) -> sum = sum + current);
        return result / books.size();
    }

    @Override
    public int medianaPublicationYear(Map<BookSignature, Book> books) {
        if (books.size() == 0) return 0;
        int[] result = books.entrySet().stream()
                .mapToInt(entry -> entry.getValue().getYearOfPublication())
                .toArray();
        Arrays.sort(result);
        if (result.length % 2 == 0) {
            return result[(int)(result.length / 2 + 0.5)];
        } else {
            return result[result.length / 2];
        }
    }
}
