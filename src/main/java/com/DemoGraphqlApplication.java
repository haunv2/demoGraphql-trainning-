package com;

import graphql.schema.Coercing;
import graphql.schema.GraphQLScalarType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoGraphqlApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoGraphqlApplication.class, args);
    }

//    @Bean
//    GraphQLSchema schema() {
//        return GraphQLSchema.newSchema()
//                .query(GraphQLObjectType.newObject()
//                        .name("query")
//                        .field(field -> field
//                                .name("test")
//                                .type(Scalars.GraphQLString)
//                                .dataFetcher(environment -> "response")
//                        )
//                        .build())
//                .build();
//    }

}
