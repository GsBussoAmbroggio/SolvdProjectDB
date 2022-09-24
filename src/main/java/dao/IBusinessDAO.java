package dao;
import models.Business;
import models.Employee;

import java.util.List;

public interface IBusinessDAO extends DAO<Business,Long>{
    void insert(Employee emp);
    void modify(Employee emp);
    void delete(Employee emp);

    List<Business> GetAllEmployee();
    Business GetBy(Long ID);
}
