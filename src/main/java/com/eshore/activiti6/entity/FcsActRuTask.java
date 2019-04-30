package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActRuTask {

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
	 * 待办任务ID
	 */
	private String taskId;

	/**
	 * 待办人
	 */
	private String assignee;

	/**
	 * 待办部门
	 */
	private String assigneeOrg;

	/**
	 * 待办角色
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
	 * 处理时限
	 */
	private Long limitTime;

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
