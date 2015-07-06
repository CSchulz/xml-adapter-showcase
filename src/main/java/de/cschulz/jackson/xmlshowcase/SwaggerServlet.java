package de.cschulz.jackson.xmlshowcase;

import com.fasterxml.jackson.module.jaxb.JaxbAnnotationModule;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.util.Json;
import io.swagger.util.Yaml;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class SwaggerServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);

        Json.mapper().registerModule(new JaxbAnnotationModule());
        Yaml.mapper().registerModule(new JaxbAnnotationModule());

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("v1");
        beanConfig.setResourcePackage("de.cschulz.jackson.xmlshowcase");
        beanConfig.setPrettyPrint(true);
        beanConfig.setScan(true);

    }
}
