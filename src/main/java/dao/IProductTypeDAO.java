package dao;
import models.Employee;
import models.ProductType;

import java.util.List;

public interface IProductTypeDAO extends DAO<ProductType,Long>{
    void insert(Employee emp);
    void modify(Employee emp);
    void delete(Employee emp);

    List<ProductType> GetAllEmployee();
    ProductType GetBy(Long ID);
}
