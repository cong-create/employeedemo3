package org.zc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.zc.pojo.Employee;

public interface EmployeeMapper {
	//登录验证
	@Select("select * from employee where uname=#{uname} and upass=#{upass}")
	Employee getEmp(@Param("uname")String uname,@Param("upass")String upass);
	
	@Select("select * from employee where uname=#{uname}")
	Employee login1(String uname);
	//查询所有用户信息
	@Select("select * from employee")
	List<Employee> getEmps();
	
	//插入数据
	@Insert("insert into employee(uname,upass,age,phone,address) values(#{uname},#{upass},#{age},#{phone},#{address})")
	void insertEmp(Employee employee);
	//修改数据
	@Update("update employee set uname=#{uname},upass=#{upass},age=#{age},phone=#{phone},address=#{address} where id=#{id}")
	void updateEmp(Employee employee);
	//查询数据
	@Select("select * from employee where id=#{id}")
	Employee getEmp1(int id);
	//删除数据
	@Delete("delete from employee where id=#{id}")
	void deleteEmp(int id);
}
