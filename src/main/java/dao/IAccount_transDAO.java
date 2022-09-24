package dao;

import models.Account_trans;
import models.Employee;

import java.util.List;

public interface IAccount_transDAO extends DAO<Account_trans,Long> {
    void insert(Employee emp);
    void modify(Employee emp);
    void delete(Employee emp);

    List<Account_trans> GetAllEmployee();
    Account_trans GetBy(Long ID);
}
