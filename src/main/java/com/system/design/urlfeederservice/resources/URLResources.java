package com.system.design.urlfeederservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class URLResources {
    @GetMapping("/ping")
    public  String ping(){
        return "pong";
    }

    @PostMapping
    public ResponseEntity<Void> submitURL(@RequestBody UrlRequest url){
        System.out.println(url.getUrl());
        return ResponseEntity.ok().build();
    }

    public static class UrlRequest {
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
