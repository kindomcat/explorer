package com.explore.user.admin.entity;

import com.explorer.common.util.data.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * 系统用户表
 *
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2019-11-18 11:52:23
 */
@Data
@Table(name = "sys_user")
public class SysUser extends BaseEntity {
	private static final long serialVersionUID = 1L;

	/**
	 *
	 **/
    @Id
    private Integer id;

	/**
	 * 用户名
	 **/
    @Column(name = "username")
    private String username;

	/**
	 * 密码
	 **/
    @Column(name = "password")
    private String password;

	/**
	 * 姓名
	 **/
    @Column(name = "name")
    private String name;

	/**
	 * 手机
	 **/
    @Column(name = "phone")
    private String phone;

	/**
	 * 邮箱
	 **/
    @Column(name = "email")
    private String email;

	/**
	 * 性别
	 **/
    @Column(name = "sex")
    private Integer sex;

	/**
	 * 状态
	 **/
    @Column(name = "status")
    private Integer status;

	/**
	 * 描述
	 **/
    @Column(name = "description")
    private String description;


	public static final String ID = "id";

	public static final String USERNAME = "username";

	public static final String PASSWORD = "password";

	public static final String NAME = "name";

	public static final String PHONE = "phone";

	public static final String EMAIL = "email";

	public static final String SEX = "sex";

	public static final String STATUS = "status";

	public static final String DESCRIPTION = "description";


}
