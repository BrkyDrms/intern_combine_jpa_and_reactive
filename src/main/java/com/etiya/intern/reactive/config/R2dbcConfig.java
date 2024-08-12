package com.etiya.intern.reactive.config;

import com.etiya.intern.reactive.repository.UserReactiveRepository;
import com.etiya.intern.reactive.repository.impl.UserReactiveRepositoryImpl;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.core.R2dbcEntityOperations;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.r2dbc.core.DatabaseClient;

@Configuration
@EnableR2dbcRepositories(basePackages = "com.etiya.intern.reactive.repository")
@EntityScan(basePackages = "com.etiya.intern.reactive.entity")
public class R2dbcConfig {


    @Bean
    public R2dbcEntityTemplate r2dbcEntityTemplate(ConnectionFactory connectionFactory) {
        return new R2dbcEntityTemplate(connectionFactory);
    }

    @Bean
    public R2dbcEntityOperations r2dbcEntityOperations(ConnectionFactory connectionFactory) {
        DatabaseClient databaseClient = DatabaseClient.builder()
                .connectionFactory(connectionFactory)
                .build();
        return new R2dbcEntityTemplate((ConnectionFactory) databaseClient);
    }

    @Bean
    public UserReactiveRepository userReactiveRepository(R2dbcEntityOperations r2dbcEntityOperations) {
        return new UserReactiveRepositoryImpl(r2dbcEntityOperations);
    }


}
