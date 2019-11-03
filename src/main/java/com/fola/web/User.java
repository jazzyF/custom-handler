package com.fola.web;

import javax.validation.constraints.NotBlank;

public class User {
  @NotBlank(message = "Name is mandatory")
  private String name;
  private int id;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public User() {
  }

  public User(String name, int id) {
    this.name = name;
    this.id = id;
  }
}
