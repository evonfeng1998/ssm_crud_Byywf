package ywf.crud.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ywf.crud.bean.Department;
import ywf.crud.dao.DepartmentMapper;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
private DepartmentMapper departmentMapper;


 public List<Department> getDepts(){
     List<Department> list = departmentMapper.selectByExample(null);
     return list;
 }
}
