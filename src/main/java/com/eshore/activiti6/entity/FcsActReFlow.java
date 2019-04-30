package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActReFlow {

	private String id;

	/**
	 * 流程定义ID
	 */
	private String processId;

	/**
	 * 来源任务ID
	 */
	private String sourceTaskId;

	/**
	 * 目标任务ID
	 */
	private String targetTaskId;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 编码
	 */
	private String code;

	/**
	 * 执行条件
	 */
	private String rule;

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

	private Date createTime;

	private String createUserId;

	private Date updateTime;

	private String updateUserId;

}
