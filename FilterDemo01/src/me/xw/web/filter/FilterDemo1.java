package me.xw.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo1 implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		
		System.out.println("过滤器，初始化！");
	}

	public void destroy() {
		System.out.println("过滤器，销毁！");
	}

	public void doFilter(ServletRequest request, ServletResponse response,	FilterChain filterChain) throws IOException, ServletException 
	{
		request.setCharacterEncoding("UTF-8");
       	response.setCharacterEncoding("UTF-8");
        System.out.println("FilterDemo1执行前！");
        filterChain.doFilter(request, response);
        System.out.println("FilterDemo1执行后！");
        
	}
}
