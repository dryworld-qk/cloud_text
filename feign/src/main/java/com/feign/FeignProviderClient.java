package com.feign;

import com.entity.Student;
import com.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "prvoider",fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/stundent/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/index")
    public String index();
}
