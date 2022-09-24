package dao;
import models.Department;
import models.Employee;

import java.util.List;

public interface IDepartmentDAO extends DAO<Department,Long>{
    void insert(Employee emp);
    void modify(Employee emp);
    void delete(Employee emp);

    List<Department> GetAllEmployee();
    Department GetBy(Long ID);
}
