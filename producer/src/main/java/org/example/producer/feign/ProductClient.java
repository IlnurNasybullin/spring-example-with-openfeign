package org.example.producer.feign;

import org.example.producer.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author Ilnur Nasybullin
 */
@FeignClient(name = "consumer", url = "localhost:9000", path = "/consumer/product")
public interface ProductClient {

    @RequestMapping(method = RequestMethod.POST)
    void sendProducts(@RequestBody List<ProductDto> products);
}
