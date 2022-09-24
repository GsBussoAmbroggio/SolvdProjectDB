package dao;

import models.Employee;

import java.util.List;

public interface IEmployeeDAO extends DAO<Employee, Long> {
    void insert(Employee emp);
    void modify(Employee emp);
    void delete(Employee emp);

    List<Employee> GetAllEmployee();
    Employee GetBy(Long ID);

}
