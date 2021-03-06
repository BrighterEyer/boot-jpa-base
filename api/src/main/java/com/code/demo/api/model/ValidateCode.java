package com.code.demo.api.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ValidateCode {

    private String code;

    private LocalDateTime expireTime;

    public ValidateCode(String code, int expireIn){
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public boolean isExpried() {
        return LocalDateTime.now().isAfter(getExpireTime());
    }

    public ValidateCode(String code, LocalDateTime expireTime) {
        super();
        this.code = code;
        this.expireTime = expireTime;
    }
}
