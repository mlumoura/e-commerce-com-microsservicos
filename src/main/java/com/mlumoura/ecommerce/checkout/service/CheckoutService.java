package com.mlumoura.ecommerce.checkout.service;

import com.mlumoura.ecommerce.checkout.entity.CheckoutEntity;
import com.mlumoura.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
