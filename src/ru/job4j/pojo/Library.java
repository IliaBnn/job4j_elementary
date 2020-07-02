package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book firstBook = new Book("Lord of Rings", 1000);
        Book secondBook = new Book("War and Peace", 700);
        Book thirdBook = new Book("Clean code", 500);
        Book fourthBook = new Book("Leina", 415);
        Book[] books = new Book[4];
        books[0] = firstBook;
        books[1] = secondBook;
        books[2] = thirdBook;
        books[3] = fourthBook;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCountOfPage());
        }
        System.out.println("Replace 3 to 0");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i].getName() + " " + books[i].getCountOfPage());
        }
        System.out.println("Print only Clean code");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean code")) {
                System.out.println(books[i].getName() + " " + books[i].getCountOfPage());
            }
        }
    }
}
