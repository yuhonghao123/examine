package com.example.examine.pojo;

import java.util.Date;

public class UserPo {

    private int userId;

    private int roomId;

    private String username;

    private String password;

    private String mobile_numbers;

    private Date time;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile_numbers() {
        return mobile_numbers;
    }

    public void setMobile_numbers(String mobile_numbers) {
        this.mobile_numbers = mobile_numbers;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
