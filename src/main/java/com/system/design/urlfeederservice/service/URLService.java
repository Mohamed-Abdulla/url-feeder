package com.system.design.urlfeederservice.service;

import com.system.design.urlfeederservice.dao.URLRepository;
import com.system.design.urlfeederservice.model.URL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class URLService {

    @Autowired
    private URLRepository urlRepository;
    public void save(URL url){
        urlRepository.save(url);
    }
}
