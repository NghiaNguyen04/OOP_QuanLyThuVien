package DAO;

import DTO.Book;

public class BookDao implements DAOInterface<Book>{

    @Override
    public int insert(Book book) {
        return 0;
    }

    @Override
    public int update(Book book) {
        return 0;
    }

    @Override
    public int delete(Book book) {
        return 0;
    }

    @Override
    public Book[] selectAll(Book book) {
        return new Book[0];
    }

    @Override
    public Book[] selectById(Book book) {
        return new Book[0];
    }

    @Override
    public Book[] selectByCondition(Book book) {
        return new Book[0];
    }
}
