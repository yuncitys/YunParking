package com.yuncitys.smart.parking.common.constant;

/**
 * @author smart
 *@version 2022/1/14.
 */
public class RedisKeyConstants {
    public final static String USER_DEPART_PREFIX = "USER:DEPART";
    public final static String ZUUL_ROUTE_KEY = "ZUUL:ROUTE";
    public final static String USER_DISABLE = ":dis:";
    public final static String USER_ABLE = ":able:";
    public static final String REDIS_USER_PRI_KEY = "AUTH:JWT:PRI";
    public static final String REDIS_USER_PUB_KEY = "AUTH:JWT:PUB";
    public static final String REDIS_SERVICE_PRI_KEY = "AUTH:CLIENT:PRI";
    public static final String REDIS_SERVICE_PUB_KEY = "AUTH:CLIENT:PUB";
    public static final String REDIS_APP_USER_SMS_CODE_KEY = "APP:USER:SMS:CODE";
    public static final String REDIS_APP_USER_PWD_KEY = "APP:USER:PWD";
    public static final String REDIS_HTTP_RPC_COUNT_KEY="PARKING:IOT:HTTP:RPC:COUNT";

}
