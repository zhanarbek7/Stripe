package com.example.myownstripeapplication.web.controller;

import com.example.myownstripeapplication.dto.CreatePayment;
import com.example.myownstripeapplication.dto.CreatePaymentResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Zhanarbek Abdurasulov
 * Date: 12/5/22
 */
@RestController
public class PaymentController {

    private String pubKey = "pk_test_51KxqZnJNW48ppxohCUZXy9omYqgF6AFXqv9w0w7Ar4yTWtepKdXYy7Xn7j0sKXguJeUaRUcyeEwyaGjAvdyDbWp200MbIhld0m";

    static int calculateOrderAmount(Object[] items) {
        // Replace this constant with a calculation of the order's amount
        // Calculate the order total on the server to prevent
        // users from directly manipulating the amount on the client
        return 1400;
    }


    @PostMapping("create-payment-intent")
    public CreatePaymentResponse createPaymentIntent(
            @RequestBody CreatePayment createPayment) throws StripeException {

//            PaymentIntentCreateParams createParams = new PaymentIntentCreateParams.Builder()
//                    .setCurrency(createPayment.getCurrency())
//                    .setAmount((long) (createPayment.getAmount()*100L))
//                    .build();

        PaymentIntentCreateParams createParams = new PaymentIntentCreateParams.Builder()
                .setCurrency("usd")
                .setAmount(10*100L)
                .build();

            // Create a PaymentIntent with the order amount and currency
            PaymentIntent intent = PaymentIntent.create(createParams);

            return new CreatePaymentResponse(intent.getClientSecret());
//            return new CreatePaymentResponse(intent.getClientSecret(), pubKey);
    }

}
