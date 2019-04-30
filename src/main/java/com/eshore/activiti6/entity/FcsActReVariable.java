package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActReVariable {

	private String id;

	/**
	 * 流程ID
	 */
	private String processId;

	/**
	 * 目标类型
	 */
	private String targetType;

	/**
	 * 目标ID
	 */
	private String targetId;

	/**
	 * 变量名
	 */
	private String name;

	/**
	 * 变量值
	 */
	private String val;

	/**
	 * 状态
	 */
	private String state;

	private Date createTime;

	private String createUserId;

	private Date updateTime;

	private String updateUserId;

}
