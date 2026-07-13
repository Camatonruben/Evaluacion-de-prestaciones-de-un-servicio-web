package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class ServiceController {

    @GetMapping("/test")
    public Map<String, String> getPerformanceTest() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Petición procesada correctamente por el servidor web");
        response.put("timestamp", String.valueOf(System.currentTimeMillis()));
        return response;
    }
}