package org.ljk.zodiac.cow.form.engine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("org.ljk.zodiac.cow.form.engine.mapper")
public class CowFormEngineApplication {

    public static void main(String[] args) {
        SpringApplication.run(CowFormEngineApplication.class, args);
    }
}
