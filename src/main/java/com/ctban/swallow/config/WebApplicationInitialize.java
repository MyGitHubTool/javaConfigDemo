package com.ctban.swallow.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

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
}
