package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActHiTask {

	private String id;

	/**
	 * 任务类型：1 , 智能表单内部流程， 2 独立流程
	 */
	private String type;

	/**
	 * 流程ID
	 */
	private String processId;

	/**
	 * 流程版本
	 */
	private Long processVersion;

	/**
	 * 流程任务ID
	 */
	private String taskId;

	/**
	 * 下一节点任务ID
	 */
	private String targetTaskId;

	/**
	 * 下一节点待办人
	 */
	private String assignee;

	/**
	 * 下一节点待办部门
	 */
	private String assigneeOrg;

	/**
	 * 下一节点待办角色
	 */
	private String assigneeRole;

	/**
	 * 表单数据ID(工单ID)
	 */
	private String woFormId;

	/**
	 * 表单编码（工单编码）
	 */
	private String woFormCode;

	/**
	 * 表单版本
	 */
	private Long woFormVersion;

	/**
	 * 进度
	 */
	private Long progress;

	/**
	 * 处理用时(工作日)
	 */
	private Long useTime;

	/**
	 * 处理人
	 */
	private String handleUser;

	/**
	 * 处理部门
	 */
	private String handleOrg;

	/**
	 * 审批表单ID
	 */
	private String approveFormId;

	/**
	 * 审批表单编码
	 */
	private String approveFormCode;

	/**
	 * 审批表单版本
	 */
	private Long approveFormVersion;

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
