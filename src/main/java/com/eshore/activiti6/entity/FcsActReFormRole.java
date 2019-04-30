package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActReFormRole {

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
	 * 表单编码
	 */
	private String formCode;

	/**
	 * 控件编码
	 */
	private String formFieldCode;

	/**
	 * 可见 1可见，0不可见
	 */
	private String visible;

	/**
	 * 可写 1可见，0不可见
	 */
	private String write;

	/**
	 * 必填 1可见，0不可见
	 */
	private String require;

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
