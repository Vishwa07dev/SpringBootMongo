package com.upgrad.mongodemo.entities;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;


public class Customer {

  @Id
  private int customerId;

  private String firstName;

  private String lastName;

  private String username;

  private String password;

  private LocalDateTime dateOfBirth;

  public Customer() {

  }

  public Customer(int customerId, String firstName, String lastName, String username, String password,
      LocalDateTime dateOfBirth) {
    this.customerId = customerId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.username = username;
    this.password = password;
    this.dateOfBirth = dateOfBirth;
  }

  public int getCustomerId() {
    return customerId;
  }

  public void setCustomerId(int customerId) {
    this.customerId = customerId;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LocalDateTime getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(LocalDateTime dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  @Override
  public String toString() {
    return "Customer{" + "customerId=" + customerId + ", firstName='" + firstName + '\'' + ", lastName='" + lastName
        + '\'' + ", username='" + username + '\'' + ", password='" + password + '\'' + ", dateOfBirth=" + dateOfBirth
        + '}';
  }
}