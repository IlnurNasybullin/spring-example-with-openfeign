package org.example.consumer.service;

import lombok.extern.slf4j.Slf4j;
import org.example.consumer.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ilnur Nasybullin
 */
@Service
@Slf4j
public class ProductService {

    public void saveProducts(List<ProductDto> products) {
        log.info("Products {} are got", products);
    }
}
