package com.example.decoratorpattern.demo;

public abstract class BaseJiuBuilder implements JiuBuilder {

    // 创建酒名
    public abstract void buildJiuName();

    // 创建酒瓶
    public abstract void buildJiuPing();

    // 创建酒水
    public abstract void buildJiuShui();

    protected BaseJiu baseJiu = newJiu();

    protected abstract BaseJiu newJiu();

    @Override
    public final IJiu getResult() {
        return baseJiu;
    }

}
