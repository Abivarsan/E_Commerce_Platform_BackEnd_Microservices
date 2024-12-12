package com.ecommerce.deliveryservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AcceptDeliveryDto {

    private String carrierId;
    private String orderNumber;

}
