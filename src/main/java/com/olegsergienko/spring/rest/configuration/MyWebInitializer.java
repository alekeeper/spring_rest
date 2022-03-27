package com.olegsergienko.spring.rest.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {MyConfig.class}; // заменяет ссылку на файл applicationContext.xml
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"}; // вместо сервлета <url-pattern>/</url-pattern> (в файле web.xml)
    }
}
