package ywf.crud.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import ywf.crud.bean.Employee;
import ywf.crud.bean.EmployeeExample;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Wed Jul 03 15:03:44 CST 2019
     */
    long countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Wed Jul 03 15:03:44 CST 2019
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Wed Jul 03 15:03:44 CST 2019
     */
    int deleteByPrimaryKey(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Wed Jul 03 15:03:44 CST 2019
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Wed Jul 03 15:03:44 CST 2019
     */
    int insertSelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Wed Jul 03 15:03:44 CST 2019
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Wed Jul 03 15:03:44 CST 2019
     */
    Employee selectByPrimaryKey(Integer empId);

    List<Employee> selectByExampleWithDept (EmployeeExample example);

    Employee selectByPrimaryKeyWithDept(Integer empId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Wed Jul 03 15:03:44 CST 2019
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Wed Jul 03 15:03:44 CST 2019
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Wed Jul 03 15:03:44 CST 2019
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_emp
     *
     * @mbg.generated Wed Jul 03 15:03:44 CST 2019
     */
    int updateByPrimaryKey(Employee record);
}