package DAO;

public interface DAOInterface <T>{
    public int insert(T t);
    public int update(T t);
    public int delete (T t);
    public T[] selectAll (T t);
    public T[] selectById (T t);
    public T[] selectByCondition(T t);
}
