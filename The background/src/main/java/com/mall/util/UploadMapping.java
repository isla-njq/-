package util;

/*
@author
@create 2021-07-24-8:39
*/

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class UploadMapping implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upfile/**").addResourceLocations("file:C:/proj_img/");
        //WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
