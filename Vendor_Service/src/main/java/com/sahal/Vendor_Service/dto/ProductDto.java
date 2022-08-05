package com.sahal.Vendor_Service.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private long productId;
    private String productName;
    private long productPrice;
    private ErrorDto errors;
}
