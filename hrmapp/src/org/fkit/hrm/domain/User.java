package org.fkit.hrm.domain;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Pattern;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

/**   
 * @Description: 
 * <br>缃戠珯锛�<a href="http://www.fkit.org">鐤媯Java</a> 
 * @author 鑲栨枃鍚�	36750064@qq.com   
 * @version V1.0   
 */
public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;			// id
	private String username;	// 鐢ㄦ埛鍚�
	private String loginname;	// 鐧诲綍鍚�
	private String password;	// 瀵嗙爜
	
	@Pattern(regexp="/d",message="状态必须为整数")
	private Integer userstatus;		// 鐘舵��
	
	private Date createDate;	// 寤烘。鏃ユ湡
	// 鏃犲弬鏁版瀯閫犲櫒
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	// setter鍜実etter鏂规硶
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getUserstatus() {
		return userstatus;
	}
	public void setUserstatus(Integer userstatus) {
		this.userstatus = userstatus;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", loginname="
				+ loginname + ", password=" + password + ", userstatus=" + userstatus
				+ ", createDate=" + createDate + "]";
	}
	
	
}
