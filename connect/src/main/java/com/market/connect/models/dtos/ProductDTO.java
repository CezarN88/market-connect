package com.market.connect.models.dtos;

import com.market.connect.models.entities.Customer;
import com.market.connect.models.entities.ProductCategory;
import lombok.Data;

import java.util.Map;

@Data
public class ProductDTO {


    private Long id;

    private String productName;

    private Map<Customer, Double> customerRatimgs;

    private Map<Customer, Double> customerReviews;

    private Double productPrice;

    private ProductCategory productCategory;

    private String productDescription;

}