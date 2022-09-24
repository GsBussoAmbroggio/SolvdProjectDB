package dao;

import models.Branch;
import models.Employee;

import java.util.List;

public interface IBranchDAO extends DAO<Branch,Long>{
    void insert(Employee emp);
    void modify(Employee emp);
    void delete(Employee emp);

    List<Branch> GetAllEmployee();
    Branch GetBy(Long ID);
}
