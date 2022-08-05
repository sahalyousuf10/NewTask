package com.sahal.Vendor_Service.controller.VendorController;

import com.sahal.Vendor_Service.dto.ProductDto;
import com.sahal.Vendor_Service.service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VendorController {

    @Autowired
    private VendorService vendorService;

    @PostMapping(value = "/product")
    public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto){
        ProductDto createdProduct = vendorService.createProduct(productDto);
        return ResponseEntity.ok(createdProduct);
    }

    @GetMapping(value = "/product")
    public ResponseEntity<List<ProductDto>> getAllProducts(){
        List<ProductDto> productList = vendorService.getAllProducts();
        return ResponseEntity.ok(productList);
    }
}
