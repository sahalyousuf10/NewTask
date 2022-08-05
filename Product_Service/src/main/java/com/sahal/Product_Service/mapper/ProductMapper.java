package com.sahal.Product_Service.mapper;

import com.sahal.Product_Service.dto.ProductDto;
import com.sahal.Product_Service.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductDto entityToDto(Product product);
    Product dtoToEntity(ProductDto productDto);
    List<ProductDto> entityToDto(List<Product> productList);
    List<Product> dtoToEntity(List<ProductDto> productDtoList);
}
