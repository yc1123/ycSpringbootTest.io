package com.yc.girl;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private String cupSize;
    private Integer age;
    private String content;

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCupSize() {

        return cupSize;
    }

    public Integer getAge() {
        return age;
    }

    public String getContent() {
        return content;
    }
}
