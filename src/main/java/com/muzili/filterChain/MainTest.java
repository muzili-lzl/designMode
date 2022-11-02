package com.muzili.filterChain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 主程序登录
 * @author lizuoliang
 * @create 2022/10/22 14:27
 */
public class MainTest {
    public static void main(String[] args) throws ServletException, IOException {
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        String authorization = request.getHeader("Authorization");
        // todo 对authorization进行解析
        // todo 先进行登录权限校验，再进行权限校验，最后进行敏感词校验

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new AuthorizationFilter()).addFilter(new PermissionFilter());

        // 多个过滤器链处理
        FilterChain chain1 = new FilterChain();
        chain1.addFilter(new UrlFilter()).addFilter(new AuthorizationFilter());

        filterChain.addFilter(chain1);
        filterChain.doFilter(request, response, filterChain);
    }
}
