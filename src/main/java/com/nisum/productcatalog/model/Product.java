package com.nisum.productcatalog.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Product {
    private String productId;
    private String productName;
}
