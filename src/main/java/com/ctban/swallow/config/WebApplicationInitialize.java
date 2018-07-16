package com.ctban.swallow.config;

import com.ctban.swallow.filter.TestFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @author GuoJie 2018/7/2 12:23
 *         程序入口 初始化 dispatcherServlet 启动 ContextLoaderListener
 */
public class WebApplicationInitialize extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * 配置
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    /**
     * 配置DispatcherServlet
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{DispatcherServletConfig.class};
    }

    /**
     * 配置映射
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 配置过滤器
     *
     * @return
     */
    @Override
    protected Filter[] getServletFilters() {
        return new Filter[]{new TestFilter()};
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        super.onStartup(servletContext);
        FilterRegistration.Dynamic testFilter = servletContext.addFilter("testFilter", TestFilter.class);
        testFilter.addMappingForUrlPatterns(null,false,"/**");

    }
}
