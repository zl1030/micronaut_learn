package com.zl1030;

import io.micronaut.context.annotation.Value;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import java.util.ResourceBundle;

@Controller("/git")
public class GitController {

    @Get(produces = MediaType.TEXT_PLAIN)
    public String index() {
        // 获取git.properties文件中的git.commit.id.abbrev属性值
        ResourceBundle bundle = ResourceBundle.getBundle("git");
        return bundle.getString("git.commit.id.abbrev");
    }
}
