package com.eshore.activiti6.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class FcsActReProcess implements Serializable {

	private static final long serialVersionUID = -8744474259565329486L;

	private String id;

	/**
	 * 流程名称
	 */
	private String name;

	/**
	 * 流程Key
	 */
	private String key;

	/**
	 * 流程版本
	 */
	private Long version;

	/**
	 * 流程部署ID
	 */
	private String deploymentId;

	/**
	 * 类型: fcs : 智能表单流程 、 app : 业务系统流程
	 */
	private String type;

	/**
	 * 状态:  0 ：未发布， 1 已发布
	 */
	private String state;

	private Date createTime;

	private String createUserId;

	private Date updateTime;

	private String updateUserId;

}
