package com.sahal.Vendor_Service.feign;

import com.sahal.Vendor_Service.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(
        name = "product-api",
        url = "http://localhost:8099",
        fallback = FallBack.class)
public interface ProductFeignService {

    @PostMapping("/product")
    ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto);

    @GetMapping("/products")
    ResponseEntity<List<ProductDto>> getAllProducts();
}
