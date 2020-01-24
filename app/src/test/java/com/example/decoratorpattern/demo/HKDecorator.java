package com.example.decoratorpattern.demo;

/**
 * 销往中国香港
 */
public class HKDecorator extends ENDecorator {

    public HKDecorator(JiuDirector jiuDirector) {
        super(jiuDirector);
    }

    @Override
    public void buildJiuGai() {
        super.buildJiuGai();
        baseJiu.setJiuGai(baseJiu.getJiuGai() + "繁体字酒盖，");
    }

    @Override
    public void buildJiuTieZhi() {
        super.buildJiuTieZhi();
        baseJiu.setJiuTieZhi(baseJiu.getJiuTieZhi() + "繁体字瓶贴纸，");
    }

    @Override
    public void decorator() {
        super.decorator();
        buildJiuGai();
        buildJiuTieZhi();
    }
}
