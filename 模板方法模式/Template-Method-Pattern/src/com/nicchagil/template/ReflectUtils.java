package com.nicchagil.template;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射工具类
 */
public class ReflectUtils {
	
	public static Method getMethod(Class clazz, String name, Class<?>... parameterTypes) {
		try {
			return clazz.getDeclaredMethod(name, parameterTypes);
		} catch (NoSuchMethodException | SecurityException e) {
			throw new RuntimeException("无此方法");
		}
	}
	
	public static Object invoke(Method m, Object obj, Object... args) {
		try {
			return m.invoke(obj, args);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			throw new RuntimeException("方法调用异常");
		}
	}

}
