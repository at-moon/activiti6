package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActReOperate {

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
	 * 代码
	 */
	private String code;

	/**
	 * 名称
	 */
	private String name;

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
