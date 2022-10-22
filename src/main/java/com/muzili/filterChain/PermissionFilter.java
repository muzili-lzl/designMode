package com.muzili.filterChain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 权限校验
 * @author lizuoliang
 * @create 2022/10/22 14:26
 */
public class PermissionFilter implements Filter{
    @Override
    public boolean doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // todo 进行权限校验业务逻辑
        filterChain.doFilter(request, response, filterChain);
        return false;
    }
}
