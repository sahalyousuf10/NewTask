package com.sahal.Vendor_Service.service;

import com.sahal.Vendor_Service.dto.ProductDto;
import com.sahal.Vendor_Service.feign.ProductFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService {

    @Autowired
    private ProductFeignService productFeignService;

    public ProductDto createProduct(ProductDto productDto) {
        ProductDto createdProduct = productFeignService.createProduct(productDto).getBody();
        return createdProduct;
    }

    public List<ProductDto> getAllProducts() {
        List<ProductDto> productDtoList = productFeignService.getAllProducts().getBody();
        return productDtoList;
    }
}
