//package com.example.casestudyfullstack.config;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//import org.springframework.util.FileCopyUtils;
//
//import javax.annotation.PostConstruct;
//import java.io.InputStreamReader;
//
//@Component
//public class DatabaseInitializer {
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//
//    @PostConstruct
//    public void initializeDatabase() {
//        try {
//            ClassPathResource resource = new ClassPathResource("sql/nation.sql");
//            InputStreamReader reader = new InputStreamReader(resource.getInputStream());
//            String sqlScript = FileCopyUtils.copyToString(reader);
//
//            jdbcTemplate.execute(sqlScript);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}