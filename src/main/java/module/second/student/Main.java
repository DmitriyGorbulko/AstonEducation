package module.second.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Добавление книг
        List<Book> books = createBooks();

        //Добавление студентов
        List<Student> students = new ArrayList<>();

        Student student1 = new Student();
        student1.setName("Иван");
        student1.setBooks(books.get(0));
        student1.setBooks(books.get(1));

        Student student2 = new Student();
        student2.setName("Олег");
        student2.setBooks(books.get(0));

        Student student3 = new Student();
        student3.setName("Михаил");
        student3.setBooks(books.get(0));
        student3.setBooks(books.get(3));

        students.add(student1);
        students.add(student2);
        students.add(student3);

        //Вывести в консоль каждого студента (переопределите toString)
        //Получить для каждого студента список книг
        students.stream().forEach(System.out::println);

        System.out.println();

        //Получить книги
        //Отсортировать книги по количеству страниц (Не забывайте про условия для сравнения объектов)
        books.stream()
                .sorted(java.util.Comparator.comparingInt(Book::getCountPage))
                .forEach(System.out::println);

        System.out.println();

        //Оставить только уникальные книги
        books.stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println();

        //Отфильтровать книги, оставив только те, которые были выпущены после 2000 года
        books.stream()
                .filter(book -> book.getYear() > 2000)
                .forEach(System.out::println);

        System.out.println();

        //Ограничить стрим на 3 элементах
        //Получить из книг годы выпуска
        books.stream()
                .limit(3)
                .map(Book::getYear)
                .forEach(System.out::println);

        System.out.println();

        //При помощи методов короткого замыкания (почитайте самостоятельно что это такое) вернуть Optional от книги
        //При помощи методов получения значения из Optional вывести в консоль год выпуска найденной книги,
        //либо запись о том, что такая книга отсутствует
        books.stream()
                .findFirst()
                .ifPresentOrElse(
                        book -> System.out.println(book.getYear()),
                        () -> System.out.println("Книга не найдена.")
                );
    }

    private static ArrayList<Book> createBooks() {
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book();
        book1.setTitle("Book#1");
        book1.setCountPage(300);
        book1.setYear(1999);

        Book book2 = new Book();
        book2.setTitle("Book#2");
        book2.setCountPage(328);
        book2.setYear(2003);

        Book book3 = new Book();
        book3.setTitle("Book#3");
        book3.setCountPage(200);
        book3.setYear(2022);

        Book book4 = new Book();
        book4.setTitle("Book#3");
        book4.setCountPage(200);
        book4.setYear(2022);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        return books;
    }
}
