package com.muzili.filterChain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 敏感词过滤
 * @author lizuoliang
 * @create 2022/10/22 14:25
 */
public class SensitiveFilter implements Filter{

    @Override
    public boolean doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        // todo 进行敏感词过滤
        filterChain.doFilter(request, response, filterChain);
        return true;
    }

}
