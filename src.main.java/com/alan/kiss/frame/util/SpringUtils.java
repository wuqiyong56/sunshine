package com.alan.kiss.frame.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * 用于获取spring上下文的工具类，spring设置为单例
 * 
 * @author HX
 *
 */
public class SpringUtils implements ApplicationContextAware {

	/**
	 * spring 上下文
	 */
	private static ApplicationContext applicationContext;

	/**
	 * 使用此方法防止静态代码扫描报错<br>
	 * Write to static field from instance method<br>
	 * 
	 * @param appCtx Spring上下文
	 */
	private static void setApplicationContextStatic(final ApplicationContext appCtx) {
		SpringUtils.applicationContext = appCtx;
	}

	@Override
	public final void setApplicationContext(final ApplicationContext appCtx) {
		setApplicationContextStatic(appCtx);
	}

	/**
	 * 获取指定的SpringBean
	 * @param beanId Spring配置的beanId
	 * @return bean实例
	 */
	public static Object getBean(final String beanId) {
		return applicationContext.getBean(beanId);
	}

	/**
	 * 获取指定类型的SpringBean
	 * @param <T> 要获取的bean的类型
	 * @param beanId Spring配置的beanId
	 * @param beanClz T类型
	 * @return T类实例
	 */
	public static <T> T getBean(final String beanId, final Class<T> beanClz) {
		return applicationContext.getBean(beanId, beanClz);
	}

}
