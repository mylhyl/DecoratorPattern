package com.example.decoratorpattern;

import com.example.decoratorpattern.demo.HKDecorator;
import com.example.decoratorpattern.demo.HaiZhuJiuJiuBuilder;
import com.example.decoratorpattern.demo.IJiu;
import com.example.decoratorpattern.demo.JiuBuilder;
import com.example.decoratorpattern.demo.JiuDecorator;
import com.example.decoratorpattern.demo.JiuDirector;

import org.junit.Test;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        JiuBuilder builder = new HaiZhuJiuJiuBuilder();
        JiuDirector jiuDirector = new JiuDirector(builder);
        // 香港
        JiuDecorator jiuDecorator = new HKDecorator(jiuDirector);
        jiuDecorator.decorator(); // 装饰
        IJiu jiu = builder.getResult();
        jiu.outJiu();
    }
}