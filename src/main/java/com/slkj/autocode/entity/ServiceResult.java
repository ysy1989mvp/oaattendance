package com.slkj.autocode.entity;
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

//package com.shenglankeji.arilner.service;
//
//import com.fasterxml.jackson.annotation.JsonAnyGetter;
//import com.fasterxml.jackson.annotation.JsonAnySetter;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;
//import org.apache.commons.lang.builder.ToStringBuilder;
//import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @author sy06
 *
 * @param <T>
 */
//@JsonSerialize(
//        include = JsonSerialize.Inclusion.NON_EMPTY
//)
public final class ServiceResult<T> implements Serializable {
    private static final long serialVersionUID = 6977558218691386450L;
    private boolean succeed = true;
    private int code = -1;
    private String msg;
    private T data;
    private Map<String, Object> additionalProperties = new HashMap();

    public ServiceResult() {
    }

    public ServiceResult(T data) {
        this.data = data;
    }

    public ServiceResult(boolean succeed, int code, String msg) {
        this.succeed = succeed;
        this.code = code;
        this.msg = msg;
    }

    public ServiceResult(boolean succeed, T data, String msg) {
        this.succeed = succeed;
        this.data = data;
        this.msg = msg;
    }

    public ServiceResult(boolean succeed, T data, int code, String msg) {
        this.succeed = succeed;
        this.data = data;
        this.code = code;
        this.msg = msg;
    }

    public ServiceResult(boolean succeed, String msg) {
        this.succeed = succeed;
        this.msg = msg;
    }

    public boolean isSucceed() {
        return this.succeed;
    }

    public void setSucceed(boolean succeed) {
        this.succeed = succeed;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

//    public String toString() {
//        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
//    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

//    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

//    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

//    @JsonAnyGetter
    public Object getAdditionalProperties(String name) {
        return this.additionalProperties.get(name);
    }
}
