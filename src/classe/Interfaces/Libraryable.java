package classe.Interfaces;

import classe.Library;

import java.util.List;

public interface Libraryable {
    List<Library>saveLibrary(List<Library>libraries);

    List<Library>getAllLibraries();

    Library getLibraryById(Long id);

    Library updateLibrary(Long id, Library library);

    String deleteLibrary(Long id);
}
