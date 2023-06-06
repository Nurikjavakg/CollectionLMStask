package services;

import classe.Book;
import classe.DataBase;
import classe.Interfaces.Bookable;
import classe.Library;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookService implements Bookable {

    private DataBase dataBase;

    public BookService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public Book saveBook(Long libraryId, Book book) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (dataBase.getLibraries().get(i).equals(libraryId)) {
                dataBase.getLibraries().get(i).getBooks().add(book);

            }

        }
        return book;

    }

    @Override
    public List<Book> getAllBooks(Long libraryId) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if (dataBase.getLibraries().get(i).getId().equals(libraryId)) {
                return dataBase.getLibraries().get(i).getBooks();


            }

        }
        return null;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if(dataBase.getLibraries().get(i).getId().equals(bookId)){
            }
            if(dataBase.getBooks().get(i).getId().equals(bookId)){
                return dataBase.getBooks().get(i);
            }
        }
        return null;
    }
    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if(dataBase.getLibraries().get(i).getId().equals(libraryId)) {
                List<Book> books = new ArrayList<>();
                books = dataBase.getLibraries().get(i).getBooks();
                for (int j = 0; j < books.size(); j++) {
                    if (books.get(i).getId().equals(bookId)) {
                        books.remove(i);
                    }
                }
            }
        }
        return "deleted";
    }
    @Override
    public void clearBooksByLibraryId(Long libraryId) {
        for (Library library: dataBase.getLibraries()) {
            if(library.getId().equals(libraryId)){
                library.getBooks().clear();
                System.out.println(library);

        }

        }

        }

        }



