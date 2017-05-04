package com.alan.kiss.frame.util;

import com.szkingdom.frame.service.model.GenericResult;

/**
 * 数据集处理
 */
public class ResultSetUtil {
	
	/**
	 * 校验集合是否为<b>null</b>
	 * @param resultSet 集合
	 * @return true-集合为<b>null</b>；false-<b>非null</b>
	 */
	public static boolean isNull(GenericResult resultSet) {
		return null == resultSet || null == resultSet.getDataList();
	}
	
	/**
	 * 校验集合是否为<b>null</b>
	 * @param resultSet 集合
	 * @return true-集合为<b>非null</b>；false-<b>null</b>
	 */
	public static boolean isNotNull(GenericResult resultSet) {
		return !isNull(resultSet); 
	}
	
	
	/**
	 * 校验GenericResult是否为空集合
	 * @param resultSet 结果集
	 * @return true-GenericResult为空集合；false-非空集合
	 */
	public static boolean isEmpty(GenericResult result) {
		return size(result) <= 0;
	}
	
	/**
	 * 校验GenericResult是否为非空集合
	 * @param resultSet 结果集
	 * @return true-GenericResult为非空集合；false-空集合
	 */
	public static boolean isNotEmpty(GenericResult result) {
		return !isEmpty(result);
	}
	
	/**
	 * 返回集合元素个数<br>
	 * 如果返回<b>-1</b>说明集合为<b>null</b><br>
	 * 如果元素个数超过<b>Integer.MAX_VALUE</b>则返回<b>Integer.MAX_VALUE</b>
	 * @param resultSet
	 * @return
	 */
	public static int size(GenericResult resultSet) {
		if (isNull(resultSet))
			return -1;
		
		return resultSet.getDataList().size();
	}
	
}
