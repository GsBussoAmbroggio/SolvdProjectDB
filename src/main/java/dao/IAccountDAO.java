package dao;

import models.Account;
import models.Employee;

import java.util.List;

public interface IAccountDAO extends DAO<Account,Long>{
    void insert(Employee emp);
    void modify(Employee emp);
    void delete(Employee emp);

    List<Account> GetAllEmployee();
    Account GetBy(Long ID);
}
