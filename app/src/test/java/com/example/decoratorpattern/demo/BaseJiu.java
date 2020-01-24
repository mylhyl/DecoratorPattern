package com.example.decoratorpattern.demo;

/**
 * 酒组成部位：酒瓶，酒水、酒盖，贴纸
 */
public class BaseJiu implements IJiu {

    private String name;// 品牌
    private String jiuPing; // 酒瓶
    private String jiuShui; // 酒水
    private String jiuGai; // 酒盖
    private String jiuTieZhi; //贴纸

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJiuPing() {
        return jiuPing;
    }

    public void setJiuPing(String jiuPing) {
        this.jiuPing = jiuPing;
    }

    public String getJiuShui() {
        return jiuShui;
    }

    public void setJiuShui(String jiuShui) {
        this.jiuShui = jiuShui;
    }

    public String getJiuGai() {
        return jiuGai;
    }

    public void setJiuGai(String jiuGai) {
        this.jiuGai = jiuGai;
    }

    public String getJiuTieZhi() {
        return jiuTieZhi;
    }

    public void setJiuTieZhi(String jiuTieZhi) {
        this.jiuTieZhi = jiuTieZhi;
    }

    @Override
    public void outJiu() {
        StringBuffer sbf = new StringBuffer(getJiuTieZhi())
                .append(getJiuPing())
                .append(getJiuGai())
                .append(getJiuShui())
                .append(getName());
        System.out.println(sbf.toString());
    }
}
