package com.brasilidade.employees;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity
public class Employee {
    @Id
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    private int id;
    private String name;
    private String job;
    private LocalDate employee_since;
    @Transient
    private int monthsOfWork;
    public Employee(String name, String job, LocalDate employee_since) {
        setName(name);
        setJob(job);
        setEmployee_since(employee_since);
    }

    public Employee() {

    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public LocalDate getEmployee_since() {
        return employee_since;
    }

    public void setEmployee_since(LocalDate employee_since) {
        this.employee_since = employee_since;
    }

    public int getMonthsOfWork() {
        return (int) Period.between(this.employee_since, LocalDate.now()).toTotalMonths();
    }

    public void setMonthsOfWork(int monthsOfWork) {
        this.monthsOfWork = monthsOfWork;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", employee_since=" + employee_since +
                ", monthsOfWork=" + monthsOfWork +
                '}';
    }
}
