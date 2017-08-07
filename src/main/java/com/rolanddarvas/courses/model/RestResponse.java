package com.rolanddarvas.courses.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by darvasr on 2017. 08. 07., e-mail: darvas.roland@gmail.com
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestResponse<T> {

    private final boolean success;
    private final T result;

    public RestResponse(boolean success, T result) {
        this.success = success;
        this.result = result;
    }

    public boolean isSuccess(){
        return this.success;
    }

    public T getResult() {
        return this.result;
    }

    public static RestResponse ok() {
        return new RestResponse<>(true, null);
    }

    public static <T> RestResponse<T> ok(T result) {
        return new RestResponse<>(true, result);
    }

    public static RestResponse failure() {
        return new RestResponse<>(false, null);
    }
}
