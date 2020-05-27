package com.example.examine.pojo;

public class Result<T> {

    private boolean success;

    private T data;

    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> fail() {
        return fail(null);
    }

    public static <T> Result<T> success(T data) {
        return new Result(true, data);
    }


    public static <T> Result<T> fail(T message) {
        return new Result<T>(false, message);
    }

    private Result(boolean success, T data) {
        this.success =success;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
