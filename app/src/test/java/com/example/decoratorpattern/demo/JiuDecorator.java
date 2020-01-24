package com.example.decoratorpattern.demo;

public abstract class JiuDecorator {

    /**
     * 装饰酒盖，子类实现
     */
    public abstract void buildJiuGai();

    /**
     * 装饰酒瓶的贴纸，子类实现
     */
    public abstract void buildJiuTieZhi();

    protected BaseJiu baseJiu;// 酒对象

    /**
     * @param jiuDirector 酒的建造
     */
    public JiuDecorator(JiuDirector jiuDirector) {
        this.baseJiu = jiuDirector.jiuBuilder.baseJiu;
        // 开始建造
        jiuDirector.construct();
    }

    public abstract void decorator();
}
