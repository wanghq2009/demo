package com.example.demo.Repository;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Type;

public class EntityBasic {
    public <T, U extends Object> T getReturnType(U u) {
        Type type = EntityBasic.class.getMethods()[0].getGenericReturnType();
        System.out.println(type.toString());
        AnnotatedType atype = EntityBasic.class.getMethods()[0].getAnnotatedReturnType();
        System.out.println(atype.toString());
        Class<?> clazz = EntityBasic.class.getMethods()[0].getReturnType();
        System.out.println(type.toString());
        return null;
    }
}
