package com.smart.iot.dev.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * 维修记录表
 *
 * @author yuncitys
 * @email yuncitys@smart.iot.com
 * @version 2022-07-08 09:28:51
 */
@ApiModel(value="维修记录表")
@Table(name = "dev_maintenance_records")
public class DevMaintenanceRecords implements Serializable {
	private static final long serialVersionUID = 1L;

	    //
    @Id
    @ApiModelProperty(value="id")
    private String id;

	    //设备id
    @ApiModelProperty(value="设备id")
    @Column(name = "dev_id")
    private String devId;

	    //所属停车场id
    @ApiModelProperty(value="所属停车场id")
    @Column(name = "parking_id")
    private String parkingId;

	    //设备安装时间
    @ApiModelProperty(value="设备安装时间")
    @Column(name = "inst_time")
    private Date instTime;

	    //有效标志(y:有效；n：无效)
    @ApiModelProperty(value="有效标志(y:有效；n：无效)")
    @Column(name = "enabled_flag")
    private String enabledFlag;

	    //创建时间
    @ApiModelProperty(value="创建时间")
    @Column(name = "crt_time")
    private Date crtTime;

	    //创建人id
    @ApiModelProperty(value="创建人id")
    @Column(name = "crt_user")
    private String crtUser;

	    //创建人
    @ApiModelProperty(value="创建人")
    @Column(name = "crt_name")
    private String crtName;

	    //创建主机
    @ApiModelProperty(value="创建主机")
    @Column(name = "crt_host")
    private String crtHost;

	    //最后更新时间
    @ApiModelProperty(value="最后更新时间")
    @Column(name = "upd_time")
    private Date updTime;

	    //最后更新人id
    @ApiModelProperty(value="最后更新人id")
    @Column(name = "upd_user")
    private String updUser;

	    //最后更新人
    @ApiModelProperty(value="最后更新人")
    @Column(name = "upd_name")
    private String updName;

	    //最后更新主机
    @ApiModelProperty(value="最后更新主机")
    @Column(name = "upd_host")
    private String updHost;

	    //
    @ApiModelProperty(value="")
    @Column(name = "attr1")
    private String attr1;

	    //
    @ApiModelProperty(value="")
    @Column(name = "attr2")
    private String attr2;

	    //
    @ApiModelProperty(value="")
    @Column(name = "attr3")
    private String attr3;

	    //
    @ApiModelProperty(value="")
    @Column(name = "attr4")
    private String attr4;

	    //
    @ApiModelProperty(value="")
    @Column(name = "attr5")
    private String attr5;

	    //
    @ApiModelProperty(value="")
    @Column(name = "attr6")
    private String attr6;

	    //
    @ApiModelProperty(value="")
    @Column(name = "attr7")
    private String attr7;

	    //
    @ApiModelProperty(value="")
    @Column(name = "attr8")
    private String attr8;


	/**
	 * 设置：
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：设备id
	 */
	public void setDevId(String devId) {
		this.devId = devId;
	}
	/**
	 * 获取：设备id
	 */
	public String getDevId() {
		return devId;
	}
	/**
	 * 设置：所属停车场id
	 */
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}
	/**
	 * 获取：所属停车场id
	 */
	public String getParkingId() {
		return parkingId;
	}
	/**
	 * 设置：设备安装时间
	 */
	public void setInstTime(Date instTime) {
		this.instTime = instTime;
	}
	/**
	 * 获取：设备安装时间
	 */
	public Date getInstTime() {
		return instTime;
	}
	/**
	 * 设置：有效标志(y:有效；n：无效)
	 */
	public void setEnabledFlag(String enabledFlag) {
		this.enabledFlag = enabledFlag;
	}
	/**
	 * 获取：有效标志(y:有效；n：无效)
	 */
	public String getEnabledFlag() {
		return enabledFlag;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCrtTime(Date crtTime) {
		this.crtTime = crtTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCrtTime() {
		return crtTime;
	}
	/**
	 * 设置：创建人id
	 */
	public void setCrtUser(String crtUser) {
		this.crtUser = crtUser;
	}
	/**
	 * 获取：创建人id
	 */
	public String getCrtUser() {
		return crtUser;
	}
	/**
	 * 设置：创建人
	 */
	public void setCrtName(String crtName) {
		this.crtName = crtName;
	}
	/**
	 * 获取：创建人
	 */
	public String getCrtName() {
		return crtName;
	}
	/**
	 * 设置：创建主机
	 */
	public void setCrtHost(String crtHost) {
		this.crtHost = crtHost;
	}
	/**
	 * 获取：创建主机
	 */
	public String getCrtHost() {
		return crtHost;
	}
	/**
	 * 设置：最后更新时间
	 */
	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}
	/**
	 * 获取：最后更新时间
	 */
	public Date getUpdTime() {
		return updTime;
	}
	/**
	 * 设置：最后更新人id
	 */
	public void setUpdUser(String updUser) {
		this.updUser = updUser;
	}
	/**
	 * 获取：最后更新人id
	 */
	public String getUpdUser() {
		return updUser;
	}
	/**
	 * 设置：最后更新人
	 */
	public void setUpdName(String updName) {
		this.updName = updName;
	}
	/**
	 * 获取：最后更新人
	 */
	public String getUpdName() {
		return updName;
	}
	/**
	 * 设置：最后更新主机
	 */
	public void setUpdHost(String updHost) {
		this.updHost = updHost;
	}
	/**
	 * 获取：最后更新主机
	 */
	public String getUpdHost() {
		return updHost;
	}
	/**
	 * 设置：
	 */
	public void setAttr1(String attr1) {
		this.attr1 = attr1;
	}
	/**
	 * 获取：
	 */
	public String getAttr1() {
		return attr1;
	}
	/**
	 * 设置：
	 */
	public void setAttr2(String attr2) {
		this.attr2 = attr2;
	}
	/**
	 * 获取：
	 */
	public String getAttr2() {
		return attr2;
	}
	/**
	 * 设置：
	 */
	public void setAttr3(String attr3) {
		this.attr3 = attr3;
	}
	/**
	 * 获取：
	 */
	public String getAttr3() {
		return attr3;
	}
	/**
	 * 设置：
	 */
	public void setAttr4(String attr4) {
		this.attr4 = attr4;
	}
	/**
	 * 获取：
	 */
	public String getAttr4() {
		return attr4;
	}
	/**
	 * 设置：
	 */
	public void setAttr5(String attr5) {
		this.attr5 = attr5;
	}
	/**
	 * 获取：
	 */
	public String getAttr5() {
		return attr5;
	}
	/**
	 * 设置：
	 */
	public void setAttr6(String attr6) {
		this.attr6 = attr6;
	}
	/**
	 * 获取：
	 */
	public String getAttr6() {
		return attr6;
	}
	/**
	 * 设置：
	 */
	public void setAttr7(String attr7) {
		this.attr7 = attr7;
	}
	/**
	 * 获取：
	 */
	public String getAttr7() {
		return attr7;
	}
	/**
	 * 设置：
	 */
	public void setAttr8(String attr8) {
		this.attr8 = attr8;
	}
	/**
	 * 获取：
	 */
	public String getAttr8() {
		return attr8;
	}
}
