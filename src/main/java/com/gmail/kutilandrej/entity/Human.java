package com.gmail.kutilandrej.entity;

public class Human {

  private int id;
  private String name;
  private long salary;
  private String surname;
  private String department;

  public Human() {}

  public Human(String name, String surname, String department, long salary) {
    this.name = name;
    this.surname = surname;
    this.department = department;
    this.salary = salary;
  }

  public Human(int id, String name, String surname, String department, long salary) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.department = department;
    this.salary = salary;;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public long getSalary() {
    return salary;
  }

  public void setSalary(long salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "Human{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", surname='" + surname + '\'' +
        ", department='" + department + '\'' +
        ", salary=" + salary +
        '}';
  }
}
