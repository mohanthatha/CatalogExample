package com.mohan.category.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Category {

	private long id;
	private String name;
	private List<Category> children;
	private long totalSales;
	private int totalQuantity;

	public Category(long id, String name, List<Category> children) {
		this.id = id;
		this.name = name;
		this.children = children;
	}
}
