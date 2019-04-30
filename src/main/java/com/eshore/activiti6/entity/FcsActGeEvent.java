package com.eshore.activiti6.entity;

import java.util.Date;
import lombok.Data;

@Data
public class FcsActGeEvent {

	private String id;

	private String code;

	private String name;

	private String type;

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
