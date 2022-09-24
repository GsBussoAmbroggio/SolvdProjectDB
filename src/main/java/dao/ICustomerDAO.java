package dao;
import models.Customer;
import models.Employee;

import java.util.List;

public interface ICustomerDAO extends DAO<Customer,Long>{
    void insert(Employee emp);
    void modify(Employee emp);
    void delete(Employee emp);

    List<Customer> GetAllEmployee();
    Customer GetBy(Long ID);
}
