package com.company.aspect;

/**
 * Created by SERGE on 25.09.2014.
 */
public class UserAspect {

    public void before(){
        System.out.println("Aspect before");
    }

    public void after(){
        System.out.println("aspect after");
    }
}
