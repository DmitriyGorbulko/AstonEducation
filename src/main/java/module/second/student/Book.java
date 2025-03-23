package module.second.student;

import java.util.List;
import java.util.Objects;

//todo смотри ниже
public class Book {
    private String title;
    private int countPage;
    private int year;


    @Override
    public String toString() {
        return title + " " + countPage + " " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return countPage == book.countPage &&
                year == book.year &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, countPage, year);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public int getCountPage() {
        return countPage;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    //private

    /* public List<Book> getAllBooks() {

    }

    public List<Book> getUniqueBooks() {

    }

    public List<Book> getBookAfterYear(){

    }

    //todo короткое замыкание и еще последний пункт

    public List<Integer> getYearInBook(){

    }*/
}
