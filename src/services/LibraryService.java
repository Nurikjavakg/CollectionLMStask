package services;

import classe.DataBase;
import classe.Library;
import classe.Interfaces.Libraryable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibraryService implements Libraryable {

    private DataBase dataBase;

    public LibraryService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        for (Library library: libraries) {
            library.getReaders();

        }return dataBase.getLibraries();
    }

    @Override
    public List<Library> getAllLibraries() {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {

        }
        return dataBase.getLibraries();
    }


    @Override
    public Library getLibraryById(Long id) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if(dataBase.getLibraries().get(i).getId().equals(id)){
              return dataBase.getLibraries().get(i);

        }
            }
        return null;
    }

    @Override
    public Library updateLibrary(Long id, Library library) {
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if(dataBase.getLibraries().get(i).getId().equals(id)){
                dataBase.getLibraries().get(i).setName(library.getName());
                dataBase.getLibraries().get(i).setAddress(library.getAddress());
                dataBase.getLibraries().get(i).setId(library.getId());
                return dataBase.getLibraries().get(i);
        }


            } return null;
        }



    @Override
    public String deleteLibrary( Long id) {
        for (Library library:dataBase.getLibraries()) {
            if(library.getId().equals(id)){
                dataBase.getLibraries().remove(library);
                return "Library is successfully deleted:";

        }

            }return "Library not found ";
        }
}




