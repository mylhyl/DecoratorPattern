package com.example.decoratorpattern.demo;

/**
 * 销往英格兰
 */
public class ENDecorator extends JiuDecorator {

    public ENDecorator(JiuDirector jiuDirector) {
        super(jiuDirector);
    }

    @Override
    public void buildJiuGai() {
        baseJiu.setJiuGai("英文酒盖，");
    }

    @Override
    public void buildJiuTieZhi() {
        baseJiu.setJiuTieZhi("英文瓶贴纸，");
    }

    @Override
    public void decorator() {
        buildJiuGai();
        buildJiuTieZhi();
    }

}
