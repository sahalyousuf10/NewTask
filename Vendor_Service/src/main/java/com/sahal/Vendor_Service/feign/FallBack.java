package com.sahal.Vendor_Service.feign;

import com.sahal.Vendor_Service.dto.ErrorDto;
import com.sahal.Vendor_Service.dto.ProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Component
public class FallBack implements ProductFeignService{

    @Override
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto){
        ErrorDto errors = new ErrorDto();
        errors.setMessage("Service not found");
        ProductDto product = new ProductDto();
        product.setErrors(errors);
        return ResponseEntity.ok(product);
    }

    @Override
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        ErrorDto errors = new ErrorDto();
        errors.setMessage("Service not found");
        List<ProductDto> productList = new ArrayList<>();
        ProductDto productDto = new ProductDto();
        productDto.setErrors(errors);
        productList.add(productDto);
        return ResponseEntity.ok(productList);
    }


}
