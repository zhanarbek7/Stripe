package com.example.myownstripeapplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Author: Zhanarbek Abdurasulov
 * Date: 12/5/22
 */
@Data
public class CreatePaymentResponse {

    private String clientSecret;
//    private String publishable_key;

    public CreatePaymentResponse(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
