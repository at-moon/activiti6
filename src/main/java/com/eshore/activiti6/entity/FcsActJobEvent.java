package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActJobEvent {

	private String id;

	/**
	 * 作业ID
	 */
	private String jobTaskId;

	/**
	 * 事件ID
	 */
	private String eventId;

	/**
	 * 事件类型
	 */
	private String eventType;

	/**
	 * 事件内容
	 */
	private String eventContent;

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
