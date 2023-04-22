package org.example.consumer.controller;

import lombok.RequiredArgsConstructor;
import org.example.consumer.dto.ProductDto;
import org.example.consumer.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ilnur Nasybullin
 */
@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProducts(@RequestBody List<ProductDto> products) {
        service.saveProducts(products);
    }

}
