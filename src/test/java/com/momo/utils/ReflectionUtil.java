package com.momo.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectionUtil {

    public static <T> T generateInstance(Class<T> clazz) {
        try {
            Constructor<T> declaredConstructor = clazz.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            return declaredConstructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> void setter(String fieldName, Object value, T ins) {
        try {
            Field field = ins.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(ins, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
