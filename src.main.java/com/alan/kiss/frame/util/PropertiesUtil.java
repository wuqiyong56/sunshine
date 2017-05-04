package com.alan.kiss.frame.util;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;

import com.szkingdom.frame.config.CustomizedPropertyPlaceholderConfigurer;

/**
 * 用于获取从配置文件中读取的信息
 * 
 * @author HX
 *
 */
public final class PropertiesUtil {
	/**
	 * 是否允许同时认领多笔业务进行审批
	 */
	public static final boolean CLAIM_MULTI;

	/**
	 * 对数据进行转换
	 */
	static {
		String claimMulti = ObjectUtils.toString(CustomizedPropertyPlaceholderConfigurer.getContextProperty("claim.multi"));
		CLAIM_MULTI = StringUtils.equalsIgnoreCase("true", claimMulti);
	}

	/**
	 * 防止实例化该类对象
	 */
	private PropertiesUtil() {
	}
}
