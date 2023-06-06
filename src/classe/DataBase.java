package classe;

import classe.Library;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Library>libraries = new ArrayList<>();
    private List<Reader>readers = new ArrayList<>();
    private List<Book>books = new ArrayList<>();

    public DataBase(List<Library> libraries, List<Reader> readers, List<Book> books) {
        this.libraries = libraries;
        this.readers = readers;
        this.books = books;
    }
    public DataBase(){

    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
