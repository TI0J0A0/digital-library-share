package com.digital.library.share.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HealthCheckController {
  @GetMapping("/actuator/health")
  public Map<String, String> health() {
    return Map.of("status", "UP");
  }
}
