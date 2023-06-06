import classe.*;
import enums.Gender;
import enums.Genre;
import services.BookService;
import services.LibraryService;
import services.ReaderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Book>books = new ArrayList<>(
                List.of(new Book(111l,"If you not first,than you last","Grand Cardone", Genre.HISTORY),
                        new Book(222l,"love you baby","Phill Knight",Genre.ROMANCE),
                        new Book(444l,"Come back","Jake Hilson",Genre.FANTASY),
                        new Book(444l,"Same way","Simon Hendrick",Genre.ROMANCE),
                        new Book(444l,"How can catch me","Dame Jake",Genre.DETECTIVE)));
        List<Book>books1 = new ArrayList<>(List.of(books.get(0),books.get(1),books.get(2)));
        List<Book>books2 = new ArrayList<>(List.of(books.get(3),books.get(4)));

        List<Reader>readers = new ArrayList<>(
                List.of(new Reader(1l,"Kerstin Norda","kerstin@gmail.com",022234, Gender.FAMELE),
                        new Reader(2l,"Leanardo Dicaprio","leanardo@gmail.com",022223, Gender.MALE),
                        new Reader(3l,"Brett Bit ","brett@gmail.com",022244, Gender.MALE),
                        new Reader(4l,"Ed Shereen","ed@gmail.com",022267, Gender.MALE)));
        List<Reader>readers1 = new ArrayList<>(List.of(readers.get(0),readers.get(1)));
        List<Reader>readers2 = new ArrayList<>(List.of(readers.get(2),readers.get(3)));

        List<Library>libraries = new ArrayList<>(
                List.of(new Library(24l,"Global Library","Lout str.23",books1,readers1),
                        new Library(55l,"Darvin Library","Bassterman str.56",books2,readers2)));


        DataBase dataBase = new DataBase(libraries,readers,books);

        LibraryService libraryService = new LibraryService(dataBase);
        BookService bookService = new BookService(dataBase);
        ReaderService readerService = new ReaderService(dataBase);
        int b = 0;
        while (b<=15){
        int s = new Scanner(System.in).nextInt();

        switch (s) {
            case 1:
                System.out.println("Libraries are saved:");
                System.out.println(libraryService.saveLibrary(libraries));
                break;
            case 2:
                System.out.println("You have got all libraries:");
                System.out.println(libraryService.getAllLibraries());
                break;
            case 3:
                System.out.println("Search library by id:");
                System.out.println(libraryService.getLibraryById(24l));
            break;
            case 4:
                System.out.println("Library is successfully updated:");
                System.out.println(libraryService.updateLibrary(55l, new Library(23l, "Stutgart Library", "Baumbach st.453")));
            break;
            case 5:
                System.out.println("Library is successfully deleted:");
                System.out.println(libraryService.deleteLibrary(15l));
            break;
            case 6:
                System.out.println("Save book:");
                System.out.println(bookService.saveBook(23l, new Book(7777l, "5 Rules to success", "Brayan Traysy", Genre.HISTORY)));
            break;
            case 7:
                System.out.println("Get all books:");
                System.out.println(bookService.getAllBooks(24l));
            break;
            case 8:
                System.out.println("Search book by id:");
                System.out.println(bookService.getBookById(23l, 222l));
            break;
            case 9:
                System.out.println("Book is successfully deleted: ");
                System.out.println(bookService.deleteBook(24l, 111l));
            break;
            case 10:
                System.out.println("Books are not finded:");
                bookService.clearBooksByLibraryId(24l);
            break;
            case 11:
                System.out.println("Save readers:");
                readerService.saveReader(new Reader(5L,"Imagine Dragens","imagine@gmail.com",7777,Gender.MALE));
            break;
            case 12:
                System.out.println("Get all readers:");
                System.out.println(readerService.getAllReaders());
            break;
            case 13:
                System.out.println("Search reader by id:");
                System.out.println(readerService.getReaderById(2l));
            break;
            case 14:
                System.out.println("Reader is successfully updated:");
                System.out.println(readerService.updateReader(1l, new Reader(1l, "James Arthur", "james@gmail.com", 9993, Gender.MALE)));
           break;
            case 15:
                System.out.println("Assign reader to library:");
                readerService.assignReaderToLibrary(1l,55l);

        }
        }
    }
}
























//            case 2:
//                libraryService.getLibraryById(libraries,24l);
//        break;
//            case 3:
//                libraryService.updateLibrary(24l,"Stutgart", libraries);
//
//        break;
//            case 4:
//                libraryService.deleteLibrary(libraries,55l);
//
//        break;
//            case 5:
//                System.out.println(bookService.saveBook(books));
//                break;
//            case 6:
//                bookService.getBookById(books,34l);
//                break;
//            case 7:
//                bookService.clearBooksByLibraryId(55l) ;
//
//
