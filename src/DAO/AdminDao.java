package DAO;

import DTO.Admin;

public class AdminDao implements DAOInterface<Admin>{

    @Override
    public int insert(Admin admin) {
        return 0;
    }

    @Override
    public int update(Admin admin) {
        return 0;
    }

    @Override
    public int delete(Admin admin) {
        return 0;
    }

    @Override
    public Admin[] selectAll(Admin admin) {
        return new Admin[0];
    }

    @Override
    public Admin[] selectById(Admin admin) {
        return new Admin[0];
    }

    @Override
    public Admin[] selectByCondition(Admin admin) {
        return new Admin[0];
    }
}
