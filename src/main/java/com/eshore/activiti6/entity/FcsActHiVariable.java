package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActHiVariable {

	private String id;

	/**
	 * 已办任务ID
	 */
	private String hiTaskId;

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

	/**
	 * 添加时间
	 */
	private Date createTime;

	/**
	 * 添加人ID
	 */
	private String createUserId;

	/**
	 * 最后修改时间
	 */
	private Date updateTime;

	/**
	 * 最后修改人ID
	 */
	private String updateUserId;

}
