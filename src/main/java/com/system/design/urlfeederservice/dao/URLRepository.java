package com.system.design.urlfeederservice.dao;

import com.system.design.urlfeederservice.model.URL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface URLRepository extends JpaRepository<URL, String> {

}
