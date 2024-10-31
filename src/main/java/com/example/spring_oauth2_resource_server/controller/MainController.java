package com.example.spring_oauth2_resource_server.controller;

import com.example.spring_oauth2_resource_server.dto.ResDTO;
import com.example.spring_oauth2_resource_server.dto.ResWrapper;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/me")
    public ResWrapper me() {
        ResDTO resDTO = new ResDTO();
        resDTO.setUsername(SecurityContextHolder.getContext().getAuthentication().getName());

        ResWrapper resWrapper = new ResWrapper();
        resWrapper.setResponse(resDTO);

        return resWrapper;
    }
}
