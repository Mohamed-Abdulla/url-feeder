package com.system.design.urlfeederservice.resources;

import com.system.design.urlfeederservice.model.URL;
import com.system.design.urlfeederservice.service.URLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

import static com.system.design.urlfeederservice.common.Constants.URL_UUID_PREFIX;

@RestController
public class URLResources {

    @Autowired
    private URLService urlService;
    @GetMapping("/ping")
    public  String ping(){
        return "pong";
    }

    @PostMapping
    public ResponseEntity<Void> submitURL(@RequestBody URL url){
        url.setId(URL_UUID_PREFIX+UUID.randomUUID().toString());
        urlService.save(url);
        return ResponseEntity.ok().build();
    }
}
