package com.muzili.filterChain;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链
 * @author lizuoliang
 * @create 2022/10/22 14:23
 */
public class FilterChain implements Filter{

    List<Filter> filterList = new ArrayList<>();

    int index = 0;

    public FilterChain addFilter(Filter filter){
        filterList.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        for (Filter filter : filterList) {
//            // 进行逻辑判断
//            if (!filter.doFilter(request, response, filterChain)){
//                // 比如说在某个过滤器中，如果达到了某一个条件就直接结束，不再执行之后的过滤
//                return false;
//            }
//        }
        // request1 -> request2 -> request3 -> response3 -> response2 -> response1
        if (index == filterList.size()){
            // 如果执行完成了，开始反向返回
            return false;
        }
        Filter filter = filterList.get(index);
        index++;
        return filter.doFilter(request, response, filterChain);
    }

}
