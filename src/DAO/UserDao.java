package DAO;

import DTO.User;

public class UserDao implements DAOInterface<User>{
    @Override
    public int insert(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public int delete(User user) {
        return 0;
    }

    @Override
    public User[] selectAll(User user) {
        return new User[0];
    }

    @Override
    public User[] selectById(User user) {
        return new User[0];
    }

    @Override
    public User[] selectByCondition(User user) {
        return new User[0];
    }
}
