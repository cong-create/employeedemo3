package org.zc.interecptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import org.zc.pojo.Employee;

public class LoginInterceptor implements HandlerInterceptor {

	//控制器方法执行完之后调用
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}
	
	//控制器返回ModelAndView arg3之前调用
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}
	//进入控制器方法之前调用 方法如果返回true就行放行，false就是不放行
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		//获取uri地址
		String uri = request.getRequestURI();
		System.out.println("-----------"+uri+"-----------");
		//如果是登录的路径就放行
		if(uri.endsWith("login.do")){
			return true;
		}
		HttpSession session = request.getSession();
		Employee employee = (Employee) session.getAttribute("emp");
		//如果employee为空，表示用户没有登录过
		if(employee==null){
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return false;
		}
		return true;
	}

}
