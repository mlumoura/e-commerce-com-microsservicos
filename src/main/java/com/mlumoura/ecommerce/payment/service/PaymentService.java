package com.mlumoura.ecommerce.payment.service;

import com.mlumoura.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.mlumoura.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
