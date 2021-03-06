package com.greenfoxacademy.basicwebshop.models;

public class ShopItem {
  private String name;
  private String description;
  private double price;
  private int quantity;

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }


  public ShopItem(String name, String description, double price, int quantity) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }

}
