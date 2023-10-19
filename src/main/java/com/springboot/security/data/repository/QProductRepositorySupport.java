package com.springboot.security.data.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.springboot.security.data.entity.Product;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.springboot.security.data.entity.QProduct.product;

@Repository
public class QProductRepositorySupport extends QuerydslRepositorySupport {

    private final JPAQueryFactory jpaQueryFactory;

    public QProductRepositorySupport(JPAQueryFactory jpaQueryFactory) {
        super(Product.class);
        this.jpaQueryFactory = jpaQueryFactory;
    }

    public List<Product> findByName(String name) {
        return jpaQueryFactory.selectFrom(product)
            .where(product.price.eq(500))
            .fetch();
    }

}

// Reference (https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/support/QuerydslRepositorySupport.html)