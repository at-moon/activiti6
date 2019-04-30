package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActReAssignee {

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
	 * 候选人部门, sql语句，列名包含：id，name
	 */
	private String department;

	/**
	 * 候选人角色, sql语句，列名包含：id，name
	 */
	private String role;

	/**
	 * 候选人, sql语句，列名包含：id，name
	 */
	private String user;

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
