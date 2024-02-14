package com.example.deliverypot.config.response;

import lombok.Getter;

@Getter
public enum BaseResponseStatus {
    /**
     * 1000 :요청 성공
     */
    SUCCESS(true, 1000, "요청에 성공하였습니다."),


    /**
     * 2000 : Request오류
     */

    /**
     * 1. 필수 입력값이 없을 때 (2000~)
     * EMPTY_도메인_목적어
     */
    // 계정관련(2000~)
    REQUEST_ERROR(false, 2000, "입력값을 확인해주세요."),
    EMPTY_JWT(false, 2001, "JWT를 입력해주세요."),
    EMPTY_JWT_CLAIMS(false, 2002, "JWT claims string이 비었습니다."),

    EMPTY_PASSWORD(false, 2003, "비밀번호를 입력해주세요."),
    EMPTY_EMAIL(false, 2004, "이메일을 입력해주세요.");

    private final boolean isSuccess;
    private final int code;
    private final String message;

    private BaseResponseStatus(boolean isSuccess, int code, String message){
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }
}

