package com.csi.dao;

import com.csi.model.Employee;

import java.util.List;

public interface EmployeeDao {
    public void signup(Employee employee);

    public  boolean signin(String empEmailId,String empPassword);
}
