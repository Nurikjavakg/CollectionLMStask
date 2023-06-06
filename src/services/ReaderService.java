package services;

import classe.DataBase;
import classe.Reader;
import classe.Interfaces.Readerable;
import enums.Gender;

import java.util.List;

public class ReaderService implements Readerable {
    private DataBase dataBase;

    public ReaderService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void saveReader(Reader reader) {
        dataBase.getReaders().add(reader);
        System.out.println(dataBase.getReaders());


    }

    @Override
    public List<Reader> getAllReaders() {
        for (int i = 0; i < dataBase.getReaders().size(); i++) {
            return dataBase.getReaders();

        }
        return null;
    }

    @Override
    public Reader getReaderById(Long id) {
        for (int i = 0; i < dataBase.getReaders().size(); i++) {
            if(dataBase.getReaders().get(i).getId().equals(id)){
                return dataBase.getReaders().get(i);
            }

        }
        return null;
    }

    @Override
    public Reader updateReader(Long id, Reader reader) {
        for (int i = 0; i < dataBase.getReaders().size(); i++) {
            if(dataBase.getReaders().get(i).getId().equals(id)){
                dataBase.getReaders().get(i).setFullName(reader.getFullName());
                dataBase.getReaders().get(i).setEmail(reader.getEmail());
                dataBase.getReaders().get(i).setId(reader.getId());
                dataBase.getReaders().get(i).setGender(reader.getGender());
                return dataBase.getReaders().get(i);
            }

        }
        return null;
    }

    @Override
    public void assignReaderToLibrary(Long readerId, Long libraryId) {
         Reader reader = getReaderById(readerId);
        for (int i = 0; i < dataBase.getLibraries().size(); i++) {
            if(dataBase.getReaders().get(i).getId().equals(libraryId)){
                dataBase.getReaders().add(reader);
                System.out.println(dataBase.getReaders());


        }

            }

        }
                }



