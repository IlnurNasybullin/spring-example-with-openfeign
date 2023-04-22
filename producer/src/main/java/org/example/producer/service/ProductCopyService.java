package org.example.producer.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.producer.dto.ProductDto;
import org.example.producer.feign.ProductClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Ilnur Nasybullin
 */
@Service
@Slf4j
@AllArgsConstructor
public class ProductCopyService {

    private final ProductClient client;

    public List<ProductDto> copyProducts(List<Long> ids) {
        List<ProductDto> products = ids.stream()
            .map(id -> ProductDto
                    .builder()
                    .id(id)
                    .count(50L)
                    .price(100L)
                    .name(String.format("item-%d", id))
                    .build())
            .collect(Collectors.toList());

        client.sendProducts(products);
        log.info("Products are send!");
        return products;
    }
}
