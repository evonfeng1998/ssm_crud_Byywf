package ywf.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ywf.crud.bean.Employee;
import ywf.crud.bean.EmployeeExample;
import ywf.crud.bean.Msg;
import ywf.crud.dao.EmployeeMapper;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    /*查询所有员工*/
    public List<Employee> getAll() {
        return employeeMapper.selectByExampleWithDept(null);
    }

//    保存员工
    public void saveEmp(Employee employee) {
        employeeMapper.insertSelective(employee);
    }

//    检查用户名是否合法
    public boolean checkUsr(String empName) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
        criteria.andEmpNameEqualTo(empName);
        long count = employeeMapper.countByExample(example);
        return count == 0;
    }

    //    员工ID查询员工
    public Employee getEmp(Integer id) {
        Employee employee = employeeMapper.selectByPrimaryKeyWithDept(id);
        return employee;
    }

//更新员工
    public void updateEmp(Employee employee) {
employeeMapper.updateByPrimaryKeySelective(employee);
    }



    public void deleteEmp(Integer id) {
        employeeMapper.deleteByPrimaryKey(id);
    }

    public void deleteBatch(List<Integer> ids) {
        EmployeeExample example = new EmployeeExample();
        EmployeeExample.Criteria criteria = example.createCriteria();
//        delete from xxx where emp_id in(1,2,3)
        criteria.andEmpIdIn(ids);
        employeeMapper.deleteByExample(example);
    }

//    员工保存

}