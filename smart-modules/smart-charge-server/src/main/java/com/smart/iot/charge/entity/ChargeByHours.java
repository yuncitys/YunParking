package com.smart.iot.charge.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;


/**
 * 收费规则表
 *
 * @author Mr.AG
 * @email
 * @date 2018-08-30 10:23:50
 */
@Table(name = "charge_by_hours")
public class ChargeByHours implements Serializable {
	private static final long serialVersionUID = 1L;

	    //主键id(室内停车收费规则)
    @Id
    private String lrId;

	//免费时间
	@Column(name = "free_time")
	private String freeTime;

	    //白天开始时间
    @Column(name = "first_start_time")
    private String firstStartTime;

	    //白天结束时间
    @Column(name = "first_end_time")
    private String firstEndTime;

	    //白天收费时间
    @Column(name = "first_hours")
    private String firstHours;

	    //白天首次收费
    @Column(name = "first_price")
    private BigDecimal firstPrice;

	    //白天首次后收费价格
    @Column(name = "first_hours_price")
    private BigDecimal firstHoursPrice;

	    //夜间结束时间
    @Column(name = "od_end_time")
    private String odEndTime;

	    //夜间收费价格
    @Column(name = "od_last_price")
    private BigDecimal odLastPrice;

	    //夜间开始时间
    @Column(name = "od_start_time")
    private String odStartTime;

	    //停车场id
    @Column(name = "parking_id")
    private String parkingId;

	    //非工作日首次收费价格
    @Column(name = "td_price")
    private BigDecimal tdPrice;

	    //首次收费时间
    @Column(name = "td_hours")
    private String tdHours;

	    //首次收费后价格
    @Column(name = "td_hours_price")
    private String tdHoursPrice;

	    //月卡开启标志(y:开启；n：关闭)
    @Column(name = "open_flag")
    private String openFlag;

	    //月卡收费规则
    @Column(name = "months_card_price")
    private BigDecimal monthsCardPrice;

	    //字典car_type，区分大车小车
    @Column(name = "car_type")
    private String carType;

	    //有效标志(y:有效；n：无效)
    @Column(name = "enabled_flag")
    private String enabledFlag;

	    //创建时间
    @Column(name = "crt_time")
    private Date crtTime;

	    //创建人id
    @Column(name = "crt_user")
    private String crtUser;

	    //创建人
    @Column(name = "crt_name")
    private String crtName;

	    //创建主机
    @Column(name = "crt_host")
    private String crtHost;

	    //最后更新时间
    @Column(name = "upd_time")
    private Date updTime;

	    //最后更新人id
    @Column(name = "upd_user")
    private String updUser;

	    //最后更新人
    @Column(name = "upd_name")
    private String updName;

	    //最后更新主机
    @Column(name = "upd_host")
    private String updHost;

	    //
    @Column(name = "attr1")
    private String attr1;

	    //
    @Column(name = "attr2")
    private String attr2;

	    //
    @Column(name = "attr3")
    private String attr3;

	    //
    @Column(name = "attr4")
    private String attr4;

	    //
    @Column(name = "attr5")
    private String attr5;

	    //
    @Column(name = "attr6")
    private String attr6;

	    //
    @Column(name = "attr7")
    private String attr7;

	    //
    @Column(name = "attr8")
    private String attr8;

	    //租户id
    @Column(name = "tenant_id")
    private String tenantId;

	    //
    @Column(name = "crt_user_id")
    private String crtUserId;


	/**
	 * 设置：主键id(室内停车收费规则)
	 */
	public void setLrId(String lrId) {
		this.lrId = lrId;
	}
	/**
	 * 获取：主键id(室内停车收费规则)
	 */
	public String getLrId() {
		return lrId;
	}

	public String getFreeTime() {
		return freeTime;
	}

	public void setFreeTime(String freeTime) {
		this.freeTime = freeTime;
	}

	/**
	 * 设置：白天开始时间
	 */
	public void setFirstStartTime(String firstStartTime) {
		this.firstStartTime = firstStartTime;
	}
	/**
	 * 获取：白天开始时间
	 */
	public String getFirstStartTime() {
		return firstStartTime;
	}
	/**
	 * 设置：白天结束时间
	 */
	public void setFirstEndTime(String firstEndTime) {
		this.firstEndTime = firstEndTime;
	}
	/**
	 * 获取：白天结束时间
	 */
	public String getFirstEndTime() {
		return firstEndTime;
	}
	/**
	 * 设置：白天收费时间
	 */
	public void setFirstHours(String firstHours) {
		this.firstHours = firstHours;
	}
	/**
	 * 获取：白天收费时间
	 */
	public String getFirstHours() {
		return firstHours;
	}
	/**
	 * 设置：白天首次收费
	 */
	public void setFirstPrice(BigDecimal firstPrice) {
		this.firstPrice = firstPrice;
	}
	/**
	 * 获取：白天首次收费
	 */
	public BigDecimal getFirstPrice() {
		return firstPrice;
	}
	/**
	 * 设置：白天首次后收费价格
	 */
	public void setFirstHoursPrice(BigDecimal firstHoursPrice) {
		this.firstHoursPrice = firstHoursPrice;
	}
	/**
	 * 获取：白天首次后收费价格
	 */
	public BigDecimal getFirstHoursPrice() {
		return firstHoursPrice;
	}
	/**
	 * 设置：夜间结束时间
	 */
	public void setOdEndTime(String odEndTime) {
		this.odEndTime = odEndTime;
	}
	/**
	 * 获取：夜间结束时间
	 */
	public String getOdEndTime() {
		return odEndTime;
	}
	/**
	 * 设置：夜间收费价格
	 */
	public void setOdLastPrice(BigDecimal odLastPrice) {
		this.odLastPrice = odLastPrice;
	}
	/**
	 * 获取：夜间收费价格
	 */
	public BigDecimal getOdLastPrice() {
		return odLastPrice;
	}
	/**
	 * 设置：夜间开始时间
	 */
	public void setOdStartTime(String odStartTime) {
		this.odStartTime = odStartTime;
	}
	/**
	 * 获取：夜间开始时间
	 */
	public String getOdStartTime() {
		return odStartTime;
	}
	/**
	 * 设置：停车场id
	 */
	public void setParkingId(String parkingId) {
		this.parkingId = parkingId;
	}
	/**
	 * 获取：停车场id
	 */
	public String getParkingId() {
		return parkingId;
	}
	/**
	 * 设置：非工作日首次收费价格
	 */
	public void setTdPrice(BigDecimal tdPrice) {
		this.tdPrice = tdPrice;
	}
	/**
	 * 获取：非工作日首次收费价格
	 */
	public BigDecimal getTdPrice() {
		return tdPrice;
	}
	/**
	 * 设置：首次收费时间
	 */
	public void setTdHours(String tdHours) {
		this.tdHours = tdHours;
	}
	/**
	 * 获取：首次收费时间
	 */
	public String getTdHours() {
		return tdHours;
	}
	/**
	 * 设置：首次收费后价格
	 */
	public void setTdHoursPrice(String tdHoursPrice) {
		this.tdHoursPrice = tdHoursPrice;
	}
	/**
	 * 获取：首次收费后价格
	 */
	public String getTdHoursPrice() {
		return tdHoursPrice;
	}
	/**
	 * 设置：月卡开启标志(y:开启；n：关闭)
	 */
	public void setOpenFlag(String openFlag) {
		this.openFlag = openFlag;
	}
	/**
	 * 获取：月卡开启标志(y:开启；n：关闭)
	 */
	public String getOpenFlag() {
		return openFlag;
	}
	/**
	 * 设置：月卡收费规则
	 */
	public void setMonthsCardPrice(BigDecimal monthsCardPrice) {
		this.monthsCardPrice = monthsCardPrice;
	}
	/**
	 * 获取：月卡收费规则
	 */
	public BigDecimal getMonthsCardPrice() {
		return monthsCardPrice;
	}
	/**
	 * 设置：字典car_type，区分大车小车
	 */
	public void setCarType(String carType) {
		this.carType = carType;
	}
	/**
	 * 获取：字典car_type，区分大车小车
	 */
	public String getCarType() {
		return carType;
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
	/**
	 * 设置：租户id
	 */
	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}
	/**
	 * 获取：租户id
	 */
	public String getTenantId() {
		return tenantId;
	}
	/**
	 * 设置：
	 */
	public void setCrtUserId(String crtUserId) {
		this.crtUserId = crtUserId;
	}
	/**
	 * 获取：
	 */
	public String getCrtUserId() {
		return crtUserId;
	}
}
