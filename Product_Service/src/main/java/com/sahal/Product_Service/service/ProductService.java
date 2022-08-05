package com.sahal.Product_Service.service;

import com.sahal.Product_Service.dto.ProductDto;
import com.sahal.Product_Service.mapper.ProductMapper;
import com.sahal.Product_Service.model.Product;
import com.sahal.Product_Service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    private final ExecutorService executor = Executors.newFixedThreadPool(3);
    public ProductDto createProduct(ProductDto productDto) {
        Product product = productMapper.dtoToEntity(productDto);
        Product createdProduct = productRepository.save(product);
        ProductDto createdProductDto = productMapper.entityToDto(createdProduct);
        return createdProductDto;
    }

    public List<ProductDto> getAllProducts() {
        List<Product> productList = productRepository.findAll();
        List<ProductDto> productDtoList = productMapper.entityToDto(productList);
        return  productDtoList;
    }
}
