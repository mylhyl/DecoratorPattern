package com.example.decoratorpattern.demo;

public class HaiZhuJiuJiuBuilder extends BaseJiuBuilder {

    @Override
    public void buildJiuName() {
        baseJiu.setName("珠海啤酒。");
    }

    @Override
    public void buildJiuPing() {
        // 具体的创建酒瓶
        baseJiu.setJiuPing("玻璃瓶，");
    }

    @Override
    public void buildJiuShui() {
        // 具体的创建酒水，最好是12度的，哈哈
        baseJiu.setJiuShui("麦芽度含量12，");
    }

    @Override
    protected BaseJiu newJiu() {
        return new HaiZhuIJiu();
    }

}
