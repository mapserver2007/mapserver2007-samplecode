package jp.mapserver2007.sample;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
        // リフレクションで一気に実行
        Class<StreamApiSample> clazz = StreamApiSample.class;

        try {
            StreamApiSample instance = clazz.newInstance();

            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                // publicのみ実行
                if (Modifier.isPublic(method.getModifiers())) {
                    method.invoke(instance);
                }
            }
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }

}
