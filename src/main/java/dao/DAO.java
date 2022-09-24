package dao;

import models.Employee;

import java.util.List;

public interface DAO<T,K> {
    void insert(T e);
    void modify(T e);
    void delete(T e);

    List<T> GetAllEmployee();
    T GetBy(K ID);

}
