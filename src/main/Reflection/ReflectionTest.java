package main.Reflection;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        User user = new User("Igor", 25);
        Class<User> userClass = User.class;
        System.out.println(userClass.getSuperclass());

        Class<? extends User> userClassO = user.getClass();
        System.out.println(userClass.equals(userClassO));
        Field field = userClass.getDeclaredField("pwd");
        field.setAccessible(true);
        System.out.println(field.get(user));
        field.set(user, "public");
        System.out.println(user.getPwd());
        Method method = userClass.getDeclaredMethod("purchase");
        System.out.println(method.getName());
        System.out.println(method.getReturnType());
        System.out.println(Arrays.toString(method.getDeclaredAnnotations()));
        method.invoke(user);
    }
}
