package com.example.pharmacy.model;

import jakarta.persistence.*;

@Entity
public class Medicine {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private int stock;
  private double price;

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public int getStock() { return stock; }
  public void setStock(int stock) { this.stock = stock; }

  public double getPrice() { return price; }
  public void setPrice(double price) { this.price = price; }
}
