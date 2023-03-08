package com.atguigu.maven;

import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * @author : rsrmXJ
 * @create : 2023/3/7 18:23
 * @mail : rsrmxjaosid@gmail.com
 * @version: 1.0
 */
public class HelloTest {

    @Test
    public void testHello(){
        Hello hello = new Hello();
        String results = hello.sayHello("litingwei");
        assertEquals("Hello litingwei!",results);
    }

}
