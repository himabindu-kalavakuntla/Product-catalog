package com.nisum.productcatalog.controller;

import com.nisum.productcatalog.exception.CustomException;
import com.nisum.productcatalog.model.Product;
import com.nisum.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product-details")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public ResponseEntity<List<Product>> getProducts() throws CustomException {
        //throw new CustomException();
        return new ResponseEntity<>(productService.getProductDetails(), HttpStatus.OK);
    }
}
