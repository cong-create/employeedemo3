package org.zc.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zc.mapper.EmployeeMapper;
import org.zc.pojo.Employee;
import org.zc.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper mapper;
	/**
	 * boolean:如果返回值为true，验证成功，否则验证失败
	 */
	@Override
	public boolean login(String uname, String upass) {
		boolean flag = false;
		Employee emp = mapper.getEmp(uname, upass);
		if(emp != null){
			flag = true;
		}
		return flag;
	}
	@Override
	public List<Employee> getEmps() {
		return mapper.getEmps();
	}
	@Override
	public void insertEmp(Employee employee) {
		mapper.insertEmp(employee);
	}
	@Override
	public void updateEmp(Employee employee) {
		mapper.updateEmp(employee);
	}
	@Override
	public Employee getEmp1(int id) {
		return mapper.getEmp1(id);
	}
	@Override
	public void deleteEmp(int id) {
		mapper.deleteEmp(id);
	}
	@Override
	public Employee login1(String uname) {
		// TODO Auto-generated method stub
		return mapper.login1(uname);
	}

}
