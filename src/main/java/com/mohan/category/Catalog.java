package com.mohan.category;

import com.mohan.category.model.Category;
import com.mohan.category.model.Sale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Catalog {

    public void buildCategories() {
        List<Sale>sales = new ArrayList<>();
        Sale s1 = new Sale(1,1,1,10,3);
        Sale s2 = new Sale(2,1,2,30,5);
        Sale s3 = new Sale(3,2,3,50,6);
        Sale s4 = new Sale(4,2,4,120,8);
        sales.add(s1);
        sales.add(s2);
        sales.add(s3);
        sales.add(s4);
        List<Category> c = new ArrayList<>();
        Category c1 = new Category(1,"mohan", Arrays.asList(new Category(2,"java",null)),150,15);
        Category c2 = new Category(2,"vijay",Arrays.asList(new Category(3,"python",null)),300,18);
        Category c3 = new Category(3,"reddy",Arrays.asList(new Category(5,"react",null)),350,22);
        Category c4 = new Category(4,"sandeep",Arrays.asList(new Category(8,"javascript",null)),310,25);
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        Map<Long,Double> total =sales.stream().collect(Collectors.groupingBy(Sale::getLeafCategoryId,
                Collectors.summingDouble(s->s.getAmount())));
//        c.stream().filter(a->a.getTotalSales()<=300).forEach(System.out::println);
        System.out.println(total);
        Map<List<Category>,Double> cat= c.stream().collect(Collectors.groupingBy(Category::getChildren,
                Collectors.summingDouble(Category::getTotalSales)));

        System.out.println(cat);

    }

}
