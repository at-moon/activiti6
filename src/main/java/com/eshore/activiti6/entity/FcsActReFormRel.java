package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActReFormRel {

	private String id;

	/**
	 * 流程ID
	 */
	private String processId;

	/**
	 * 目标ID
	 */
	private String targetId;

	/**
	 * 目标类型
	 */
	private String targetType;

	/**
	 * 类型： 1 流程表单，2，审批表单
	 */
	private String type;

	/**
	 * 表单编码
	 */
	private String formCode;

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
