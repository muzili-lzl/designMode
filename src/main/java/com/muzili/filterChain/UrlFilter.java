package com.muzili.filterChain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 路径过滤器
 * @author lizuoliang
 * @create 2022/10/22 14:54
 */
public class UrlFilter implements Filter{
    @Override
    public boolean doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        filterChain.doFilter(request, response, filterChain);
        return true;
    }
}
