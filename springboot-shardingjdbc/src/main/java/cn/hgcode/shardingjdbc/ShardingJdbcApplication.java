package cn.hgcode.shardingjdbc;


import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ShardingJdbcApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ShardingJdbcApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
