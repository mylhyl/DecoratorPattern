package com.example.decoratorpattern.demo;

public class JiuDirector {

    protected BaseJiuBuilder jiuBuilder;

    public JiuDirector(JiuBuilder jiuBuilder) {
        this.jiuBuilder = (BaseJiuBuilder) jiuBuilder;
    }

    // 这里是将酒名，酒瓶、酒水组装成完整的酒产品过程
    protected void construct() {
        jiuBuilder.buildJiuName(); // 品牌名称
        jiuBuilder.buildJiuPing(); // 酒瓶类型
        jiuBuilder.buildJiuShui(); // 酒水
    }

}
