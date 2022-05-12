package com.example.myownstripeapplication.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * Author: Zhanarbek Abdurasulov
 * Date: 12/5/22
 */
@Data
public class CreatePayment {

    private double amount;
    private String currency;
}
