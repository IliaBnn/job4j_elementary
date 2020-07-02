package ru.job4j.pojo;

public class Book {

    private int countOfPage;
    private String name;

    public Book(String name, int countOfPage) {
        this.name = name;
        this.countOfPage = countOfPage;
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public void setCountOfPage(int countOfPage) {
        this.countOfPage = countOfPage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
