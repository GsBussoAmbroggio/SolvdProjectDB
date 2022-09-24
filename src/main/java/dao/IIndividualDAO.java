package dao;

import models.Employee;
import models.Individual;

import java.util.List;

public interface IIndividualDAO extends DAO<Individual,Long>{

    void insert(Employee e);

    void modify(Employee e);

    void delete(Employee e);
}
