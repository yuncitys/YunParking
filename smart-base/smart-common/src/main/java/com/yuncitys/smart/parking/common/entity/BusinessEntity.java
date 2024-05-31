package com.yuncitys.smart.parking.common.entity;

import lombok.Data;

import java.util.Date;

/**
 *
 * @author smart
 *@version 2022/1/13.
 */
@Data
public class BusinessEntity extends BaseEntity {
    private String crtUserId;
    private String crtUserName;
    private Date crtTime;

    private String updUserId;
    private String updUserName;
    private Date updTime;
}
