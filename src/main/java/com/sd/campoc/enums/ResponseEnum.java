package com.sd.campoc.enums;

/*
 * @author    : irfan
 * @Date      : 22-May-17
 * @version   : ver. 1.0.0
 * 
 * ________________________________________________________________________________________________
 *
 *  Developer				Date		     Version		Operation		Description
 * ________________________________________________________________________________________________ 
 *	
 * 
 * ________________________________________________________________________________________________
 *
 * @Project   : BLCamPOC
 * @Package   : com.sd.campoc.enums
 * @FileName  : ResponseEnum
 *
 * Copyright © 
 * SolutionDots, 
 * All rights reserved.
 * 
 */

public enum ResponseEnum {

    DATA("DATA"),
    STATUS("STATUS"),
    REASON("REASON"),
    ERROR("ERROR"),
    SUCCESS("SUCCESS"),
    INFO("INFO"),
    NOT_FOUND("NOT_FOUND");

    private String value;

    ResponseEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
