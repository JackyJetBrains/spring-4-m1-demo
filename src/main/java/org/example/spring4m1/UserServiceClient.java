package org.example.spring4m1;

import lombok.Data;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "user-service", url = "http://localhost:8080")
public interface UserServiceClient {

    @GetMapping("/users/{id}")
    User getUserById(@PathVariable("id") Long id);
}

@Data
class User {
    private Long id;
    private String name;
}
