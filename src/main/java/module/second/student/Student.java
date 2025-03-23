package module.second.student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private List<Book> books;

    public Student (){
        this.books = new ArrayList<>();
    }
    //todo
    @Override
    public String toString(){
        return name + ": " +
                books.stream()
                        .map(Book::toString)
                        .collect(Collectors.joining(", "));
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBooks(Book book) {
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }


}