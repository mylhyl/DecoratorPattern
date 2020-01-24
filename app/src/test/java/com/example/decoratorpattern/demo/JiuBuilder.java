package com.example.decoratorpattern.demo;

public interface JiuBuilder {

    // 创建酒名
    void buildJiuName();

    // 创建酒瓶
    void buildJiuPing();

    // 创建酒水
    void buildJiuShui();

    //返回最后组装成品结果
    IJiu getResult();

}
