package com.muzili.filterChain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录权限校验
 * @author lizuoliang
 * @create 2022/10/22 14:27
 */
public class AuthorizationFilter implements Filter {
    @Override
    public boolean doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // todo 进行登录权限校验
        filterChain.doFilter(request, response, filterChain);
        return true;
    }
}
