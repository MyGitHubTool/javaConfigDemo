package com.ctban.swallow.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author GuoJie 2018/7/2 15:26
 */
public class UserDTO implements Serializable {
    /**
     * 用户ID（主键）
     */
    private String userId;

    /**
     * 用户账号（手机号码）
     */
    private String loginAccount;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 登录密码(MD5加密)
     */
    private String loginPwd;

    /**
     * 用户状态（1：在职，0：离职）
     */
    private Integer userStatus;

    /**
     * 来源
     */
    private Integer comeFrom;

    /**
     * 注册IP
     */
    private String userIp;

    /**
     * 是否服务用户（1：是：0：否），默认0
     */
    private Integer isMember;

    /**
     * 是否内部员工（1：是：0：否），默认0
     */
    private Integer isInterior;

    /**
     * 是否显示（1：显示，0：隐藏）
     */
    private Integer visibility;

    /**
     * APP登录（1：启用，0：禁用）
     */
    private Integer app;

    /**
     * 后台登录（1：启用，0：禁用）
     */
    private Integer sap;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 登录时间
     */
    private Date loginTime;

    /**
     * 锁定时间，单位：小时
     */
    private Integer lockTime;

    /**
     * 开始时间
     */
    private Date beginTime;

    /**
     * 结束时间
     */
    private Date endTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(Integer comeFrom) {
        this.comeFrom = comeFrom;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public Integer getIsMember() {
        return isMember;
    }

    public void setIsMember(Integer isMember) {
        this.isMember = isMember;
    }

    public Integer getIsInterior() {
        return isInterior;
    }

    public void setIsInterior(Integer isInterior) {
        this.isInterior = isInterior;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Integer getApp() {
        return app;
    }

    public void setApp(Integer app) {
        this.app = app;
    }

    public Integer getSap() {
        return sap;
    }

    public void setSap(Integer sap) {
        this.sap = sap;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getLockTime() {
        return lockTime;
    }

    public void setLockTime(Integer lockTime) {
        this.lockTime = lockTime;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
