package DAO;
import model.Librarian;
public class LibrarianDao implements DAOInterface<Librarian>{

    @Override
    public int insert(Librarian librarian) {
        return 0;
    }

    @Override
    public int update(Librarian librarian) {
        return 0;
    }

    @Override
    public int delete(Librarian librarian) {
        return 0;
    }

    @Override
    public Librarian[] selectAll(Librarian librarian) {
        return new Librarian[0];
    }

    @Override
    public Librarian[] selectById(Librarian librarian) {
        return new Librarian[0];
    }

    @Override
    public Librarian[] selectByCondition(Librarian librarian) {
        return new Librarian[0];
    }
}
