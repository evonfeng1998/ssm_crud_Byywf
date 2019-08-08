

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ywf.crud.bean.Department;
import ywf.crud.bean.Employee;
import ywf.crud.dao.DepartmentMapper;
import ywf.crud.dao.EmployeeMapper;

import java.util.UUID;

/*测试dao层工作
推荐Spring的项目就可以使用SPring单元测试，可以自动注入我们需要的组件。所以下面注掉
1、导入 SpringTest模块
2、@ContextConfiguration指定Spring配置文件的位置
3、直接authwired要用的组件即可
*/
@RunWith(SpringJUnit4ClassRunner.class)//用哪个单元测试
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    SqlSession sqlSession;

    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;
    //    测试DepartmentMAPPER
    @Test
    public void testCRUD(){
/*//  1.创建SPRINGioc容器
    ApplicationContext ioc =new ClassPathXmlApplicationContext("/home/ywf/IdeaProjects/ssm_curd/src/main/resources/applicationContext.xml");
//   2.从容器中获取mapper
     DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);*/
        System.out.println(departmentMapper);

//       11 插入几个部门
//       departmentMapper.insertSelective(new Department(null,"开发部"));
//      departmentMapper.insertSelective(new Department(null,"测试部"));

//         22生成员工信息，测试员工插入
//            employeeMapper.insertSelective(new Employee(null, "jerry", "m", "jerry@ywf.com", 1));

//        33批量插入多个员工；
//        for(){
//            employeeMapper.insertSelective(new Employee(null, "jerry", "m", "jerry@ywf.com", 1));
//        }
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        for (int i = 0; i < 1000; i++) {
            String uid =UUID.randomUUID().toString().substring(0, 5)+i;
            mapper.insertSelective(new Employee(null,  uid,"M" , uid+"@ywf.com",1));
        }
        System.out.println("批量完成");


    }
}