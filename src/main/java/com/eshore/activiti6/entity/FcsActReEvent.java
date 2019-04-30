package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActReEvent {

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
	 * 事件类型 comm：通用 ，sql：SQL语句，http：http接口
	 */
	private String type;

	/**
	 * 事件内容
	 */
	private String content;

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
