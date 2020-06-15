package org.zc.realms;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.zc.pojo.Employee;
import org.zc.service.EmployeeService;
import org.zc.service.UserroleService;

public class MyRealm extends AuthorizingRealm {

	@Autowired
	private EmployeeService eService;
	@Autowired
	private UserroleService uService;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection collection) {
		String uname = (String) collection.getPrimaryPrincipal();
		List<String> roles = uService.getUserRole(uname);
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.addRoles(roles);
		return info;
	}

	@Override//身份认证
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String uname = (String) token.getPrincipal();
		Employee employee = eService.login1(uname);
		SimpleAuthenticationInfo info = 
				new SimpleAuthenticationInfo(uname, employee.getUpass(), getName());
		return info;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "MyRealm";
	}

}
