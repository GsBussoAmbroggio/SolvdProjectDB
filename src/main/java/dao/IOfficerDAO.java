package dao;
import models.Employee;
import models.Officer;

import java.util.List;

public interface IOfficerDAO extends DAO<Officer,Long>{
    void insert(Employee emp);
    void modify(Employee emp);
    void delete(Employee emp);

    List<Officer> GetAllEmployee();
    Officer GetBy(Long ID);
}
