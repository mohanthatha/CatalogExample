package com.mohan.category.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sale {

    private long productId;
    private long  leafCategoryId;
    private long primaryCategoryId;
    private int  amount;
    private int quantity;


}
