package com.sahal.Product_Service.mapper;

import com.sahal.Product_Service.dto.ProductDto;
import com.sahal.Product_Service.model.Product;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-05T23:18:42+0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18.0.1.1 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto entityToDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDto productDto = new ProductDto();

        productDto.setProductId( product.getProductId() );
        productDto.setProductName( product.getProductName() );
        productDto.setProductPrice( product.getProductPrice() );

        return productDto;
    }

    @Override
    public Product dtoToEntity(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductId( productDto.getProductId() );
        product.setProductName( productDto.getProductName() );
        product.setProductPrice( productDto.getProductPrice() );

        return product;
    }

    @Override
    public List<ProductDto> entityToDto(List<Product> productList) {
        if ( productList == null ) {
            return null;
        }

        List<ProductDto> list = new ArrayList<ProductDto>( productList.size() );
        for ( Product product : productList ) {
            list.add( entityToDto( product ) );
        }

        return list;
    }

    @Override
    public List<Product> dtoToEntity(List<ProductDto> productDtoList) {
        if ( productDtoList == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( productDtoList.size() );
        for ( ProductDto productDto : productDtoList ) {
            list.add( dtoToEntity( productDto ) );
        }

        return list;
    }
}
