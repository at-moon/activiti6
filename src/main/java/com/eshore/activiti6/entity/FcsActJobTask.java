package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActJobTask {

	private String id;

	/**
	 * 类型
	 */
	private String type;

	/**
	 * 流程ID
	 */
	private String processId;

	/**
	 * 流程版本
	 */
	private Long poocessVersion;

	/**
	 * 代办任务ID
	 */
	private String ruTaskId;

	/**
	 * 当前流程任务ID
	 */
	private String taskId;

	/**
	 * 目标流程任务ID
	 */
	private String targetTaskId;

	/**
	 * 表单编码
	 */
	private String formCode;

	/**
	 * 表单数据ID
	 */
	private String formDataId;

	/**
	 * 审批表单编码
	 */
	private String approveFormCode;

	/**
	 * 审批表单数据ID
	 */
	private String approveFormDataId;

	/**
	 * 处理人
	 */
	private String handleUser;

	/**
	 * 处理部门
	 */
	private String handleOrg;

	/**
	 * 指定待办人
	 */
	private String assignee;

	/**
	 * 指定待办部门
	 */
	private String assigneeOrg;

	/**
	 * 指定待办角色
	 */
	private String assigneeRole;

	/**
	 * 执行时间
	 */
	private Date runTime;

	/**
	 * 异常次数
	 */
	private Long err;

	/**
	 * 异常原因
	 */
	private String errMsg;

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
