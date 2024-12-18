package com.qkrtkdwns3410.mysqlnormalvsfulltextscan;

import org.springframework.boot.SpringApplication;

public class TestMysqlNormalVsFulltextScanApplication {
    
    public static void main(String[] args) {
        SpringApplication.from(MysqlNormalVsFulltextScanApplication::main).with(TestcontainersConfiguration.class).run(args);
    }
    
}
