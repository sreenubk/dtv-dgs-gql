package com.dtv.dgs.gql.dgs;

import java.util.List;
import java.util.stream.Collectors;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

import model.Product;

@DgsComponent
public class ProductFetcher {

    private final List<Product> products = List.of(
            new Product("1", "abcdef", "iPhone", "Smart phone from Apple"),
            new Product("2", "1234567", "galzxy", "Smart phone from Samsug"),
            new Product("1", "567890", "fiber", "Internet service from DTV"));

    @DgsQuery
    public List<Product> products(@InputArgument String id) {
        if (id == null)
            return products;
        return products.stream().filter(p -> p.getId().contains(id)).collect(Collectors.toList());
    }

}
