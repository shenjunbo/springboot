package com.mazhq.web.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author mazhq
 * @Title: UserAuthEntity
 * @ProjectName: zeus
 * @Description: TODO
 * @date 2019/7/30 16:41
 */
@Entity
@Data
@Table(name = "USER_AUTH", uniqueConstraints = {@UniqueConstraint(name = "USER_AUTH_PHONE", columnNames = {"PHONE"}),
@UniqueConstraint(name = "USER_AUTH_EMAIL", columnNames = {"EMAIL"})})
public class UserAuthEntity implements Serializable {
    private static final long serialVersionUID = 7230052310725727465L;
    @Id
    private Long userId;
    @Column(name = "PHONE", length = 16)
    private String phone;
    @Column(name = "EMAIL", length = 16)
    private String email;
    private String password;
    @Column(name = "REMARK",length = 16)
    private String remark;
    @Column(name = "ADD_DATE", nullable = false, columnDefinition = "datetime default now()")
    private Date addDate;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}
    
}
