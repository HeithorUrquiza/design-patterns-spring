package com.dio.lab_design_pattern.services;

import com.dio.lab_design_pattern.models.ClientAddress;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// Create a connection with API
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
//    Get request
    @GetMapping("/{cep}/json/")
    ClientAddress consultCep(@PathVariable("cep") String cep);
}