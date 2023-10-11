package DAO;

import model.Loan;

public class LoanDao implements DAOInterface<Loan> {
    @Override
    public int insert(Loan loan) {
        return 0;
    }

    @Override
    public int update(Loan loan) {
        return 0;
    }

    @Override
    public int delete(Loan loan) {
        return 0;
    }

    @Override
    public Loan[] selectAll(Loan loan) {
        return new Loan[0];
    }

    @Override
    public Loan[] selectById(Loan loan) {
        return new Loan[0];
    }

    @Override
    public Loan[] selectByCondition(Loan loan) {
        return new Loan[0];
    }
}
