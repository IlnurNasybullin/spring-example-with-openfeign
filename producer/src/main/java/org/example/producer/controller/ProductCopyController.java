package org.example.producer.controller;

import lombok.RequiredArgsConstructor;
import org.example.producer.dto.ProductDto;
import org.example.producer.service.ProductCopyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Ilnur Nasybullin
 */
@RestController
@RequestMapping("/product-copy")
@RequiredArgsConstructor
public class ProductCopyController {

    private final ProductCopyService service;

    @PatchMapping
    public List<ProductDto> copyProducts(@RequestBody List<Long> ids) {
        return service.copyProducts(ids);
    }

}
