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
		
		System.out.println("����������ʼ����");
	}

	public void destroy() {
		System.out.println("�����������٣�");
	}

	public void doFilter(ServletRequest request, ServletResponse response,	FilterChain filterChain) throws IOException, ServletException 
	{
		request.setCharacterEncoding("UTF-8");
       	response.setCharacterEncoding("UTF-8");
        System.out.println("FilterDemo1ִ��ǰ��");
        filterChain.doFilter(request, response);
        System.out.println("FilterDemo1ִ�к�");
        
	}
}
