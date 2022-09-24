package dao;
import models.Employee;
import models.Product;

import java.util.List;

public interface IProductDAO extends DAO<Product,Long>{
    void insert(Employee emp);
    void modify(Employee emp);
    void delete(Employee emp);

    List<Product> GetAllEmployee();
    Product GetBy(Long ID);
}
