package com.nisum.productcatalog.service;

import com.nisum.productcatalog.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    public List<Product> getProductDetails() {
        return Arrays.asList(Product.builder().productId(UUID.randomUUID().toString())
                .productName("NisumProduct").build());
    }
}
