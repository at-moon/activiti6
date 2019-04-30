package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActRuVariable {

	private String id;

	/**
	 * 代办任务ID
	 */
	private String ruTaskId;

	/**
	 * 参数名称
	 */
	private String name;

	/**
	 * 参数值
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
